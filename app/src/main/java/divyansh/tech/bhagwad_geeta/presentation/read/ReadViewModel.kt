package divyansh.tech.bhagwad_geeta.presentation.read

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import divyansh.tech.bhagwad_geeta.models.verses.Slok
import divyansh.tech.bhagwad_geeta.domain.ChapterRepo
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/*
* [VIEWMODEL] for the Read Fragment
* */
@HiltViewModel
class ReadViewModel @Inject constructor(
    private val chapterRepo: ChapterRepo
): ViewModel() {

    private val _dailyContent: MutableLiveData<ResultWrapper<Slok>> = MutableLiveData()
    val dailyContent: LiveData<ResultWrapper<Slok>>
        get() = _dailyContent

    /*
    * Function to get the random daily content
    * */
    fun getDailyContent() = viewModelScope.launch(Dispatchers.IO) {
        _dailyContent.postValue(ResultWrapper.Loading())
        val response = chapterRepo.getRandomVerse()
        if (response.isSuccessful) {
            response.body()?.let {
                _dailyContent.postValue(ResultWrapper.Success(it))
            }
        } else _dailyContent.postValue(ResultWrapper.Error(response.message()))
    }
}
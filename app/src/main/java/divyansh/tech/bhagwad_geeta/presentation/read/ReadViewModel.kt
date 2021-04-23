package divyansh.tech.bhagwad_geeta.presentation.read

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import divyansh.tech.bhagwad_geeta.domain.chapter.ChapterRepo
import divyansh.tech.bhagwad_geeta.models.gson.chapter.ChapterItem
import divyansh.tech.bhagwad_geeta.models.gson.shlokas.Verses
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

    private val _dailyContent: MutableLiveData<ResultWrapper<Verses>> = MutableLiveData()
    val dailyContent: LiveData<ResultWrapper<Verses>>
        get() = _dailyContent

    private val _chapters: MutableLiveData<ResultWrapper<List<ChapterItem>>> = MutableLiveData()
    val chapters: LiveData<ResultWrapper<List<ChapterItem>>>
        get() = _chapters

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

    /*
    * Function ot get the chapters
    * */
    fun getChapters() = viewModelScope.launch(Dispatchers.IO) {
        _chapters.postValue(ResultWrapper.Loading())
        val response = chapterRepo.getAllChapters()
        Log.i("VIEWMODEL->READ", response.raw().toString())
        if (response.isSuccessful) {
            response.body()?.let {
                _chapters.postValue(ResultWrapper.Success(it))
                Log.i("VIEWMODEL", it[0].toString())
            }
        } else _chapters.postValue(ResultWrapper.Error(response.message()))
    }
}
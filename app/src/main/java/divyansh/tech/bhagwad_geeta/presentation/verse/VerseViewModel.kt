package divyansh.tech.bhagwad_geeta.presentation.verse

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import divyansh.tech.bhagwad_geeta.domain.chapter.ChapterRepo
import divyansh.tech.bhagwad_geeta.models.gson.shlokas.Verses
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VerseViewModel @Inject constructor(
    private val chapterRepo: ChapterRepo
): ViewModel() {

    private val _verse: MutableLiveData<ResultWrapper<Verses>> = MutableLiveData()
    val verse: LiveData<ResultWrapper<Verses>> = _verse

    fun getVerse(chapterId: Int, verseId: Int) = viewModelScope.launch(Dispatchers.IO) {
        _verse.postValue(ResultWrapper.Loading())
        val response = chapterRepo.getVerse(chapterId, verseId)
        Log.i("VIEWMODEL::VERSE", response.body().toString())
        if (response.isSuccessful) {
            response.body()?.let {
                _verse.postValue(ResultWrapper.Success(it))
            }
        } else _verse.postValue(ResultWrapper.Error(response.message()))
    }
}
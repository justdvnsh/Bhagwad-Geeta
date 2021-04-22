package divyansh.tech.bhagwad_geeta.presentation.chapter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import divyansh.tech.bhagwad_geeta.domain.chapter.ChapterRepo
import divyansh.tech.bhagwad_geeta.models.gson.chapter.ChapterItem
import divyansh.tech.bhagwad_geeta.utils.ResultWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChapterViewModel @Inject constructor(
    private val chapterRepo: ChapterRepo
): ViewModel(){

    private val _chapter: MutableLiveData<ResultWrapper<ChapterItem>> = MutableLiveData()
    val chapter: LiveData<ResultWrapper<ChapterItem>> = _chapter

    fun getChapter(chap_num: Int) = viewModelScope.launch(Dispatchers.IO) {
        _chapter.postValue(ResultWrapper.Loading())
        val response = chapterRepo.getChapter(chap_num)
        Log.i("VIEWMODEL:CHAPTER", response.body().toString())
        if (response.isSuccessful) {
            response.body()?.let {
                _chapter.postValue(ResultWrapper.Success(it))
            }
        } else _chapter.postValue(ResultWrapper.Error(response.message()))
    }
}
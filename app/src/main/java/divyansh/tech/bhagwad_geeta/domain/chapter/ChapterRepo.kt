package divyansh.tech.bhagwad_geeta.domain.chapter

import divyansh.tech.bhagwad_geeta.data.api.ChapterService
import javax.inject.Inject

/*
* Repository for getting the chapters and verses in gita
* */
class ChapterRepo @Inject constructor(
    private val chapterService: ChapterService
) {

    /*Function to get random verse*/
    suspend fun getRandomVerse() =
        chapterService.getRandomVerse()

    /*
    * Function to get all the chapters
    * */
    suspend fun getAllChapters() =
        chapterService.getAllChapters()

    /*
    * Function to get a particular verse based on the chapter
    * @param chap_num -> The chapter number
    * @param verse_num -> The verse number
    * */
    suspend fun getVerse(
        chap_num: Int,
        verse_num: Int
    ) = chapterService.getVerse(
            chap_num = chap_num,
            verse_num = verse_num
        )
}
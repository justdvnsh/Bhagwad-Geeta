package divyansh.tech.bhagwad_geeta.data.api

import divyansh.tech.bhagwad_geeta.models.gson.chapter.Chapter
import divyansh.tech.bhagwad_geeta.models.gson.chapter.ChapterItem
import divyansh.tech.bhagwad_geeta.models.gson.shlokas.Verses
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Part
import retrofit2.http.Path

/*
* interface to provide the responses related to the different chapters in Gita
* */
interface ChapterService {

    /*
    * get a random shlok (verse)
    * @returns Verse
    * */
    @GET("/gita")
    suspend fun getRandomVerse(): Response<Verses>

    /*
    * Gets all the chapters from gita
    * @returns List of chapters
    */
    @GET("/gita/chapters")
    suspend fun getAllChapters(): Response<Chapter>

    @GET("/gita/{chapNum}")
    suspend fun getChapter(
        @Path("chapNum") chap_num: Int
    ): Response<ChapterItem>

    /*
    * Get a particular chapter based on the chapter number
    * @param chap_num -> Int. THe chapter number (1-18)
    * @param verse_num -> Int. The verse number of that chapter
    * @returns Response<Verse>
    * */
    @GET("/gita/{chap}/{verse}")
    suspend fun getVerse(
        @Path("chap") chap_num: Int,
        @Path("verse") verse_num: Int
    ): Response<Verses>
}
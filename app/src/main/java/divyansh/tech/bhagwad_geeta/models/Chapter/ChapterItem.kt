package divyansh.tech.bhagwad_geeta.models.Chapter


import com.squareup.moshi.Json

data class ChapterItem(
    @Json(name = "chapter_number")
    val chapterNumber: Int, // 18
    @Json(name = "meaning")
    val meaning: Meaning,
    @Json(name = "name")
    val name: String, // मोक्षसंन्यासयोग
    @Json(name = "summary")
    val summary: Summary,
    @Json(name = "translation")
    val translation: String, // Moksha Sanyaas Yoga
    @Json(name = "transliteration")
    val transliteration: String, // Mokṣha Sanyās Yog
    @Json(name = "verses_count")
    val versesCount: Int // 78
)
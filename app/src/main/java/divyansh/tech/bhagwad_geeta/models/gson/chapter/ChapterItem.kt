package divyansh.tech.bhagwad_geeta.models.gson.chapter


import com.google.gson.annotations.SerializedName

data class ChapterItem(
    @SerializedName("chapter_number")
    val chapterNumber: Int, // 18
    @SerializedName("meaning")
    val meaning: Meaning,
    @SerializedName("name")
    val name: String, // मोक्षसंन्यासयोग
    @SerializedName("summary")
    val summary: Summary,
    @SerializedName("translation")
    val translation: String, // Moksha Sanyaas Yoga
    @SerializedName("transliteration")
    val transliteration: String, // Mokṣha Sanyās Yog
    @SerializedName("verses_count")
    val versesCount: Int // 78
)
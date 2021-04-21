package divyansh.tech.bhagwad_geeta.data.models.Chapter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Meaning(
    @Json(name = "en")
    val en: String, // Yoga through the Perfection of Renunciation and Surrender
    @Json(name = "hi")
    val hi: String // उपसंहार-संन्यास की सिद्धि
)
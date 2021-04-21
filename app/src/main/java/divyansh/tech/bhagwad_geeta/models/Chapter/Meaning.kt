package divyansh.tech.bhagwad_geeta.models.Chapter

import com.squareup.moshi.Json

data class Meaning(
    @Json(name = "en")
    val en: String, // Yoga through the Perfection of Renunciation and Surrender
    @Json(name = "hi")
    val hi: String // उपसंहार-संन्यास की सिद्धि
)
package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Adi(
    @Json(name = "author")
    val author: String, // Swami Adidevananda
    @Json(name = "et")
    val et: String // 1.2 Sanjaya said   King Duryodhana, on seeing the Pandava army in battle array, approached his teacher Drona and said these words:
)
package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Purohit(
    @Json(name = "author")
    val author: String, // Shri Purohit Swami
    @Json(name = "et")
    val et: String // 1.2 Sanjaya replied: "The Prince Duryodhana, when he saw the army of the Pandavas paraded, approached his preceptor Guru Drona and spoke as follows:
)
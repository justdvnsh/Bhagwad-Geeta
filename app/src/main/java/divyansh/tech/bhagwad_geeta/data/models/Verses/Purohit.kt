package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Purohit(
    @Json(name = "author")
    val author: String, // Shri Purohit Swami
    @Json(name = "et")
    val et: String // 1.2 Sanjaya replied: "The Prince Duryodhana, when he saw the army of the Pandavas paraded, approached his preceptor Guru Drona and spoke as follows:
)
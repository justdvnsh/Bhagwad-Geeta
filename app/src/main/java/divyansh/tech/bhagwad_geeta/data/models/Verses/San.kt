package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class San(
    @Json(name = "author")
    val author: String, // Dr.S.Sankaranarayan
    @Json(name = "et")
    val et: String // 1.2. Sanjaya said  Seeing the army of the sons of Pandu,  marshalled in the military array,  the prince Duryodhana approached the teacher (Drona) and spoke at that time,  these words:
)
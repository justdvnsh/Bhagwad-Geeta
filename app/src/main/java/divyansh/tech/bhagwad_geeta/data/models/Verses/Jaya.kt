package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Jaya(
    @Json(name = "author")
    val author: String, // Sri Jayatritha
    @Json(name = "sc")
    val sc: String // ।।1.2।।Sri Jayatirtha did not comment on this sloka. The commentary starts from 2.11.
)
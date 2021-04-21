package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Jaya(
    @Json(name = "author")
    val author: String, // Sri Jayatritha
    @Json(name = "sc")
    val sc: String // ।।1.2।।Sri Jayatirtha did not comment on this sloka. The commentary starts from 2.11.
)
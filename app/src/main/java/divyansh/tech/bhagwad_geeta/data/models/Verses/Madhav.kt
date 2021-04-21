package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Madhav(
    @Json(name = "author")
    val author: String, // Sri Madhavacharya
    @Json(name = "sc")
    val sc: String // ।।1.2।।Sri Madhvacharya  did not comment on this sloka. The commentary starts from 2.11.
)
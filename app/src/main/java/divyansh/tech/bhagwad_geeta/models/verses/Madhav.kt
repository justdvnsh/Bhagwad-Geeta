package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Madhav(
    @Json(name = "author")
    val author: String, // Sri Madhavacharya
    @Json(name = "sc")
    val sc: String // ।।1.2।।Sri Madhvacharya  did not comment on this sloka. The commentary starts from 2.11.
)
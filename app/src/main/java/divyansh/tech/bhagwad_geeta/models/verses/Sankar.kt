package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Sankar(
    @Json(name = "author")
    val author: String, // Sri Shankaracharya
    @Json(name = "et")
    val et: String, // 1.2 Sri Sankaracharya did not comment on this sloka. The commentary starts from 2.10.
    @Json(name = "ht")
    val ht: String, // ।।1.2।।Sri Sankaracharya did not comment on this sloka.
    @Json(name = "sc")
    val sc: String // 1.2 Sri Sankaracharya did not comment on this sloka. The commentary starts from 2.10.
)
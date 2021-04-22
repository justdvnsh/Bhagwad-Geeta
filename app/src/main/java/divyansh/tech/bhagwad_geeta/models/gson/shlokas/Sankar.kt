package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Sankar(
    @SerializedName("author")
    val author: String, // Sri Shankaracharya
    @SerializedName("et")
    val et: String, // 1.2 Sri Sankaracharya did not comment on this sloka. The commentary starts from 2.10.
    @SerializedName("ht")
    val ht: String, // ।।1.2।।Sri Sankaracharya did not comment on this sloka.
    @SerializedName("sc")
    val sc: String // 1.2 Sri Sankaracharya did not comment on this sloka. The commentary starts from 2.10.
)
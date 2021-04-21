package divyansh.tech.bhagwad_geeta.data.models.Verses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Neel(
    @Json(name = "author")
    val author: String, // Sri Neelkanth
    @Json(name = "sc")
    val sc: String // ।।1.2।।व्यूढं व्यूहरचनया स्थितम्। आचार्यं द्रोणम्। राजा दुर्योधनः। राजाब्रवीदित्येव सिद्धे वचनपदेन संक्षिप्तबह्वर्थत्वादिगुणवत्त्वं वाक्यस्य सूच्यते।
)
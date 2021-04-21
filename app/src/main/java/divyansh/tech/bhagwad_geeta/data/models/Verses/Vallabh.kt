package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Vallabh(
    @Json(name = "author")
    val author: String, // Sri Vallabhacharya
    @Json(name = "sc")
    val sc: String // ।।1.2  1.11।।दुर्योधनोऽपि वृकोदरादिभी रक्षितं पाण्डवानां बलं भीष्माभिरक्षितं स्वीयं च बलं विलोक्य आत्मजविजये तद्बलस्य पर्याप्ततां आत्मबलस्य तद्बिजयेऽपर्याप्ततां च आचार्ये निवेद्यान्तरेव विष्ण्णोऽभूत्।
)
package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Srid(
    @Json(name = "author")
    val author: String, // Sri Sridhara Swami
    @Json(name = "sc")
    val sc: String // ।।1.2।।   दृष्ट्वेति।  पाण्डवानामनीकं सैन्यं व्यूढं व्यूहरचनया व्यवस्थितं दृष्ट्वा द्रोणाचार्यसमीपं गत्वा राजा दुर्योधनो वक्ष्यमाणं वाक्यमुवाच।
)
package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Srid(
    @SerializedName("author")
    val author: String, // Sri Sridhara Swami
    @SerializedName("sc")
    val sc: String // ।।1.2।।   दृष्ट्वेति।  पाण्डवानामनीकं सैन्यं व्यूढं व्यूहरचनया व्यवस्थितं दृष्ट्वा द्रोणाचार्यसमीपं गत्वा राजा दुर्योधनो वक्ष्यमाणं वाक्यमुवाच।
)
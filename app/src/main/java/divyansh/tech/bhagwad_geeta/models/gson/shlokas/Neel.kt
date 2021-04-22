package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Neel(
    @SerializedName("author")
    val author: String, // Sri Neelkanth
    @SerializedName("sc")
    val sc: String // ।।1.2।।व्यूढं व्यूहरचनया स्थितम्। आचार्यं द्रोणम्। राजा दुर्योधनः। राजाब्रवीदित्येव सिद्धे वचनपदेन संक्षिप्तबह्वर्थत्वादिगुणवत्त्वं वाक्यस्य सूच्यते।
)
package divyansh.tech.bhagwad_geeta.domain.chapter.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import divyansh.tech.bhagwad_geeta.ItemViewVerseBindingModel_
import divyansh.tech.bhagwad_geeta.domain.VerseClickCallback
import divyansh.tech.bhagwad_geeta.models.gson.shlokas.Verses
import javax.inject.Inject

class VerseController @Inject constructor(
    private val verseClickCallback: VerseClickCallback
): TypedEpoxyController<List<Int>>() {
    override fun buildModels(data: List<Int>) {
        data.forEach {
            ItemViewVerseBindingModel_()
                .id("verse", it.toLong())
                .verseNum(it)
                .clickListener { v ->
                    verseClickCallback.onVerseClick(it)
                }
                .addTo(this)
        }
    }
}
package divyansh.tech.bhagwad_geeta.domain.chapter.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import divyansh.tech.bhagwad_geeta.ItemViewChapterBindingModel_
import divyansh.tech.bhagwad_geeta.domain.Callbacks
import divyansh.tech.bhagwad_geeta.models.gson.chapter.ChapterItem
import javax.inject.Inject

class ChapterController @Inject constructor(
        private val callbacks: Callbacks
): TypedEpoxyController<List<ChapterItem>>() {

    override fun buildModels(data: List<ChapterItem>) {
        data.forEach {
            ItemViewChapterBindingModel_()
                    .id(it.chapterNumber)
                    .chapter(it)
                    .clickListener { v->
                        callbacks.onChapterClicked(it.chapterNumber)
                    }
                    .addTo(this)
        }
    }
}
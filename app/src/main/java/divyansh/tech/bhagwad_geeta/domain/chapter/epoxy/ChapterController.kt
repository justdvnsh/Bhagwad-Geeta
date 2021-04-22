package divyansh.tech.bhagwad_geeta.domain.chapter.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import divyansh.tech.bhagwad_geeta.ItemViewChapterBindingModel_
import divyansh.tech.bhagwad_geeta.models.gson.chapter.ChapterItem

class ChapterController: TypedEpoxyController<List<ChapterItem>>() {

    override fun buildModels(data: List<ChapterItem>) {
        data.forEach {
            ItemViewChapterBindingModel_()
                    .id(it.chapterNumber)
                    .chapter(it)
                    .addTo(this)
        }
    }
}
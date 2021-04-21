package divyansh.tech.bhagwad_geeta.domain;

import android.annotation.SuppressLint;
import com.airbnb.epoxy.EpoxyDataBindingLayouts;
import com.airbnb.epoxy.PackageModelViewConfig;

import divyansh.tech.bhagwad_geeta.R;


@SuppressLint("NonConstantResourceId")
@PackageModelViewConfig(rClass = R.class)
@EpoxyDataBindingLayouts(R.layout.item_view_chapter)
interface EpoxyConfig {}
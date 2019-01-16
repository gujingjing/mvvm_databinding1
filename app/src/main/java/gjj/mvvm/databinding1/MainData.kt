package gjj.mvvm.databinding1

import android.databinding.ObservableField

/**
 * 作者：jingjinggu on 2019/1/15 10:40
 * 邮箱：jingjinggu@pptv.com
 */
class MainData {

    var name:ObservableField<String?>? = ObservableField("null-默认名称")

    var clickText:ObservableField<String?>? = ObservableField("clickText-点击测试")

}
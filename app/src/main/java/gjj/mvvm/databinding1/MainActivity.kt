package gjj.mvvm.databinding1

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import gjj.mvvm.databinding1.databinding.MainDataBind

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val mainBinding = DataBindingUtil.setContentView<MainDataBind>(this, R.layout.activity_main)
        //设置绑定数据
//        mainBinding.mainData=MainData()
        mainBinding.setVariable(BR.mainData,MainData())


    }
}

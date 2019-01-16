package gjj.mvvm.databinding1

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayMap
import android.databinding.ObservableMap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import gjj.mvvm.databinding1.databinding.MainDataBind


class MainActivity : AppCompatActivity() {

    var mainBinding:MainDataBind?=null
    val mainData by lazy {  ObservableArrayMap<String,Any?>() }
    val mainPresent by lazy {  MainPresent() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mainBinding = DataBindingUtil.setContentView<MainDataBind>(this, R.layout.activity_main)
        //设置绑定数据
//        mainBinding.mainData=MainData()
        mainBinding?.setVariable(BR.mainData,mainData)
        //设置事件数据
        mainBinding?.setVariable(BR.mainPresent,mainPresent)
    }


    inner class MainPresent {

        fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            mainData["clickText"] = s.toString()
        }

        fun onClick(view: View) {
            Toast.makeText(this@MainActivity, "点到了", Toast.LENGTH_SHORT).show()
        }

        fun onClickListenerBinding(mainData: ObservableMap<String,Any>) {
            Toast.makeText(this@MainActivity, mainData["clickText"]?.toString()?:"",
                    Toast.LENGTH_SHORT).show()
        }
    }
}


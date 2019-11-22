package com.duke.learnlib.learn1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.duke.learnlib.R

// import kotlinx.android.synthetic.main.＜布局＞.*
// 从 "main" 源集中使用 R.layout.activity_learn1_view_binding
import kotlinx.android.synthetic.main.activity_learn1_view_binding.*

/**
 * author: duke
 * version: 1.0
 * dateTime: 2019-11-22 09:28
 * description:
 *
 */
class ViewBindingActivity :AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn1_view_binding)

        // 代替 findViewById<TextView>(R.id.user_name_text_view)
        // 可以把 user_name_text_view 看作是 ViewBindingActivity 的扩展属性
        user_name_text_view.text = "test"

    }


}
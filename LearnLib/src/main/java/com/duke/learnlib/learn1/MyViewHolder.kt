package com.duke.learnlib.learn1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

/**
 * author: duke
 * version: 1.0
 * dateTime: 2019-11-22 09:53
 * description:
 *
 * 需要打开实验性标志 androidExtensions.experimental ，才能使用 LayoutContainer
 */
class MyViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    // 参考 NewRecyclerViewAdapter2

    fun setup(title: String) {

    }


}
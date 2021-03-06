package com.gfd.home.adapter

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import com.gfd.common.ui.adapter.BaseMultiAdapter
import com.gfd.common.ui.adapter.BaseViewHolder
import com.gfd.common.utils.ImageLoader
import com.gfd.home.R
import com.gfd.home.common.Concant
import com.gfd.home.entity.VideoItemData

/**
 * @Author : 郭富东
 * @Date ：2018/8/4 - 10:11
 * @Email：878749089@qq.com
 * @descriptio：
 */
class CategoryVideoAdapter(private var context: Context?) : BaseMultiAdapter<VideoItemData>(context) {



    init {
        addItemType(Concant.ITEM_TYPE_IMG,R.layout.home_item_home_video_list_img)
    }

    override fun onBindItemholder(holder: BaseViewHolder, position: Int) {
        val itemData = mDatas.get(position)
        bindImgItem(holder,itemData)

    }

    /**
     * 设置图片布局数据
     * @param holder BaseViewHolder
     * @param itemData VideoItemData
     */
    private fun bindImgItem(holder: BaseViewHolder, itemData: VideoItemData) {
        val ivVideo : ImageView = holder.getView(R.id.img_home_item_video)
        val tvName : TextView = holder.getView(R.id.tv_home_img_title)
        val tvVideoTag : TextView = holder.getView(R.id.tvVideoTag)
        tvName.text = itemData.videoName
        tvVideoTag.text = itemData.tagName
        ImageLoader.loadUrlImage(this!!.context!!,itemData.videoImg,ivVideo)
    }


}
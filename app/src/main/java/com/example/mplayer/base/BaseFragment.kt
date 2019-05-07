package com.example.mplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/*所有fragment的基类*/
abstract class BaseFragment : Fragment, AnkoLogger {
    constructor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /*初始化*/
    protected fun init() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return initView()
    }

    /*获取布局view*/
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /*数据初始化*/
    protected fun initData() {

    }

    /*与adapter、listener有关*/
    protected fun initListener() {

    }

    fun myToast(msg: String) {
        //不加问号会报错：Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Context?
        context?.runOnUiThread { toast(msg) }
    }

}
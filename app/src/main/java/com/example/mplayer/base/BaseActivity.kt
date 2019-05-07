package com.example.mplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.toast
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug

/*所有Activity的基类*/
abstract class BaseActivity : AppCompatActivity, AnkoLogger {

    // 必须有一个secondary constructor，否则会报This type has a constructor,and thus
    // must be initialized here的编译错误
    constructor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug { "哈哈" }
    }


    /*初始化数据*/
    protected fun initData() {

    }

    /*adapter listener*/
    protected fun initListener() {

    }

    /*获取布局ID*/
    abstract fun getLayoutId(): Int

    protected fun myToast(msg: String) {
        runOnUiThread { toast(msg) }
    }
}
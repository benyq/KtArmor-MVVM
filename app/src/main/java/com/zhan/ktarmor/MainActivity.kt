package com.zhan.ktarmor

import androidx.appcompat.app.AppCompatActivity
import com.zhan.ktarmor.account.LoginActivity
import com.zhan.ktarmor.account.RegisterActivity
import com.zhan.ktarmor.empty.EmptyActivity
import com.zhan.ktarmor.fragment.TestActivity
import com.zhan.ktarmor.superbar.SuperBarActivity
import com.zhan.ktwing.ext.startActivity
import com.zhan.mvvm.base.IActivity
import com.zhan.mvvm.widget.LoadingDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), IActivity {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        super.initView()

        btnEmpty.setOnClickListener {
            startActivity<EmptyActivity>()
        }

        btnLogin.setOnClickListener {
            startActivity<LoginActivity>()
        }

        btnRegister.setOnClickListener {
            startActivity<RegisterActivity>()
        }

        val mLoading = LoadingDialog.create(supportFragmentManager)
        btnLoading.setOnClickListener {
            mLoading.show()
        }

        btnHide.setOnClickListener {
            mLoading.hide()
        }

        btnItemView.setOnClickListener {
            startActivity<SuperBarActivity>()
        }

        btnArticle.setOnClickListener {
            //startActivity<ArticleActivity>()
        }

        btnCollect.setOnClickListener {
        }

        btnFragment.setOnClickListener {
            startActivity<TestActivity>()
        }
    }
}

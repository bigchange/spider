package com.bigchange.util

import com.bigchange.util.util.VerifyCode
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by C.J.YOU on 2016/5/9.
  */
class VerifyCodeTest extends FlatSpec with Matchers {

  it should "recognize png correctly" in {
    val file = "H:\\SmartData-X\\算法\\4.png"
    val result = VerifyCode.verify(file)
    println("result:"+ result)
  }

}

package com.bigchange.util

import com.bigchange.util.util.BloomFilter
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by C.J.YOU on 2016/5/11.
  */
class TestBloomFilter extends  FlatSpec with Matchers {

  it should "work" in {

    // BloomFilter.init()
    val url = "http://www.baidu.com"
    if(!BloomFilter.contain(url)){
      BloomFilter.add(url)
    }

    BloomFilter.contain(url) should be (true)
    BloomFilter.contain("http://www.sogou.com") should be (false)
  }

}

package com.bigchange.util.util

import java.util


/**
  * Created by C.J.YOU on 2016/5/11.
  * 布隆过滤器：主要用于过滤已有数据
  */
object BloomFilter {

  private  final val DEFAULT_SIZE = 2 << 24

  private  final val seeds = Array(7,11,12,31,37,61)

  private  val  bits = new util.BitSet(DEFAULT_SIZE)

  private  val  func = new Array[SimpleHash](seeds.length)

  // 初始化随机种子
  def init(): Unit = {
    for(i <- seeds.indices) {
      func(i) = new SimpleHash(DEFAULT_SIZE,seeds(i))
    }
  }
  // 添加没有的数据
  def add(value:String)= {
    for(i <- func.indices){
      bits.set(func(i).hash(value),true)
    }
  }

  // 判断是否包含value
  def contain(value:String) : Boolean = {
    if(value == null)
      return false

    var flag = true
    for(i <- func.indices){
      flag = flag && bits.get(func(i).hash(value))
    }
    flag
  }
}

class SimpleHash(cap:Int,seed:Int) {

  def hash(value:String): Int = {

    var result = 0
    val length = value.length
    for(i <- 0 until length) {
      result = seed * result + value.charAt(i)
    }
    (cap - 1 ) & result
  }
}

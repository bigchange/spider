package util

import java.io.File

import net.sourceforge.tess4j.Tesseract

/**
  * Created by C.J.YOU on 2016/5/9.
  */
object VerifyCode {

  /** tessdata dir path set */
  private final def datapath = "src/main/resources"

  private def setUp(): Unit ={
    instance.setDatapath(new File(datapath).getPath)
  }
  private val instance = new Tesseract

  /**
    * code verify
    * only for digital number
    * @param fileName  pic file path
    * @return  code
    */
  def verify(fileName:String): String = {
    setUp
    val file = new File(fileName)
    val code = instance.doOCR(file)
    code
  }

  def main(args: Array[String]) {
    val file = "H:\\SmartData-X\\算法\\3.png"
    val result = VerifyCode.verify(file)
    println(result)
  }

}

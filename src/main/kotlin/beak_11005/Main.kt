package beak_11005

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val token = StringTokenizer(br.readLine())

    val digit = token.nextToken().toInt()
    val number = token.nextToken().toInt()

    var cnt = 0

    val list = mutableListOf<Int>()

  while (true){
      val data = digit / number.toDouble().pow(cnt++)
      list.add(data.toInt())

      if(data < number){
          break
      }
  }
    list.reverse()

    for(i in list.indices){
         val res = list[i]%number

        if(number > 10 && res >= 10){
            print((res+55).toChar())
        }else{
            print(res)
        }
    }

    bw.flush()
    bw.close()
}
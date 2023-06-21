package baek_10871

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val count : Int = token.nextToken().toInt()
    val baseNumber : Int = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    repeat(count) {
        val  number= token.nextToken().toInt()

        if(baseNumber > number){
            bw.write("$number ")
        }
    }


    bw.flush()
    bw.close()
}
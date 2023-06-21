package baek_5597


import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr: Array<Int> = Array(30) { i -> i+1 }

    val notInArr = IntArray(28)

    repeat(notInArr.size) {
        notInArr[it] = br.readLine().toInt()
    }

    arr.sort()

    for (arrValue in arr) {
       if(! notInArr.contains(arrValue)){
           bw.write("$arrValue\n")
       }
    }

    bw.flush()
    bw.close()
}
package baek_10798


import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val strList = mutableListOf<String>()
    var maxSize = 0

    repeat(5) {
        val input = br.readLine()
        strList.add(input)
        if (input.length > maxSize) {
            maxSize = input.length
        }
    }

    val arr = Array(5) { CharArray(maxSize) }

    repeat(strList.size) {
        for (i in 0 until strList[it].length) {
            val strArray = strList[it].toCharArray()
            arr[it][i] = strArray[i]
        }
    }

    var result = ""

    for (i in 0 until maxSize) {
        for (j in 0 until 5) {
            result +=
                if (arr[j][i] == '\u0000') ""
                else arr[j][i]
        }
    }
    bw.write(result)

    bw.flush()
    bw.close()
}
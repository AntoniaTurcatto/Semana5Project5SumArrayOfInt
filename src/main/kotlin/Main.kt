fun main() {
    val array1= arrayOf(3,4,5,10,1,-2,-20,3)
    println(sumArrayInt(array1))
}

//5 - Crie uma função recursiva que calcule a soma dos elementos de um array de
//inteiros.
fun sumArrayInt(array: Array<Int>):Int{
    val arrayFun=array
    if (arrayFun.lastIndex==0){
        return arrayFun[0]
    } else{
        val array2 = arrayFun.sliceArray(1..array.lastIndex)
        return (arrayFun[0]+sumArrayInt(array2))
    }
}
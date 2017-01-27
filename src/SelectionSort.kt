import java.util.*

fun main(args: Array<String>) {
    val item = mutableListOf<Int>()

    println("Enter 5 elements to be sort")
    for(k in 0..4){
        val input= Scanner(System.`in`)
        val element = input.nextInt()
        item.add(element)
    }

    println(item)
   val result = selectionSort(item)
    println(result)
}

fun <T:Comparable<T>> swap(list:MutableList<T>,i : Int ,j : Int){
    val temp = list[i]
    list[i] = list[j]
    list[j] = temp
}

fun <T:Comparable<T>>selectionSort(items:MutableList<T>) : MutableList<T>{
    for(i in 0 until items.count())
    {
        for(j in i+1 until items.count()){
            if(items[i]>items[j]){
                swap(items,i,j)
            }
        }
    }
    return items
}
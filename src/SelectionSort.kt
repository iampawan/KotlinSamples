
fun main(args: Array<String>) {
    val names = mutableListOf(5,1,7,3,9);
    println(names)
   val result = selectionSort(names)
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
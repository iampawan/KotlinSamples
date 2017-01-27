fun main(args: Array<String>) {
    val numbers = mutableListOf(5,1,7,3,9,6)
    println(numbers)
    val result = bubbleSort(numbers)
    println(result)
}

fun <T: Comparable<T>>bubbleSort(items : MutableList<T>):MutableList<T>{
    if(items.isEmpty()){
        return items
    }
    for(i in 0 until items.count()){
        var swapped:Boolean = false
        for(j in 0 until items.count()-1){
            if(items[j]>items[j+1]){
                swap(items,j,j+1)
                swapped = true
            }
        }
        if(!swapped){
            break
        }
    }
    return items
}
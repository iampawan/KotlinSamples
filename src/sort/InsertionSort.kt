package sort
/**
 * An implementation of insertion sort algorithm
 * AveragePerformance = O(n^2)
 */
fun main(args: Array<String>) {
    val numbers = mutableListOf(5,1,7,3,9,6)
    println(numbers)
    val result = insertionSort(numbers)
    println(result)
}

fun <T: Comparable<T>>insertionSort(items : MutableList<T>):MutableList<T>{
    if(items.isEmpty()){
        return items
    }
    for(i in 0 until items.count()-1){
        for(j in i+1 downTo 1){
            if(items[j]<items[j-1]){
                swap(items,j,j-1) //sort.swap method picked from SelectionSort Kotlin File
            }
            else{
                break
            }
        }
    }
    return items
}
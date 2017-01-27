package sort
fun main(args: Array<String>) {
    val numbers = mutableListOf(5,1,7,3,9,6)
    println(numbers)
    val result = shellSort(numbers)
    println(result)
}

fun <T : Comparable<T>>shellSort(items : MutableList<T>):MutableList<T>{
    var result = mutableListOf<T>()
    var increment = items.count()/2
    while (increment >=1){
        for(startindex in 0 until increment){
            result = insertionSort(items,startindex,increment)
        }
        increment = increment/2
    }
    return result
}

fun <T: Comparable<T>>insertionSort(items : MutableList<T>,startIndex : Int,increment:Int):MutableList<T>{
    if(items.isEmpty()){
        return items
    }
    for(i in startIndex until items.count() step increment ){
        for(j in Math.min(i+increment,items.count()-1) downTo increment ){
            if(items[j]<items[j-increment]){
                swap(items,j,j-increment) //sort.swap method picked from SelectionSort Kotlin File
            }
            else{
                break
            }
        }
    }
    return items
}
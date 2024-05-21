//Implements a function that removes a specific element from an array

//BEGIN
package main

import "fmt"

func RemoveElement(arr []int, target int) []int {
i := 0
for ; i < len(arr); i++ {
if arr[i] == target {
copy(arr[i:], arr[i+1:])
arr = arr[:len(arr)-1]
break
}
}
return arr
}

func main() {
nums := []int{3, 2, 5, 6, 7, 3, 8, 9, 3}
removeNum := 3
result := RemoveElement(nums, removeNum)
}
//END
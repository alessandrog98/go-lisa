//BEGIN
func Partition(arr []int, low, high int) int {
	pivot := arr[high]
	i := low - 1
	for j := low; j <= high-1; j++ {
		if arr[j] < pivot {
			arr[i+1], arr[j] = arr[j], arr[i+1]
			i++
		}
	}
	arr[i+1], arr[high] = arr[high], arr[i+1]
	return i + 1
}

func FastSort(arr []int, low, high int) {
	if low < high {
		pivotIndex := Partition(arr, low, high)
		FastSort(arr, low, pivotIndex-1)
		FastSort(arr, pivotIndex+1, high)
	}
}

func main() {
	arr := []int{64, 34, 25, 12, 22, 11, 17, 35, 30}
	FastSort(arr, 0, len(arr)-1)
	fmt.Println("Array sorted by Fast Sort:")
	fmt.Println(arr)
}

//END


//BEGIN
func main() {
	arr := []int{64, 34, 25, 12, 22, 11, 17, 35, 30}
	SwapSort(arr)
	fmt.Println("Array sorted by Swap Sort:")
	fmt.Println(arr)
	}

func Swap(arr *[]int, i, j int) {
	temp := (*arr)[i]
	(*arr)[i] = (*arr)[j]
	(*arr)[j] = temp
	}
	
	func SwapSort(arr []int) {
	for i := 0; i < len(arr)-1; i++ {
	for j := 0; j < len(arr)-i-1; j++ {
	if arr[j] > arr[j+1] {
	Swap(&arr, j, j+1)
	}
	}
	}
	//END
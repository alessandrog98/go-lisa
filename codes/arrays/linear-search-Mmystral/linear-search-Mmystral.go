//BEGIN

func main() {
	arr := []int{2, 8, 1, 9, 5, 3, 6, 7, 4}
	x := 6
	index := LinearSearch(arr, x)
	if index != -1 {
		fmt.Printf("%d found at position %d\n", x, index)
	} else {
		fmt.Println("Element not present in array")
	}
}

func LinearSearch(arr []int, x int) int {
	for i := 0; i < len(arr); i++ {
		if arr[i] == x {
			return i
		}
	}
	return -1
}

//END
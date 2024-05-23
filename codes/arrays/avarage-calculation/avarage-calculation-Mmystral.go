//BEGIN
package main

import "fmt"

func Average(numbers []float64) float64 {
	sum := 0	
	for _, number := range numbers {
		sum += number
	}
	return sum / float64(len(numbers))
}

func main() {
	nums := []int{1, 2, 3, 4}
	avg := Average(nums)
	fmt.Println("The average is:", avg)
}
//END
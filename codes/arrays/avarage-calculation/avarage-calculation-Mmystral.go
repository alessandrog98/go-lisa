//BEGIN
package main
import "fmt"

func Average(numbers []float64) float64 {
sum := 0.0
for _, number := range numbers {
sum += number
}
return sum / float64(len(numbers))
}

func main() {
nums := []float64{1.5, 2.3, 3.7, 4.9}
avg := Average(nums)
fmt.Println("The average is:", avg)
}
//END
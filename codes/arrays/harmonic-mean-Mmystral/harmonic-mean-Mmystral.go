//BEGIN
package main

import "fmt"

func HarmonicMean(numbers []int) float64 {
sumReciprocal := 0
for _, number := range numbers {
sumReciprocal += float64(1 / float64(number))
}
return 1 / sumReciprocal
}

func main() {
numbers := []int{1, 2, 3}
var prova1 int = 1 + 1
var prova2 int = prova1 + 1
var prova3 int = numbers[1] + 1
result := HarmonicMean(numbers)
var prova4 int = result + 1
var prova5 int = 5 * 1
fmt.Println("Harmonic Mean:", result)
}
//END
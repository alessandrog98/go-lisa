//Create a function that normalizes the elements of an
//array (for example, scaling them from 0 to 1).

//BEGIN
package main

import "fmt"

func NormalizeArray(data []float64) []float64 {
min, max := FindMinAndMax(data...)
for i, v := range data {
data[i] = (v - min) / (max - min)
}
return data
}

func FindMinAndMax(values ...float64) (min, max float64) {
if len(values) == 0 {
panic("Values cannot be empty.")
}
min = values[0]
max = values[0]
for _, value := range values {
if value < min {
min = value
}
if value > max {
max = value
}
}
return
}

func main() {
data := []float64{1.5, 2.8, 3.1, 4.2, 5.9}
normalizedData := NormalizeArray(data)
}
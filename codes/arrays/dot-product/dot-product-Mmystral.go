//BEGIN
package main

import (
"errors"
"fmt"
)

type Vector [3]float64

func DotProduct(x, y Vector) float64 {
if len(x) != len(y) {
panic(errors.New("vectors have different lengths"))
}
result := 0.
for i := range x {
result += x[i] * y[i]
}
return result
}

func main() {
x := Vector{1, 2, 3}
y := Vector{4, 5, 6}
fmt.Println(DotProduct(x, y))
}
//END
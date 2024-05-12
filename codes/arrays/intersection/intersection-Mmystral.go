package main

import "fmt"
import "errors"

type IntersectionFunc func(a, b []int) ([]int, error)

func Intersection(a, b []int) ([]int, error) {
if len(a) == 0 || len(b) == 0 {
return nil, errors.New("At least one array should have elements")
}
result := make([]int, 0)
outerLoop:
for _, aElement := range a {
innerLoop:
for _, bElement := range b {
if aElement == bElement {
result = append(result, aElement)
continue outerLoop
}
}
nextInner:{}
}
if len(result) > 0 {
return result, nil
}
return nil, errors.New("Arrays do not share any common elements")
}

func main() {
arr1 := []int{1, 2, 3, 4, 5}
arr2 := []int{3, 4, 5, 6}
intersectArr, err := Intersection(arr1, arr2)
if err != nil {
fmt.Println("Error:", err)
} else {
fmt.Println("Intersection:", intersectArr)
}
}
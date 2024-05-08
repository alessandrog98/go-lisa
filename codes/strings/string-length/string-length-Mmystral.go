//BEGIN
package main

import "fmt"

func StringLength(s string) int {
return len(s)
}

func main() {
var str string
fmt.Scan(&str)
length := StringLength(str)
fmt.Println("String Length:", length)
}
//END
//BEGIN
package main

import "fmt"

func strConcat(str1 *string, str2 *string) *string {
s := make([]byte, len(*str1)+len(*str2))
copy(s, *str1)
copy(s[len(*str1):], *str2)
*str1 = string(s)
return str1
}

func main() {
str1 := new(string)
str2 := new(string)
str3 := new(string)

*str1 = "Hello"
*str2 = "World"

strConcat(str1, str2)
*str3 = (*str1)

fmt.Println(*str3)
}
//END
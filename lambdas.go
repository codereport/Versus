// code_report
// 

package main

import "sort"
import "fmt"

func sort_lambda1() {
    l := []string{"bear", "cat", "elephant", "mouse"}
    sort.Slice(l, func(i, j int) bool { return len(l[i]) < len(l[j]) })
    fmt.Println(l)
}

func sort_lambda2() {
    l := []string{"bear", "cat", "elephant", "mouse"}
    byLength := func(i, j int) bool {
    return len(l[i]) < len(l[j])
    }
    sort.Slice(l, byLength)
    fmt.Println(l)
}

func main() {
    sort_lambda1()
    sort_lambda2()
    
    l := []int{1, 2, 3, 4, 5}
    sum, prod := 0, 1
    for _, e := range l {
        sum += e
        prod *= e
    }
    fmt.Println(sum, prod)
}

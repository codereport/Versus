// code_report
// 

import std.stdio;
import std.algorithm.sorting;
import std.algorithm.iteration;

void sort_lambda() {
    string[] a = [ "bear", "cat", "elephant", "mouse" ];
    sort!("a.length < b.length")(a);
    writeln(a);
}

void add_lambda() {
    int[] a = [ 1, 2, 3, 4, 5 ];
    auto  x = reduce!("a + b")(0, a);
    writeln(x);
}

void product_lambda1() {
    int[] a = [ 1, 2, 3, 4, 5 ];
    auto  x = reduce!("a * b")(1, a);
    writeln(x);
}

void product_lambda2() {
    int[] a = [ 1, 2, 3, 4, 5 ];
    auto  x = reduce!((a, b) => a * b)(1, a);
    writeln(x);
}

void main(string[ ] args) {
    sort_lambda();
    add_lambda();
    product_lambda1();
    product_lambda2();
}

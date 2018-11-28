// code_report
// 

import std.stdio;
import std.algorithm.sorting;
import std.algorithm.iteration;

void example1() {
    string[] x = [ "bear", "cat", "elephant", "mouse" ];
    int[]    y = [ 1, 2, 3, 4, 5 ];
    writeln(sort!("a.length < b.length")(x));
    writeln(reduce!("a + b")(0, y));
    writeln(reduce!("a * b")(1, y));
}

void example2() {
    string[] x = [ "bear", "cat", "elephant", "mouse" ];
    int[]    y = [ 1, 2, 3, 4, 5 ];
    writeln(sort!("a.length < b.length")(x));
    writeln(reduce!((a, b) => a + b)(0, y));
    writeln(reduce!((a, b) => a * b)(1, y));
}

void main(string[ ] args) {
    example1();
    example2();
}

// code_report
// 

#include <vector>
#include <iostream>
#include <string>
#include <algorithm>
#include <numeric>

using namespace std;

template<typename T>
void print(T t) {
    for (auto e : t) cout << e << ' ';
    cout << "\n";
}

void sort_lambda() {
    vector<string> v = { "bear", "cat", "elephant", "mouse" };
    auto l = [](const auto& a, const auto& b) { return a.size() < b.size(); };
    sort(begin(v), end(v), l);
    print(v);
}

void add_lambda() {
    vector<int> v = { 1, 2, 3, 4, 5 };
    auto x = accumulate(begin(v), end(v), 0);
    cout << x << "\n";
}

void product_lambda() {
    vector<int> v = { 1, 2, 3, 4, 5 };
    auto l = [](auto a, auto b) { return a * b; };
    auto x = accumulate(begin(v), end(v), 1, l);
    cout << x << "\n";
}

int main () {
    add_lambda();
    product_lambda();
    sort_lambda();

    return 0;
}

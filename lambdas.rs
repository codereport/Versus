// code_report
// 

fn sort_lambda() {
    let mut v = [ "bear", "cat", "elephant", "mouse" ];
    v.sort_unstable_by(|a, b| a.len().cmp(&b.len()));
    println!("{:?}", v); 
}

fn add_lambda() {
    let v = [ 1, 2, 3, 4, 5 ];
    let x: i32 = v.iter().sum();
    println!("{:?}", x);
}

fn add_lambda2() {
    let v = [ 1, 2, 3, 4, 5 ];
    let x = v.iter().fold(0, |a, b| a + b);
    println!("{:?}", x);
}

fn product_lambda() {
    let v = [ 1, 2, 3, 4, 5 ];
    let x: i32 = v.iter().product();
    println!("{:?}", x);
}

fn product_lambda2() {
    let v = [ 1, 2, 3, 4, 5 ];
    let x = v.iter().fold(1, |a, b| a * b);
    println!("{:?}", x);
}

fn main() {
    sort_lambda();
    add_lambda();
    add_lambda2();
    product_lambda();
    product_lambda2();
}

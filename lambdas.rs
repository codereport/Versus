// code_report
// 

fn main() {
    let mut x = [ "bear", "cat", "elephant", "mouse" ];
    let     y = [ 1, 2, 3, 4, 5 ];
    x.sort_unstable_by(|a, b| a.len().cmp(&b.len()));
    println!("{:?}", x); 
    println!("{:?}", y.iter().fold(0, |a, b| a + b));
    println!("{:?}", y.iter().fold(1, |a, b| a * b));
}

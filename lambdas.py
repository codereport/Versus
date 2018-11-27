# code_report
# 

import functools as ft

def sort_lambda():
    l = [ "bear", "cat", "elephant", "mouse" ]
    l.sort(key = lambda s: len(s))
    # l.sort(key = len)
    print(l)

def add_lambda():
    l = [ 1, 2, 3, 4, 5 ]
    print(sum(l))

def product_lambda1():
    l = [ 1, 2, 3, 4, 5 ]
    x = ft.reduce(lambda a, b: a * b, l)
    print(x)
    
def product_lambda2():
    li = [ 1, 2, 3, 4, 5 ]
    la = lambda a, b: a * b
    x = ft.reduce(la, li)
    print(x)
    
add_lambda()
product_lambda1()
product_lambda2()
sort_lambda()

-- code_report
-- 

import Data.List
import Data.Ord

a = [ 1, 2, 3, 4, 5 ]
b = [ "bear", "cat", "elephant", "mouse" ]
lsort :: [[a]] -> [[a]]
lsort = sortOn length -- lsort = sortBy (comparing length)

main :: IO ()
main =  do
        print $ foldr (+) 0 a
        print $ foldr (*) 1 a
        let c = lsort b
        print c

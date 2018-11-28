-- code_report
-- 

import Data.List
import Data.Ord

main :: IO ()
main =  do
        let a = [ 1, 2, 3, 4, 5 ]
        let b = [ "bear", "cat", "elephant", "mouse" ]
        print $ foldr (+) 0 a
        print $ foldr (*) 1 a
        print $ sortOn length b

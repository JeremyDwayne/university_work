fizzBuzzHelper :: Int -> Int -> Int -> String
fizzBuzzHelper f1 f2 n
  | n `mod` f1 == 0 && n `mod` f2 == 0 = "fizzbuzz"
  | n `mod` f1 == 0 = "fizz"
  | n `mod` f2 == 0 = "buzz"
  | otherwise = show n

fizzBuzzAll :: Int -> Int -> [Int] -> [String]
fizzBuzzAll f1 f2 = map (fizzBuzzHelper f1 f2)

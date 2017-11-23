indexOf :: (Eq a) => a -> [a] -> Int
indexOf _ [] = -1
indexOf needle (first:rest)
  | first == needle = 0
  | otherwise = 1 + indexOf needle rest

indexOf' :: (Eq a) => a -> [a] -> Int -> Int
indexOf' _ [] _ = -1
indexOf' needle (first:rest) accumulator
  | first == needle = accumulator
  | otherwise = indexOf' needle rest (accumulator +1)

indexOf'' :: (Eq a) => a -> [a] -> Int
indexOf'' needle haystack = indexOfHelper needle haystack 0
  where
    indexOfHelper _ [] _ = -1
    indexOfHelper needle (first:rest) accumulator
      | first == needle = accumulator
      | otherwise = indexOfHelper needle rest (accumulator + 1)

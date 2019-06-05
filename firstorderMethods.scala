// Concatenating lists
val concat1 = List(1,2) ::: List(3,4,5)
val concat2 = List() ::: List(1,2,3)
val concat3 = List(1,2,3) ::: List(4)

// Divide and Conquer principle
def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case x :: xs1 => x :: append(xs1, ys)
}

// Taking the length of a list: length
println(concat1.length)

// Accessing the end of a list: init and last
val abcde = List('a', 'b', 'c', 'd', 'e')
println("The last of abcde: " + abcde.last)
println("The elements exclude the last of abcde: " + abcde.init)

// Reversing lists: reverse
println("Reverse abcde: " + abcde.reverse)

// O(n^2)
def rev[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs) ::: List(x)
}

// Prefixes and suffiexes: drop, take and splitAt
// xs splitAt n =  (xs take n, xs drop n)
println(abcde take 2)
println(abcde drop 2)
println(abcde splitAt 2)

// Element selection: apply and indices
println("to select the 2nd element, we can use apply or indices")
println("e.g. abcde apply 2 or abcde(2)")
println(abcde apply 2)

// Zipping lists: zip, zipWithIndex
println("zip is like python's zip")
val zipped = abcde zip List(1,2,3)

// Displaying lists: toString and mkString
println("print [a,b,c,d,e] by + abcde mkString (\"[\",\",\", \"]\")")
println(abcde mkString ("[", ", ", "]"))

// Converting lists: iterator, toArray, copyToArray
val arr = abcde.toArray
arr.toString
arr.toList
val iter = abcde.iterator
iter.next
iter.next

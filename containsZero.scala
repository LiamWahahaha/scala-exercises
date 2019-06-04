def containsZero(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num == 0)
      exists = true
  exists
}

// alternative
def altContainsZero(nums: List[Int]) = nums.exists(_ == 0)

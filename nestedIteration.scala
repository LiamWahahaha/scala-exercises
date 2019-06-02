val filesHere = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file + ": " + line.trim)

def altGrep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

println("Using grep")
grep(".*gcd.*")

println("\nUsing altGrep")
altGrep(".*gcd.*")


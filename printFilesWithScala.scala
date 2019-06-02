val filesHere = (new java.io.File(".")).listFiles

for (file <- filesHere; if file.getName.endsWith(".scala"))
  println(file)

// to be extra defensive, the following code prints only files and not directories
for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)

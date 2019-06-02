val filesHere = (new java.io.File(".")).listFiles
if (args(0) == "default") {
for (file <- filesHere; if file.getName.endsWith(".scala"))
  println(file)
} else {
  // to be extra defensive, the following code prints only files and not directories
  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
    ) println(file)
}

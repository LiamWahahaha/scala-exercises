def searchFrom(i: Int): Int =
  if (i >= args.length)
    -1
  else if (args(i).startsWith("-")) // skip options
    searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) // found it
    i
  else
    searchFrom(i+1) // keep looking

val i = searchFrom(0)

// we could use findIndexOf to do the same thing
// args.findIndexOf(
//   arg => !arg.startsWith("-") && arg.endsWith(".scala")
// )

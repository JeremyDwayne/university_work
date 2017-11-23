# Regex

### What to match 
- \s : [ \n\r\t]
- [ABCD..Z] -> [A-Z]
- [0123..9] -> [0-9] -> \d

### How many to Match
- * : 0 or more matches
- + : 1 or more matches
- {#} : # of matches specifically
- {lo,hi} : range of matches
- ? : 0 or 1 matches (optional)

### Where To match
- ^ : Start of line
- $ : End of line
- \b : word boundary

/\w+@\w+\.\w+/

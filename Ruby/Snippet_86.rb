def repeatChar(string)
    max = string
            .chars
            .chunk(&:itself)
            .map(&:last)
            .max_by(&:size)
    max ? [max[0], max.size] : ["", 0]
  end
  test = "aaabbzcZZZZZZ"
  print test + " String's consecutive characters are: " , repeatChar("aaabbcZZZZZZ")

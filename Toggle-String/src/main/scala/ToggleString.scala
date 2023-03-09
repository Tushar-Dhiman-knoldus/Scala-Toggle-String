class ConvertString {

  // Function to take the string as an input from the user.
  def inputString(): String = {

    println("Enter the String to change the case of each alphabet in this String ")
    val user_string = scala.io.StdIn.readLine()

    user_string
  }

  // Function to change the case of each alphabet in user String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase.
  def changeCase(user_string: String): String = {

    var result = ""

    if (user_string.isEmpty) {
      return "String is null/empty"
    }

    else {
      for (index <- 0 until user_string.length) {

        if (user_string.charAt(index).isLower) {
          result += user_string.charAt(index).toUpper
        }

        else if (user_string.charAt(index).isUpper) {
          result += user_string.charAt(index).toLower
        }

        else if (user_string.charAt(index).isDigit) {
          return "String contains a numeric value which is not valid !! "
        }
      }
    }
    result
  }
}

object ToggleString extends App {

  private val convertString_object = new ConvertString()

  try {
    val user_string = convertString_object.inputString()
    println(convertString_object.changeCase(user_string))

  }
  catch {
    case exception: Exception => {

      println(exception.getMessage)
    }
  }
}

import tokens.Token
import tokens.TokenType

fun main() {
    println("Hello World!")
}

fun lexer(input: String): List<Token> {
    var current = 0
    val tokens = mutableListOf<Token>()

    while (current < input.length) {
        val token = input[current]
        if (token == '{') {
            tokens.add(Token(type = TokenType.BraceOpen, value = token.toString()))
            current++
        } else if (token == '}') {
            tokens.add(Token(type = TokenType.BraceClose, value = token.toString()))
        }
    }
    return tokens
}
import tokens.Token
import tokens.TokenType

fun main() {
    println("Hello World!")
}

fun lexer(input: String): List<Token> {
    var current = 0
    val tokens = mutableListOf<Token>()

    while (current < input.length) {
        var token = input[current]

        if (token == '{') {
            tokens.add(Token(type = TokenType.BraceOpen, value = token.toString()))
            current++
            continue
        } else if (token == '}') {
            tokens.add(Token(type = TokenType.BraceClose, value = token.toString()))
            current++
            continue
        } else if (token == '[') {
            tokens.add(Token(type = TokenType.BracketOpen, value = token.toString()))
            current++
            continue
        } else if (token == ']') {
            tokens.add(Token(type = TokenType.BracketClose, value = token.toString()))
            current++
            continue
        } else if (token == ':') {
            tokens.add(Token(type = TokenType.Colon, value = token.toString()))
            current++
            continue
        } else if (token == ',') {
            tokens.add(Token(type = TokenType.Comma, value = token.toString()))
            current++
            continue
        } else if (token == '"') {
            var value = ""
            token = input[++current]
            while (token != '"') {
                value += token
                token = input[++current]
            }
            current++
            tokens.add(Token(type = TokenType.BraceClose, value = token.toString()))
            continue
        }else {
            println("Didnt find: $token")
        }
    }
    return tokens
}
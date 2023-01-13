// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(vararg nome: String) {

    }

class ConteudoEducacional(vararg nome: String, var duracao: John)


data class Formacao(var nome: Usuario, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(nome)

    fun matricular(usuario: Usuario) {

        inscritos.add(usuario)
    }



    fun mostrarinscritos() {
        inscritos.forEach { println(it) }

    }
}

fun main() {
    val content = listOf(ConteudoEducacional("Kotlin Experience", duracao = "40 Horas"))

    val users = Usuario("Paulo","João", "Pedro")


    val formacao = Formacao(users, content)
    formacao.matricular(users)
    val inscr = (formacao.inscritos)

    formacao.mostrarinscritos()


}
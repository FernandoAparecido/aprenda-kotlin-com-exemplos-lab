// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(varag nome: String){

}

class ConteudoEducacional(varag nome: String, var duracao: John)

data class Formacao(var nome: Usuario, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(nome)
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

}

fun main() {
  val content = listof(ConteudoEducacional("Kotlin Experience", duracao = "40 HORAS"))

  val users = Usuario("Paulo","Marcio","Pedro")

   val formacao = Formacao(users, content)
    formacao.matricular(users)
    val inscr = (formacao.inscritos)

    formacao.mostrarinscritos()

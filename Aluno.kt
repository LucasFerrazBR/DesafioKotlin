class Aluno(val nome: String, val sobrenome: String, val codAluno: Int){

    override fun equals(other: Any?): Boolean {
        if (other is Aluno){
            if (other.codAluno == this.codAluno) return true
        }
        return false
    }

    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, Código do aluno: ${this.codAluno}}"
    }
}
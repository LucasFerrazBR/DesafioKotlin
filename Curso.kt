class Curso(val nome: String, val codCurso: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Curso){
            if (other.codCurso == this.codCurso) return true
        }
        return false
    }

    override fun toString(): String {
        return "{Nome: ${this.nome}, Código do curso: ${this.codCurso}}"
    }
}
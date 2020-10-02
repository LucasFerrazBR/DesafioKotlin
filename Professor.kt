class Professor(val nome: String, val sobrenome: String, val tempoCasa: Int, val codProf: Int){

    override fun equals(other: Any?): Boolean {
        if (other is Professor){
            if (other.codProf == this.codProf) return true
        }
        return false
    }

    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, Tempo de casa: ${this.tempoCasa}, Código do professor: ${this.codProf}}"
    }
}
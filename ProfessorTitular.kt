class ProfessorTitular(nome: String, sobrenome: String, tempoCasa: Int, codProf: Int, val especialidade: String): Professor(nome,sobrenome,tempoCasa,codProf){

    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, Tempo de casa: ${this.tempoCasa}, Especialidade: ${this.especialidade}, Código do professor: ${this.codProf}}"
    }
}
class ProfessorAdjunto(nome: String, sobrenome: String, tempoCasa: Int, codProf: Int, val horasMonitoria: Int): Professor(nome,sobrenome,tempoCasa,codProf){

    override fun toString(): String {
        return "{Nome: ${this.nome} ${this.sobrenome}, Tempo de casa: ${this.tempoCasa}, Horas de monitoria: ${this.horasMonitoria}, Código do professor: ${this.codProf}}"
    }
}
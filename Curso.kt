class Curso(val nome: String, val codCurso: Int, val maxAlunos: Int) {

    private var professorTitular: ProfessorTitular? = null
    private var professorAdjunto: ProfessorAdjunto? = null
    private val alunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        if (other is Curso){
            if (other.codCurso == this.codCurso) return true
        }
        return false
    }

    override fun toString(): String {
        return "{Nome: ${this.nome}, Código do curso: ${this.codCurso}}"
    }

    fun setProfessorTitular(Professor: ProfessorTitular){
        this.professorTitular = Professor
    }

    fun setProfessorAdjunto(Professor: ProfessorAdjunto){
        this.professorAdjunto = Professor
    }
}

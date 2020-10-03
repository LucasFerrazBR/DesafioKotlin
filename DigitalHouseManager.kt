import java.util.*

class DigitalHouseManager {

    val cursos = mutableListOf<Curso>()
    val professores = mutableListOf<Professor>()
    val alunos = mutableListOf<Aluno>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int){
        val curso = Curso(nome,codigoCurso,quantidadeMaximaDeAlunos)
        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int){
        for (teste in cursos){
            if (teste.codCurso == codigoCurso) cursos.remove(teste)
        }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String ,codigoProfessor: Int, quantidadeDeHoras: Int){
        val professor = ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras)
        professores.add(professor)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String,codigoProfessor: Int, especialidade: String){
        val professor = ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade)
        professores.add(professor)
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (teste in professores){
            if (teste.codProf == codigoProfessor) professores.remove(teste)
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int){
        val aluno = Aluno(nome,sobrenome,codigoAluno)
        alunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso:  Int){
        var alunoTemporario = Aluno("temp","temp",1098763345)
        var cursoTemporario = Curso("temp",143423489,100)
        var date = Date()

        for (teste in cursos){
            if (teste.codCurso == codigoCurso) cursoTemporario = teste
            else{
                println("Curso não encontrado")
                return
            }
        }
        for (teste in alunos){
            if (teste.codAluno == codigoAluno) alunoTemporario = teste
            else{
                println("Aluno não encontrado")
                return
            }
        }

        if (cursoTemporario.alunosMatriculados.count() >= cursoTemporario.maxAlunos.toFloat()){
            println("Não há vagas disponiveis neste curso")
            return
        }

        val matricula = Matricula(alunoTemporario,cursoTemporario,date)
        matriculas.add(matricula)
        println("Aluno matriculado")
    }

    fun alocarProfessores(codigoCurso: Int,codigoProfessorTitular:  Int, codigoProfessorAdjunto:Int) {
        var professorAdjuntoTemp = ProfessorAdjunto("temp", "temp", 910291111, 98989889)
        var professorTitularTemp = ProfessorTitular("temp", "temp", 910291112, "temp")
        var cursoTemporario = Curso("temp",143423489,100)

        for (teste in professores) {
            if (teste.codProf == codigoProfessorAdjunto) professorAdjuntoTemp = teste as ProfessorAdjunto
            else {
                println("Professor não econtrado")
                return
            }
        }
        for (teste2 in professores) {
            if (teste2.codProf == codigoProfessorTitular) professorTitularTemp = teste2 as ProfessorTitular
            else {
                println("Professor não econtrado")
                return
            }
        }
        for (teste in cursos) {
            if (teste.codCurso == codigoCurso) cursoTemporario = teste
            else {
                println("Curso não encontrado")
                return
            }
        }
        cursoTemporario.setProfessorAdjunto(professorAdjuntoTemp)
        cursoTemporario.setProfessorTitular(professorTitularTemp)
    }
    }
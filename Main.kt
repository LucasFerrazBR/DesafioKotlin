fun main(args: Array<String>) {

        var Manager = DigitalHouseManager()

        Manager.registrarProfessorTitular("Celso", "Muculmano", 2, "PROCOM")
        Manager.registrarProfessorTitular("Guilherme", "Boulos", 4, "Retomada")
        Manager.registrarProfessorAdjunto("Arthur", "Val", 1, 2)
        Manager.registrarProfessorAdjunto("Transfor", "Mice", 3, 20)

        Manager.registrarCurso("FullStack",20001,3)
        Manager.registrarCurso("Android",20002,2)

        Manager.alocarProfessores(20001,2,1)
        Manager.alocarProfessores(20002,4,3)
        Manager.matricularAluno("Java","Kotlin",1)
        Manager.matricularAluno("Javac","Kotlin",2)
        Manager.matricularAluno("Android","Kotlin",3)
        Manager.matricularAluno("Intelij","Kotlin",4)
        Manager.matricularAluno("Studio","Kotlin",5)

        Manager.matricularAluno(1,20001)
        Manager.matricularAluno(2,20001)
        Manager.matricularAluno(3,20002)
        Manager.matricularAluno(4,20002)
        Manager.matricularAluno(5,20002)
}



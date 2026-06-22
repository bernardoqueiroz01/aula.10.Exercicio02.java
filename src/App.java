//Nome:Bernardo Candido de Queiroz 
//RA:1261948200
public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno01 = new Aluno();
        aluno01.nome = "Maria";
        aluno01.matricula ="2024001";
        aluno01.nota01 = 7.5;
        aluno01.nota02 = 8.0;

        System.out.println(aluno01.exibirBoletim());
    }
}

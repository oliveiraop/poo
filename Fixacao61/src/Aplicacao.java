import java.security.Key;
import java.util.ArrayList;

public class Aplicacao {
    private static ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();


    public static void main(String[] args) {
        boolean isOn = true;
        boolean menuOn = true;
        String menu = "Seleciona a opção desejada: \n" +
                "1. Cadastrar Atendente \n" +
                "2. Matricular Aluno \n" +
                "3. Listar Alunos Matriculados \n" +
                "4. Sair ";
        while (isOn) {
            System.out.println(menu);
            char c = Keyboard.readChar();
            menuOn = true;
            while (menuOn) {
                switch (c) {
                    case '1':
                        Aplicacao.cadastrarAtendente();
                        menuOn = false;
                        break;
                    case '2':
                        Aplicacao.matricularAluno();
                        menuOn = false;
                        break;
                    case '3':
                        Aplicacao.listarAlunos();
                        menuOn = false;
                        break;
                    case '4':
                        isOn = false;
                        menuOn = false;
                        break;
                    default:
                        System.out.println("Char incorreto");
                }
            }
            System.out.print("Press Enter to Continue");
            Keyboard.readChar();
        }
    }

    private static void cadastrarAtendente() {
        String erro = "erro";
        System.out.println("Digite o nome do curso do atendente: ");
        String curso = Keyboard.readString(erro);
        if (curso == erro) {
            System.out.println("Curso incorreto");
        } else {
            Atendente atendente = new Atendente(curso);
            atendentes.add(atendente);
            System.out.println("Atendente cadastrado!");
        }
    }

    private static void matricularAluno() {
        String erro = "erro";
        System.out.println("Digite o nome do curso para matricula:");
        String curso = Keyboard.readString(erro);
        if (curso == erro) {
            System.out.println("Curso incorreto");
        } else {
            boolean temAtendente = false;
            for (Atendente i : Aplicacao.atendentes) {
                if (i.getCurso().equals(curso)) {
                    System.out.println("Digite o nome do aluno:");
                    String nome = Keyboard.readString(erro);
                    Aplicacao.alunos.add(i.matricula_aluno(nome));
                    temAtendente = true;
                    break;
                }
            }
            if (!temAtendente) {
                System.out.println("Nao tem atendente desse curso!");
            }
        }
    }

    private static void listarAlunos() {
        String cadaAluno;
        for (Aluno i : Aplicacao.alunos) {
            cadaAluno = i.getNome() + " | " + i.getCurso() + " | " + i.getMatricula();
            System.out.println(cadaAluno);
        }
    }

}

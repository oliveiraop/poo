import java.util.ArrayList;

public class Aplicacao {
    private static ArrayList<Assinante> assinantes = new ArrayList<Assinante>();
    private static ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();

    public static void main(String[] args) {
        boolean isOn = true;
        boolean menuOn = true;
        boolean logOn = false;
        String menu = "Seleciona a opção desejada: \n" +
                "1. Cadastrar Assinante \n" +
                "2. Login Assinante \n" +
                "3. Listar Anuncios \n" +
                "4. Sair ";
        while (isOn) {
            System.out.println(menu);
            char c = Keyboard.readChar();
            menuOn = true;
            while (menuOn) {
                switch (c) {
                    case '1':
                        Aplicacao.cadastrarAssinante();
                        menuOn = false;
                        break;
                    case '2':
                        Aplicacao.loginAssinante();
                        menuOn = false;
                        break;
                    case '3':
                        Aplicacao.listarAnuncios();
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

    private static void cadastrarAssinante() {
        String erro = "erro";
        System.out.println("Digite o cpf do assinante: ");
        String cpf = Keyboard.readString(erro);
        System.out.println("Digite o nome do assinante: ");
        String nome = Keyboard.readString(erro);
        System.out.println("Digite o endereco do assinante: ");
        String endereco = Keyboard.readString(erro);
        System.out.println("Digite o telefone do assinante: ");
        String telefone = Keyboard.readString(erro);

        Assinante assinante = new Assinante(cpf, nome, endereco, telefone);
        Aplicacao.assinantes.add(assinante);
        System.out.println("Assinante cadastrado!");
    }

    private static void listarAnuncios() {
        String cadaAluno;
        for (Anuncio i : Aplicacao.anuncios) {
            System.out.println(i.toString());
        }
    }

    private static void loginAssinante() { // Tela do assinante
        boolean logado = false;
        System.out.println("Digite o cpf do assinante: ");
        String cpf = Keyboard.readString();
        Assinante assinanteLogado = null;
        for (Assinante i : Aplicacao.assinantes) {
            if(i.getCpf().equals(cpf)) {
                assinanteLogado = i;
                logado = true;
                break;
            }
        }
        if (logado == false) {
            return;
        } else {
            String menuLogin = "Seleciona a opção desejada: \n" +
                    "1. Cadastrar Anuncio \n" +
                    "2. Listar Anuncios \n" +
                    "3. Deslogar ";
            while (logado) {
                System.out.println(menuLogin);
                char c = Keyboard.readChar();
                boolean menuOn = true;
                while (menuOn) {
                    switch (c) {
                        case '1':
                            Aplicacao.cadastrarAnuncio(assinanteLogado);
                            menuOn = false;
                            break;
                        case '2':
                            Aplicacao.listarAnuncios();
                            menuOn = false;
                            break;
                        case '3':
                            logado = false;
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
    }

    public static void cadastrarAnuncio(Assinante assinante) {
        String erro = "erro";
        float preco;
        boolean ativo;
        System.out.println("Digite o titulo do anuncio: ");
        String titulo = Keyboard.readString(erro);
        System.out.println("É um anuncio de \"troca\" ou \"venda\"? ");
        String resp = Keyboard.readString();
        switch (resp) {
            case "troca":
                preco = 0;
                break;
            case "venda":
                System.out.println("Qual o preço?  ");
                preco = Keyboard.readFloat();
                break;
            default:
                preco = 0;
                break;
        }
        System.out.println("Ativar anuncio? (S/N) ");
        String ativar = Keyboard.readString(erro);
        switch (ativar) {
            case "S":
                ativo = true;
                break;
            case "N":
                ativo = false;
                break;
            default:
                ativo = false;
                break;
        }
        boolean livros = true;
        ArrayList<Livro> arrayLivros = new ArrayList<Livro>();
        while(livros) {
            System.out.println("Deseja adicionar um livro? (S/N)");
            String resposta = Keyboard.readString(erro);
            switch (resposta) {
                case "S":
                    System.out.println("Digite o titulo do livro: ");
                    String tituloLivro = Keyboard.readString();
                    System.out.println("Digite o isbn: ");
                    int isbn = Keyboard.readInt();
                    System.out.println("Digite a materia: ");
                    String materia = Keyboard.readString();
                    System.out.println("Digite a edicao: ");
                    int edicao = Keyboard.readInt();
                    System.out.println("Digite o ano: ");
                    int ano = Keyboard.readInt();
                    System.out.println("Digite o ano de publicacao: ");
                    int anoPublicacao = Keyboard.readInt();
                    arrayLivros.add(new Livro(tituloLivro, isbn, materia, edicao, ano, anoPublicacao));
                    break;
                case "N":
                    livros = false;
                    break;
                default:
                    livros = false;
                    break;
            }

        }
        Anuncio anuncio = new Anuncio(titulo, preco, ativo, assinante, arrayLivros);
        assinante.addAnuncio(anuncio);
        Aplicacao.anuncios.add(anuncio);
    }

}

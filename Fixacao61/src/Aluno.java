
/**
 * Write a description of class aluno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aluno
{
    private int matricula;
    String nome, curso;
    
    public Aluno(String nome, String curso, int matricula)
    {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;}
    public String getCurso(){
        return curso;}

    public int getMatricula() {
        return matricula;
    }
}

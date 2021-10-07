
/**
 * Write a description of class atendente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Atendente
{
   private String curso;
   private static int controle_matricula = 0;
   
   public Atendente(String curso)
   {
        this.curso = curso;    
   }
   
   public Aluno matricula_aluno(String nome)
   {
       this.incrementaMatricula();
       Aluno aluno = new Aluno(nome, this.curso, this.controle_matricula);
       
       System.out.println("matricula do aluno "+aluno.getNome()+" é: "+controle_matricula+", Curso:"+ aluno.getCurso() );

       return aluno;
   }

    public String getCurso() {
        return curso;
    }

    private void incrementaMatricula()
   {
       controle_matricula++;
    }
    
    
}

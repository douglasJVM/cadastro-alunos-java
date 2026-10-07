import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrar(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " cadastrado com sucesso!");
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }

    public Aluno buscarPorMatricula(int matricula) {
        return null;
    }

}
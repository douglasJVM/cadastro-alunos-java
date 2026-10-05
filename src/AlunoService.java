import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listar() {
        return alunos;
    }
}
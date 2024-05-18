import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private final List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		this.tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (int i = 0; i < this.tarefaList.size(); i++) {
			if (this.tarefaList.get(i).getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(this.tarefaList.get(i));
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return this.tarefaList.size();
	}

	public void obterDescricaoTarefa() {
		System.out.println(this.tarefaList);
	}
}

package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Editora;

@Service
public class EditoraService {

	List<Editora> lista = new ArrayList<>();

	public String save(Editora editora) {
		lista.add(editora);
		return editora.getNome()+ " salvo";
	}

	public String update(long id, Editora editora) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, editora);
					return editora.getNome()+ " alterado!";
				}
			}

		return "Nao encontrado";
	}

	public List<Editora> listAll(){

		Editora editora = new Editora(1, "AAA", "RUA1", "111111");
		Editora editora2 = new Editora(2, "ABC", "RUA2", "222222");
	    Editora editora3 = new Editora(3, "DDD", "RUA3", "333333");

		lista.add(editora);
		lista.add(editora2);
		lista.add(editora3);

		return lista;

	}

	public Editora findById(long idEditora) {


		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idEditora) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idEditora) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idEditora) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Nao encontrado";

	}

}

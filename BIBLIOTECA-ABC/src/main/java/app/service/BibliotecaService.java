package app.service;

import java.util.ArrayList;
import java.util.List;

import app.entity.Biblioteca;

public class BibliotecaService {
	
	List<Biblioteca> lista = new ArrayList<>();

	public String save(Biblioteca biblioteca) {
		lista.add(biblioteca);
		return biblioteca.getNome()+ " salvo";
	}

	public String update(long id, Biblioteca biblioteca) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, biblioteca);
					return biblioteca.getNome()+ " alterado!";
				}
			}

		return "Nao encontrado";
	}

	public List<Biblioteca> listAll(){

		Biblioteca biblioteca = new Biblioteca(1, "AAA", "111111");
		Biblioteca biblioteca2= new Biblioteca(2, "ABC", "222222");
	    Biblioteca biblioteca3 = new Biblioteca(3, "DDD", "33333");

		lista.add(biblioteca);
		lista.add(biblioteca2);
		lista.add(biblioteca3);

		return lista;

	}

	public Biblioteca findById(long idBiblioteca) {


		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idBiblioteca) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idBiblioteca) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idBiblioteca) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Nao encontrado";

	}

}

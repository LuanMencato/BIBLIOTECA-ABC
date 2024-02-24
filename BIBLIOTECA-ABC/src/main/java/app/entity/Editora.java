package app.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Setter
@Getter
@AllArgsConstructor

public class Editora {

	private long id;
	private String nome;
	private String endereco;
	private String telefone;

}

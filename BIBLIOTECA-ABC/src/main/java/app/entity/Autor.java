package app.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Setter
@Getter
@AllArgsConstructor

public class Autor {
		
		private long id;
		private String nome;
		private String cpf;
		private String idade;

}

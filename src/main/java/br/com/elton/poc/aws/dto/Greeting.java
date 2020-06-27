package br.com.elton.poc.aws.dto;


public class Greeting {

	private final long id;
	private final String content;
	private final String endereco;

	public Greeting(long id, String content, String endereco) {
		this.id = id;
		this.content = content;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	

}

package br.com.unicuritiba.GamesLibrary.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_lancamento")
	private String data_lancamento;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "versao")
	private String versao;
	
	@Column(name = "tamanho")
	private String tamanho;
	
	@Column(name = "duracao")
	private String duracao;
	
	@Column(name = "tempo_jogado")
	private String tempo_jogado;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(String data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public String getTempo_jogado() {
		return tempo_jogado;
	}

	public void setTempo_jogado(String tempo_jogado) {
		this.tempo_jogado = tempo_jogado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}

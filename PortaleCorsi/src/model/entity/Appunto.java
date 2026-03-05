package model.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appunto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "contenuto")
	private String contenuto;
	
	@Column(name = "data_creazione")
	private String dataCreazione;
	
	@ManyToOne
	@JoinColumn(name = "id_corso", nullable = false)
	private Corso id_corso;
	
	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente id_utente;
	
	public Appunto() {
		
	}

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

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public String getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Corso getId_corso() {
		return id_corso;
	}

	public void setId_corso(Corso id_corso) {
		this.id_corso = id_corso;
	}

	public Utente getId_utente() {
		return id_utente;
	}

	public void setId_utente(Utente id_utente) {
		this.id_utente = id_utente;
	}

	@Override
	public String toString() {
		return "Appunto [id=" + id + ", nome=" + nome + ", contenuto=" + contenuto + ", dataCreazione=" + dataCreazione
				+ ", id_corso=" + id_corso + ", id_utente=" + id_utente + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appunto other = (Appunto) obj;
		return Objects.equals(contenuto, other.contenuto) && Objects.equals(dataCreazione, other.dataCreazione)
				&& Objects.equals(id, other.id) && Objects.equals(id_corso, other.id_corso)
				&& Objects.equals(id_utente, other.id_utente) && Objects.equals(nome, other.nome);
	}
	
	
	
}
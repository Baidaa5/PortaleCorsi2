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
public class Corso {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "descrizione", nullable = false)
	private String descrizione;
	
	@Column(name = "data_inizio")
	private String dataInizio;
	
	@Column(name = "data_fine")
	private String dataFine;
	
	@ManyToOne
	@JoinColumn(name = "id_sede", nullable = false)
	private Sede id_sede;
	
	@ManyToOne
	@JoinColumn(name = "id_professore", nullable = false)
	private Utente professore;
	
	
	public Corso() {
		
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


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public String getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}


	public String getDataFine() {
		return dataFine;
	}


	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}


	public Sede getId_sede() {
		return id_sede;
	}


	public void setId_sede(Sede id_sede) {
		this.id_sede = id_sede;
	}


	public Utente getProfessore() {
		return professore;
	}


	public void setProfessore(Utente professore) {
		this.professore = professore;
	}


	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(dataFine, other.dataFine) && Objects.equals(dataInizio, other.dataInizio)
				&& Objects.equals(descrizione, other.descrizione) && Objects.equals(id, other.id)
				&& Objects.equals(id_sede, other.id_sede) && Objects.equals(nome, other.nome)
				&& Objects.equals(professore, other.professore);
	}


	@Override
	public String toString() {
		return "Corso [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", dataInizio=" + dataInizio
				+ ", dataFine=" + dataFine + ", id_sede=" + id_sede + ", professore=" + professore + "]";
	}
	
	
	
	
	
}

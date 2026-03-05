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
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "indirizzo", nullable = false)
	private String indirizzo;

	@ManyToOne
	@JoinColumn(name = "id_citta", nullable = false)
	private Citta id_citta;
	
	public Sede() {
		
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Citta getId_citta() {
		return id_citta;
	}

	public void setId_citta(Citta id_citta) {
		this.id_citta = id_citta;
	}

	@Override
	public String toString() {
		return "Sede [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", id_citta=" + id_citta + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sede other = (Sede) obj;
		return Objects.equals(id, other.id) && Objects.equals(id_citta, other.id_citta)
				&& Objects.equals(indirizzo, other.indirizzo) && Objects.equals(nome, other.nome);
	}
	
	

}
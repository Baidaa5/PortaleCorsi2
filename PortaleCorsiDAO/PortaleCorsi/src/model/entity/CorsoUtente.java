package model.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class CorsoUtente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@JoinColumn(name = "id_corso")
	private Corso id_corso;
	
	@ManyToMany
	@JoinColumn(name = "id_studente")
	private Utente id_studente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Corso getId_corso() {
		return id_corso;
	}

	public void setId_corso(Corso id_corso) {
		this.id_corso = id_corso;
	}

	public Utente getId_studente() {
		return id_studente;
	}

	public void setId_studente(Utente id_studente) {
		this.id_studente = id_studente;
	}

	@Override
	public String toString() {
		return "CorsoUtente [id=" + id + ", id_corso=" + id_corso + ", id_studente=" + id_studente + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorsoUtente other = (CorsoUtente) obj;
		return Objects.equals(id, other.id) && Objects.equals(id_corso, other.id_corso)
				&& Objects.equals(id_studente, other.id_studente);
	}
	
	
}

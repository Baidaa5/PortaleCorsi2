package model.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Voto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "esito", nullable = false)
	private String esito;
	
	@Column(name= "valutazione", nullable = false)
	private Float valutazione;
	
	@JoinColumn(name = "id_corso", nullable = false)
	private Corso id_corso;
	
	@JoinColumn(name = "id_studente", nullable = false)
	private Utente id_studente;

	@Override
	public String toString() {
		return "Voto [id=" + id + ", esito=" + esito + ", valutazione=" + valutazione + ", id_corso=" + id_corso
				+ ", id_studente=" + id_studente + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		return Objects.equals(esito, other.esito) && Objects.equals(id, other.id)
				&& Objects.equals(id_corso, other.id_corso) && Objects.equals(id_studente, other.id_studente)
				&& Objects.equals(valutazione, other.valutazione);
	}
	
	
}
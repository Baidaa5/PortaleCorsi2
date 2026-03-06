
package model.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "cognome", nullable = false)
	private String cognome;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "data_nascita", nullable = false)
	private String dataNascita;

	@Column(name = "indirizzo")
	private String indirizzo;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "matricola", nullable = false)
	private String matricola;

	@ManyToOne
	@JoinColumn(name = "id_ruolo", nullable = false)
	private Ruolo id_ruolo;

	public Utente() {

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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Ruolo getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(Ruolo id_ruolo) {
		this.id_ruolo = id_ruolo;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password="
				+ password + ", dataNascita=" + dataNascita + ", indirizzo=" + indirizzo + ", telefono=" + telefono
				+ ", matricola=" + matricola + ", id_ruolo=" + id_ruolo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(dataNascita, other.dataNascita)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(id_ruolo, other.id_ruolo) && Objects.equals(indirizzo, other.indirizzo)
				&& Objects.equals(matricola, other.matricola) && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefono, other.telefono);
	}

}

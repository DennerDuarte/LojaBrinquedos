package br.com.fiap.lojaBrinquedos.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;



@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TDS_TB_Login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "username")
    @Size(min = 10, max = 200, message = "O usuário precisa ter entre 10 e 200 caracteres")
    public String username;

    @Column(name = "email")
    @Size(min = 10, max = 200, message = "O email precisa ter entre 10 e 200 caracteres")
    public String email;

    @Column(name = "password")
    @Size(min = 5, max = 20, message = "A senha precisa ter entre 5 e 20 caracteres")
    public String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Size(min = 10, max = 200, message = "O usuário precisa ter entre 10 e 200 caracteres") String getUsername() {
        return username;
    }

    public void setUsername(@Size(min = 10, max = 200, message = "O usuário precisa ter entre 10 e 200 caracteres") String username) {
        this.username = username;
    }

    public @Size(min = 10, max = 200, message = "O email precisa ter entre 10 e 200 caracteres") String getEmail() {
        return email;
    }

    public void setEmail(@Size(min = 10, max = 200, message = "O email precisa ter entre 10 e 200 caracteres") String email) {
        this.email = email;
    }

    public @Size(min = 5, max = 20, message = "A senha precisa ter entre 5 e 20 caracteres") String getPassword() {
        return password;
    }

    public void setPassword(@Size(min = 5, max = 20, message = "A senha precisa ter entre 5 e 20 caracteres") String password) {
        this.password = password;
    }
}
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
    private Long id;

    @Column(name = "username", nullable = false, length = 200)
    @Size(min = 5, max = 200, message = "O usuário precisa ter entre 5 e 200 caracteres")
    private String username;

    @Column(name = "email", nullable = false, length = 200)
    @Size(min = 5, max = 200, message = "O email precisa ter entre 5 e 200 caracteres")
    private String email;

    @Column(name = "password", nullable = false, length = 20)
    @Size(min = 5, max = 200, message = "A senha precisa ter entre 5 e 20 caracteres")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}

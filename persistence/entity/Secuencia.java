package co.edu.poli.Examenfinal.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table (name = "adn")
public class Secuencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ElementCollection
    private List<String> datos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secuencia secuencia = (Secuencia) o;
        return Objects.equals(id, secuencia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

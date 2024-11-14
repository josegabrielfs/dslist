package com.devsuperior.dslist.entities;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_game")
@Getter
@Setter
@NoArgsConstructor         // Construtor sem argumentos
@AllArgsConstructor        // Construtor com todos os atributos
@EqualsAndHashCode(of = "id")  // equals e hashCode usando apenas o campo "id"

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
   @Column(name="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;
}
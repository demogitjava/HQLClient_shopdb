package de.jgsoftwares.hql.model.mawi;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BUCHUNGSDATEN", schema = "PUBLIC", catalog = "MAWI")
public class Buchungsdaten
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Long kdnummer;

    private String kdname;

    private Integer beleg;

    private Integer wg;

    private Double vk;

    private Date bdatum;

    private Long artikelnummer;

    private Integer belegart;

    private Integer buchungskz;

    private Integer menge;






}

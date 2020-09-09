import javax.persistence.*;

@Entity
@Table(name = "Parent")
public class Parent {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
}

package kz.iitu.anel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity{

    String name;

    @ManyToOne
    Role role;

    public Account(RoleEnum roleEnum) {
        role = switch (roleEnum) {
            case ADMIN -> new Role();
//            case STAFF:
//
//            case STUDENT:
//
//            case TEACHER:

            default -> new Role();
        };
    }
}

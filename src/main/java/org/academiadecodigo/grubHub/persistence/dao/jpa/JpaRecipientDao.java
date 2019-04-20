package org.academiadecodigo.grubHub.persistence.dao.jpa;

import org.academiadecodigo.grubHub.persistence.dao.RecipientDao;
import org.academiadecodigo.grubHub.persistence.model.Recipient;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link RecipientDao} implementation
 */
@Repository
public class JpaRecipientDao extends GenericJpaDao<Recipient> implements RecipientDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaRecipientDao() {
        super(Recipient.class);
    }
}

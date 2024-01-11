package at.htl.repository;

import at.htl.model.Artist;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class ArtistRepository {
    @Inject
    EntityManager entityManager;

    public List<Artist> getAllArtistsByYear(int year) {
        TypedQuery<Artist> query = this.entityManager.createNamedQuery(Artist.QUERY_FIND_ALL, Artist.class);
        query.setParameter("year", year);

        return query.getResultList(); // list is empty if there are no results
    }

    public Artist getArtistById(int id) {
        try {
            TypedQuery<Artist> query = this.entityManager.createNamedQuery(Artist.QUERY_FIND_BY_ID, Artist.class);
            query.setParameter("id", id);

            return query.getSingleResult();
        } catch (NoResultException e) {
            throw new NotFoundException(String.format("No artist found with id %d!", id));
        }
    }
}

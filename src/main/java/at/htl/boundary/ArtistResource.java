package at.htl.boundary;

import at.htl.model.Artist;
import at.htl.repository.ArtistRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/artist/")
public class ArtistResource {
    @Inject
    ArtistRepository artistRepository;

    @GET
    @Path("list/by-year/{year}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Artist> getAllArtistsByYear(@PathParam("year") int year) {
        return artistRepository.getAllArtistsByYear(year);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Artist getArtistById(@PathParam("id") int id) {
        return artistRepository.getArtistById(id);
    }
}
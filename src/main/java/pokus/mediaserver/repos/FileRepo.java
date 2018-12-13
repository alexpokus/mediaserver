package pokus.mediaserver.repos;

import org.springframework.data.repository.CrudRepository;
import pokus.mediaserver.domain.Mediafile;

public interface FileRepo extends CrudRepository<Mediafile, Long> {
}

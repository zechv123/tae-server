package kr.tae.server.repository;

import kr.tae.server.domain.AddVideos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AddVideosRepository extends JpaRepository<AddVideos, Long> {
    @Transactional
    long deleteById(long id);

    List<AddVideos> findById(long id);
}
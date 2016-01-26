package kr.tae.server.repository;

import kr.tae.server.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Transactional
    long deleteById(long id);

    List<Post> findById(long id);
}
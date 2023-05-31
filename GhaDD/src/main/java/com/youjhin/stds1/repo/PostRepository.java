package com.youjhin.stds1.repo;

import com.youjhin.stds1.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}

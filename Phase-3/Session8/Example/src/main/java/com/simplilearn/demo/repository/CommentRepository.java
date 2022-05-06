package com.simplilearn.demo.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.demo.model.Comment;
public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByTutorialId(Long postId);
  
  @Transactional
  void deleteByTutorialId(long tutorialId);
}
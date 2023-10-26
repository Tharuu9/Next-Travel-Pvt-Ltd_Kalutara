package com.tharuka.aad.guide_service.repository;

import com.tharuka.aad.guide_service.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Integer> {
    @Query("SELECT guide FROM Guide guide WHERE guide.status='Available'")
    Guide findFirstAvailableGuide();
}

package com.naumov.social.repository;

import com.naumov.social.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarReposiory extends JpaRepository<Avatar, Long> {

}

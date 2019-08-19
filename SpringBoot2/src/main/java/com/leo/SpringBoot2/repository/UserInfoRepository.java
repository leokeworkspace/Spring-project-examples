package com.leo.SpringBoot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leo.SpringBoot2.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}

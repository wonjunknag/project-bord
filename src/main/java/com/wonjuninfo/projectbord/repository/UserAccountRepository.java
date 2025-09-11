package com.wonjuninfo.projectbord.repository;


import com.wonjuninfo.projectbord.domain.UserAccount;
import com.wonjuninfo.projectbord.domain.projection.UserAccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}

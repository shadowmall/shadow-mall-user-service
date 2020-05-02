package org.shadow.mall.service;

import java.util.List;

import org.shadow.mall.entity.SystemUser;
import org.shadow.mall.repository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserService {
	@Autowired
	private SystemUserRepository systemUserRepository;
	
	public List<SystemUser> findAll(){
		return (List<SystemUser>) systemUserRepository.findAll();
	}
	
	public SystemUser save(SystemUser systemUser) {
		return systemUserRepository.save(systemUser);
	}

	public SystemUserRepository getSystemUserRepository() {
		return systemUserRepository;
	}

	public void setSystemUserRepository(SystemUserRepository systemUserRepository) {
		this.systemUserRepository = systemUserRepository;
	}
	
	

}

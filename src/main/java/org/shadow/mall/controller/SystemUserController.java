package org.shadow.mall.controller;

import org.shadow.mall.entity.ResponseMap;
import org.shadow.mall.entity.SystemUser;
import org.shadow.mall.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemUserController {
	@Autowired
	private SystemUserService systemUserService;
	
	@GetMapping(name = "查询所有用户信息", path = "/system/user")
	public ResponseMap<SystemUser> findAll(){
		return ResponseMap.createResponse(new ResponseMap<SystemUser>(), HttpStatus.OK, null, systemUserService.findAll());
	}
	
	@PostMapping(name = "添加新用户", path = "/system/user")
	public ResponseMap<SystemUser> save(
			@RequestBody SystemUser systemUser){
		SystemUser data = systemUserService.save(systemUser);
		return ResponseMap.createResponse(new ResponseMap<SystemUser>(), HttpStatus.OK, data);
	}
	

	public SystemUserService getSystemUserService() {
		return systemUserService;
	}

	public void setSystemUserService(SystemUserService systemUserService) {
		this.systemUserService = systemUserService;
	}

}

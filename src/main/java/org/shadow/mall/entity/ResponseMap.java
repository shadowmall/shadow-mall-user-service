package org.shadow.mall.entity;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;

public class ResponseMap<T> {
	
	public static <T> ResponseMap<T> createResponse(ResponseMap<T> res, HttpStatus status) {
		return createResponse(res, status, null);
	}
	
	public static <T> ResponseMap<T> createResponse(ResponseMap<T> res, HttpStatus status, T data) {
		return createResponse(res, status, data, null);
	}
	
	public static <T> ResponseMap<T> createResponse(ResponseMap<T> res, HttpStatus status, T data, List<T> list) {
		return createResponse(res, status, data, list, null);
	}
	
	public static <T> ResponseMap<T> createResponse(ResponseMap<T> res,HttpStatus status, T data, List<T> list, Map<String, Object> dataMap) {
		res.setStatus(status);
		res.setData(data);
		res.setList(list);;
		res.setDataMap(dataMap);;
		return res;
	}
	
	private HttpStatus status;
	
	private T data;
	
	private List<T> list;
	
	private Map<String, Object> dataMap;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
	
}

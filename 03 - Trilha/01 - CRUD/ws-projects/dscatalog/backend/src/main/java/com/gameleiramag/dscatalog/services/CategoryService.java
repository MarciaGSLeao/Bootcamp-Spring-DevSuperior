package com.gameleiramag.dscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gameleiramag.dscatalog.dto.CategoryDTO;
import com.gameleiramag.dscatalog.entities.Category;
import com.gameleiramag.dscatalog.repositories.CategoryRepository;
import com.gameleiramag.dscatalog.services.exceptions.EntityNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		return list.stream()
				.map(e -> new CategoryDTO(e))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Registro não encontrado!"));
		return new CategoryDTO(entity);
	}
}

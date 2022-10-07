package com.api.farmacia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categories")
public class Category extends BaseEntity{
	
	
	private String description;
	@OneToMany(mappedBy = "categoryId")
	List<Product> produtcts;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProdutcts() {
		return produtcts;
	}
	public void setProdutcts(List<Product> produtcts) {
		this.produtcts = produtcts;
	}
	
	
}

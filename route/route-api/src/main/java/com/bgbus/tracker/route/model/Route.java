package com.bgbus.tracker.route.model;

import java.io.Serial;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.chenile.jpautils.entity.AbstractJpaStateEntity;
@Entity
@Table(name = "route")
public class Route extends AbstractJpaStateEntity{
    @Serial
	private static final long serialVersionUID = 1L;
	public String assignee;
	public String assignComment;
	public String closeComment;
	public String resolveComment;
	public String description;
	public String openedBy;
}
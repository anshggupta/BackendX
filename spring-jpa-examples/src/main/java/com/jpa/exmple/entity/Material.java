package com.jpa.exmple.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Material")
public class Material {

    @Id
    @Column(name = "materialId")
    private int materialId;

    @Column(name = "materialTpye")
    private String materialType;

    @Column(name = "materialCost")
    private double materialCost;

    @Column(name = "materialResource")
    private String materialResource;

    @Column (name = "value")
    private int value;





    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public String getMaterialResource() {
        return materialResource;
    }

    public void setMaterialResource(String materialResource) {
        this.materialResource = materialResource;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



}

package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Лимит на установку кванта и минимального количества товаров по категориям. 
 **/
@ApiModel(description="Лимит на установку кванта и минимального количества товаров по категориям. ")

public class MaxSaleQuantumDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
 /**
   * Идентификатор категории.
  **/
  private Long id;

  @ApiModelProperty(value = "Название категории.")
 /**
   * Название категории.
  **/
  private String name;

  @ApiModelProperty(value = "Лимит на установку кванта и минимального количества товаров.")
 /**
   * Лимит на установку кванта и минимального количества товаров.
  **/
  private Integer maxSaleQuantum;
 /**
   * Идентификатор категории.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MaxSaleQuantumDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название категории.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MaxSaleQuantumDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Лимит на установку кванта и минимального количества товаров.
   * @return maxSaleQuantum
  **/
  @JsonProperty("maxSaleQuantum")
  public Integer getMaxSaleQuantum() {
    return maxSaleQuantum;
  }

  public void setMaxSaleQuantum(Integer maxSaleQuantum) {
    this.maxSaleQuantum = maxSaleQuantum;
  }

  public MaxSaleQuantumDTO maxSaleQuantum(Integer maxSaleQuantum) {
    this.maxSaleQuantum = maxSaleQuantum;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxSaleQuantumDTO maxSaleQuantumDTO = (MaxSaleQuantumDTO) o;
    return Objects.equals(this.id, maxSaleQuantumDTO.id) &&
        Objects.equals(this.name, maxSaleQuantumDTO.name) &&
        Objects.equals(this.maxSaleQuantum, maxSaleQuantumDTO.maxSaleQuantum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, maxSaleQuantum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxSaleQuantumDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxSaleQuantum: ").append(toIndentedString(maxSaleQuantum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


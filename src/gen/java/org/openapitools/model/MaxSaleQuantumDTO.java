package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 **/
@ApiModel(description = "Лимит на установку кванта и минимального количества товаров по категориям. ")
@JsonTypeName("MaxSaleQuantumDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MaxSaleQuantumDTO   {
  private Long id;
  private String name;
  private Integer maxSaleQuantum;

  /**
   * Идентификатор категории.
   **/
  public MaxSaleQuantumDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  @JsonProperty("id")
  @NotNull public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название категории.
   **/
  public MaxSaleQuantumDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название категории.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Лимит на установку кванта и минимального количества товаров.
   **/
  public MaxSaleQuantumDTO maxSaleQuantum(Integer maxSaleQuantum) {
    this.maxSaleQuantum = maxSaleQuantum;
    return this;
  }

  
  @ApiModelProperty(value = "Лимит на установку кванта и минимального количества товаров.")
  @JsonProperty("maxSaleQuantum")
  public Integer getMaxSaleQuantum() {
    return maxSaleQuantum;
  }

  @JsonProperty("maxSaleQuantum")
  public void setMaxSaleQuantum(Integer maxSaleQuantum) {
    this.maxSaleQuantum = maxSaleQuantum;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


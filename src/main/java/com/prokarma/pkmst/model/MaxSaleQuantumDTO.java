package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */
@ApiModel(description = "Лимит на установку кванта и минимального количества товаров по категориям. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MaxSaleQuantumDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("maxSaleQuantum")
  private Integer maxSaleQuantum;

  public MaxSaleQuantumDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор категории.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MaxSaleQuantumDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название категории.
   * @return name
   */
  @ApiModelProperty(value = "Название категории.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MaxSaleQuantumDTO maxSaleQuantum(Integer maxSaleQuantum) {
    this.maxSaleQuantum = maxSaleQuantum;
    return this;
  }

  /**
   * Лимит на установку кванта и минимального количества товаров.
   * @return maxSaleQuantum
   */
  @ApiModelProperty(value = "Лимит на установку кванта и минимального количества товаров.")
  public Integer getMaxSaleQuantum() {
    return maxSaleQuantum;
  }

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


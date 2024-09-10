package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 **/

@ApiModel(description = "Лимит на установку кванта и минимального количества товаров по категориям. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MaxSaleQuantumDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("maxSaleQuantum")
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
  public Long getId() {
    return id;
  }
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
    return Objects.equals(id, maxSaleQuantumDTO.id) &&
        Objects.equals(name, maxSaleQuantumDTO.name) &&
        Objects.equals(maxSaleQuantum, maxSaleQuantumDTO.maxSaleQuantum);
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


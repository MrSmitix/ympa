package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaxSaleQuantumDTO   {
  
  private Long id;
  private String name;
  private Integer maxSaleQuantum;

  public MaxSaleQuantumDTO () {

  }

  public MaxSaleQuantumDTO (Long id, String name, Integer maxSaleQuantum) {
    this.id = id;
    this.name = name;
    this.maxSaleQuantum = maxSaleQuantum;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
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

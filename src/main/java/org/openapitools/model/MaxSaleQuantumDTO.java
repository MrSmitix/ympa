package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */

@Schema(name = "MaxSaleQuantumDTO", description = "Лимит на установку кванта и минимального количества товаров по категориям. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MaxSaleQuantumDTO {

  private Long id;

  private String name;

  private Integer maxSaleQuantum;

  public MaxSaleQuantumDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MaxSaleQuantumDTO(Long id) {
    this.id = id;
  }

  public MaxSaleQuantumDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор категории.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "name", description = "Название категории.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
  
  @Schema(name = "maxSaleQuantum", description = "Лимит на установку кванта и минимального количества товаров.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


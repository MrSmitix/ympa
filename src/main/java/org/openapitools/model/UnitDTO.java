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
 * Единица измерения.
 */

@Schema(name = "UnitDTO", description = "Единица измерения.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UnitDTO {

  private Long id;

  private String name;

  private String fullName;

  public UnitDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UnitDTO(Long id, String name, String fullName) {
    this.id = id;
    this.name = name;
    this.fullName = fullName;
  }

  public UnitDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор единицы измерения.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор единицы измерения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UnitDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Сокращенное название единицы измерения.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "кг", description = "Сокращенное название единицы измерения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnitDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Полное название единицы измерения.
   * @return fullName
   */
  @NotNull 
  @Schema(name = "fullName", example = "килограмм", description = "Полное название единицы измерения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitDTO unitDTO = (UnitDTO) o;
    return Objects.equals(this.id, unitDTO.id) &&
        Objects.equals(this.name, unitDTO.name) &&
        Objects.equals(this.fullName, unitDTO.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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


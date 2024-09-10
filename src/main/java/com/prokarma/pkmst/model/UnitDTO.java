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
 * Единица измерения.
 */
@ApiModel(description = "Единица измерения.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UnitDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("fullName")
  private String fullName;

  public UnitDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор единицы измерения.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор единицы измерения.")
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
  @ApiModelProperty(example = "кг", required = true, value = "Сокращенное название единицы измерения.")
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
  @ApiModelProperty(example = "килограмм", required = true, value = "Полное название единицы измерения.")
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


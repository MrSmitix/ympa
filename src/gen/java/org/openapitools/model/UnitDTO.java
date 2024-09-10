package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Единица измерения.
 */
@ApiModel(description="Единица измерения.")

public class UnitDTO  {
  
 /**
  * Идентификатор единицы измерения.
  */
  @ApiModelProperty(required = true, value = "Идентификатор единицы измерения.")
  private Long id;

 /**
  * Сокращенное название единицы измерения.
  */
  @ApiModelProperty(example = "кг", required = true, value = "Сокращенное название единицы измерения.")
  private String name;

 /**
  * Полное название единицы измерения.
  */
  @ApiModelProperty(example = "килограмм", required = true, value = "Полное название единицы измерения.")
  private String fullName;
 /**
  * Идентификатор единицы измерения.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public UnitDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Сокращенное название единицы измерения.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public UnitDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Полное название единицы измерения.
  * @return fullName
  */
  @JsonProperty("fullName")
  @NotNull
  public String getFullName() {
    return fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
 public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public UnitDTO fullName(String fullName) {
    this.fullName = fullName;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


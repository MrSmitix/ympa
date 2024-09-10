package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Значение характеристики.
 **/
@ApiModel(description="Значение характеристики.")

public class ParameterValueOptionDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор значения.")
 /**
   * Идентификатор значения.
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Значение.")
 /**
   * Значение.
  **/
  private String value;

  @ApiModelProperty(value = "Описание значения.")
 /**
   * Описание значения.
  **/
  private String description;
 /**
   * Идентификатор значения.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParameterValueOptionDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Значение.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ParameterValueOptionDTO value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Описание значения.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ParameterValueOptionDTO description(String description) {
    this.description = description;
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
    ParameterValueOptionDTO parameterValueOptionDTO = (ParameterValueOptionDTO) o;
    return Objects.equals(this.id, parameterValueOptionDTO.id) &&
        Objects.equals(this.value, parameterValueOptionDTO.value) &&
        Objects.equals(this.description, parameterValueOptionDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueOptionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Детали расчета конкретной услуги Маркета.
 **/
@ApiModel(description="Детали расчета конкретной услуги Маркета.")

public class TariffParameterDTO  {
  
  @ApiModelProperty(required = true, value = "Название параметра.")
 /**
   * Название параметра.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "Значение параметра.")
 /**
   * Значение параметра.
  **/
  private String value;
 /**
   * Название параметра.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TariffParameterDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Значение параметра.
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TariffParameterDTO value(String value) {
    this.value = value;
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
    TariffParameterDTO tariffParameterDTO = (TariffParameterDTO) o;
    return Objects.equals(this.name, tariffParameterDTO.name) &&
        Objects.equals(this.value, tariffParameterDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffParameterDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


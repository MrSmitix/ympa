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
 * Детали расчета конкретной услуги Маркета.
 */
@ApiModel(description = "Детали расчета конкретной услуги Маркета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffParameterDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public TariffParameterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название параметра.
   * @return name
   */
  @ApiModelProperty(required = true, value = "Название параметра.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TariffParameterDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение параметра.
   * @return value
   */
  @ApiModelProperty(required = true, value = "Значение параметра.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


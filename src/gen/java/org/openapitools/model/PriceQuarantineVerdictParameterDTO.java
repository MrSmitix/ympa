package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PriceQuarantineVerdictParamNameType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Параметр карантина.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Параметр карантина.")
public class PriceQuarantineVerdictParameterDTO   {
  
  private PriceQuarantineVerdictParamNameType name;

  private String value;

  /**
   **/
  public PriceQuarantineVerdictParameterDTO name(PriceQuarantineVerdictParamNameType name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public PriceQuarantineVerdictParamNameType getName() {
    return name;
  }
  public void setName(PriceQuarantineVerdictParamNameType name) {
    this.name = name;
  }


  /**
   * Значение параметра.
   **/
  public PriceQuarantineVerdictParameterDTO value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение параметра.")
  @JsonProperty("value")
  @NotNull
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
    PriceQuarantineVerdictParameterDTO priceQuarantineVerdictParameterDTO = (PriceQuarantineVerdictParameterDTO) o;
    return Objects.equals(this.name, priceQuarantineVerdictParameterDTO.name) &&
        Objects.equals(this.value, priceQuarantineVerdictParameterDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceQuarantineVerdictParameterDTO {\n");
    
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


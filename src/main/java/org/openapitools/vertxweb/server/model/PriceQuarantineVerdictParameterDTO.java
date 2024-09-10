package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.PriceQuarantineVerdictParamNameType;

/**
 * Параметр карантина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceQuarantineVerdictParameterDTO   {
  
  private PriceQuarantineVerdictParamNameType name;
  private String value;

  public PriceQuarantineVerdictParameterDTO () {

  }

  public PriceQuarantineVerdictParameterDTO (PriceQuarantineVerdictParamNameType name, String value) {
    this.name = name;
    this.value = value;
  }

    
  @JsonProperty("name")
  public PriceQuarantineVerdictParamNameType getName() {
    return name;
  }
  public void setName(PriceQuarantineVerdictParamNameType name) {
    this.name = name;
  }

    
  @JsonProperty("value")
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
    return Objects.equals(name, priceQuarantineVerdictParameterDTO.name) &&
        Objects.equals(value, priceQuarantineVerdictParameterDTO.value);
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

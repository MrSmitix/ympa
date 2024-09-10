package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.PriceQuarantineVerdictParameterDTO;
import org.openapitools.server.api.model.PriceQuarantineVerdictType;

/**
 * Причина попадания товара в карантин.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceQuarantineVerdictDTO   {
  
  private PriceQuarantineVerdictType type;
  private List<PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

  public PriceQuarantineVerdictDTO () {

  }

  public PriceQuarantineVerdictDTO (PriceQuarantineVerdictType type, List<PriceQuarantineVerdictParameterDTO> params) {
    this.type = type;
    this.params = params;
  }

    
  @JsonProperty("type")
  public PriceQuarantineVerdictType getType() {
    return type;
  }
  public void setType(PriceQuarantineVerdictType type) {
    this.type = type;
  }

    
  @JsonProperty("params")
  public List<PriceQuarantineVerdictParameterDTO> getParams() {
    return params;
  }
  public void setParams(List<PriceQuarantineVerdictParameterDTO> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceQuarantineVerdictDTO priceQuarantineVerdictDTO = (PriceQuarantineVerdictDTO) o;
    return Objects.equals(type, priceQuarantineVerdictDTO.type) &&
        Objects.equals(params, priceQuarantineVerdictDTO.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceQuarantineVerdictDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

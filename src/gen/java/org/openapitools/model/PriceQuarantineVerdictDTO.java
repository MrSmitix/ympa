package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PriceQuarantineVerdictParameterDTO;
import org.openapitools.model.PriceQuarantineVerdictType;



/**
 * Причина попадания товара в карантин.
 **/

@ApiModel(description = "Причина попадания товара в карантин.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceQuarantineVerdictDTO   {
  @JsonProperty("type")
  private PriceQuarantineVerdictType type;

  @JsonProperty("params")
  private List<PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

  /**
   **/
  public PriceQuarantineVerdictDTO type(PriceQuarantineVerdictType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public PriceQuarantineVerdictType getType() {
    return type;
  }
  public void setType(PriceQuarantineVerdictType type) {
    this.type = type;
  }

  /**
   * Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
   **/
  public PriceQuarantineVerdictDTO params(List<PriceQuarantineVerdictParameterDTO> params) {
    this.params = params;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.")
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


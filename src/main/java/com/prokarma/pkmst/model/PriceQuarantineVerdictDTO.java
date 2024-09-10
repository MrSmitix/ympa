package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.PriceQuarantineVerdictParameterDTO;
import com.prokarma.pkmst.model.PriceQuarantineVerdictType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Причина попадания товара в карантин.
 */
@ApiModel(description = "Причина попадания товара в карантин.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceQuarantineVerdictDTO   {
  @JsonProperty("type")
  private PriceQuarantineVerdictType type;

  @JsonProperty("params")
  
  private List<PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

  public PriceQuarantineVerdictDTO type(PriceQuarantineVerdictType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(value = "")
  public PriceQuarantineVerdictType getType() {
    return type;
  }

  public void setType(PriceQuarantineVerdictType type) {
    this.type = type;
  }

  public PriceQuarantineVerdictDTO params(List<PriceQuarantineVerdictParameterDTO> params) {
    this.params = params;
    return this;
  }

  public PriceQuarantineVerdictDTO addParamsItem(PriceQuarantineVerdictParameterDTO paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
   * @return params
   */
  @ApiModelProperty(required = true, value = "Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.")
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
    return Objects.equals(this.type, priceQuarantineVerdictDTO.type) &&
        Objects.equals(this.params, priceQuarantineVerdictDTO.params);
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


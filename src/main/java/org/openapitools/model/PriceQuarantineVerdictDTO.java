package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PriceQuarantineVerdictParameterDTO;
import org.openapitools.model.PriceQuarantineVerdictType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Причина попадания товара в карантин.
 */

@Schema(name = "PriceQuarantineVerdictDTO", description = "Причина попадания товара в карантин.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceQuarantineVerdictDTO {

  private PriceQuarantineVerdictType type;

  @Valid
  private List<@Valid PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

  public PriceQuarantineVerdictDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceQuarantineVerdictDTO(List<@Valid PriceQuarantineVerdictParameterDTO> params) {
    this.params = params;
  }

  public PriceQuarantineVerdictDTO type(PriceQuarantineVerdictType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public PriceQuarantineVerdictType getType() {
    return type;
  }

  public void setType(PriceQuarantineVerdictType type) {
    this.type = type;
  }

  public PriceQuarantineVerdictDTO params(List<@Valid PriceQuarantineVerdictParameterDTO> params) {
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
  @NotNull @Valid 
  @Schema(name = "params", description = "Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("params")
  public List<@Valid PriceQuarantineVerdictParameterDTO> getParams() {
    return params;
  }

  public void setParams(List<@Valid PriceQuarantineVerdictParameterDTO> params) {
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


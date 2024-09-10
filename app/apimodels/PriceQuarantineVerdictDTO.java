package apimodels;

import apimodels.PriceQuarantineVerdictParameterDTO;
import apimodels.PriceQuarantineVerdictType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Причина попадания товара в карантин.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PriceQuarantineVerdictDTO   {
  @JsonProperty("type")
  @Valid

  private PriceQuarantineVerdictType type;

  @JsonProperty("params")
  @NotNull
@Valid

  private List<@Valid PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

  public PriceQuarantineVerdictDTO type(PriceQuarantineVerdictType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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
    return Objects.equals(type, priceQuarantineVerdictDTO.type) &&
        Objects.equals(params, priceQuarantineVerdictDTO.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, params);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


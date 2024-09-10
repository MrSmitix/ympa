package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CalculatedTariffType;
import org.openapitools.vertxweb.server.model.TariffParameterDTO;

/**
 * Информация об услугах Маркета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculatedTariffDTO   {
  
  private CalculatedTariffType type;
  private BigDecimal amount;
  private List<TariffParameterDTO> parameters = new ArrayList<>();

  public CalculatedTariffDTO () {

  }

  public CalculatedTariffDTO (CalculatedTariffType type, BigDecimal amount, List<TariffParameterDTO> parameters) {
    this.type = type;
    this.amount = amount;
    this.parameters = parameters;
  }

    
  @JsonProperty("type")
  public CalculatedTariffType getType() {
    return type;
  }
  public void setType(CalculatedTariffType type) {
    this.type = type;
  }

    
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

    
  @JsonProperty("parameters")
  public List<TariffParameterDTO> getParameters() {
    return parameters;
  }
  public void setParameters(List<TariffParameterDTO> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatedTariffDTO calculatedTariffDTO = (CalculatedTariffDTO) o;
    return Objects.equals(type, calculatedTariffDTO.type) &&
        Objects.equals(amount, calculatedTariffDTO.amount) &&
        Objects.equals(parameters, calculatedTariffDTO.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedTariffDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

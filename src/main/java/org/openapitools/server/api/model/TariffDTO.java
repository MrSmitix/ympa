package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.TariffParameterDTO;
import org.openapitools.server.api.model.TariffType;

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TariffDTO   {
  
  private TariffType type;
  private BigDecimal percent;
  private BigDecimal amount;
  private List<TariffParameterDTO> parameters = new ArrayList<>();

  public TariffDTO () {

  }

  public TariffDTO (TariffType type, BigDecimal percent, BigDecimal amount, List<TariffParameterDTO> parameters) {
    this.type = type;
    this.percent = percent;
    this.amount = amount;
    this.parameters = parameters;
  }

    
  @JsonProperty("type")
  public TariffType getType() {
    return type;
  }
  public void setType(TariffType type) {
    this.type = type;
  }

    
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }
  public void setPercent(BigDecimal percent) {
    this.percent = percent;
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
    TariffDTO tariffDTO = (TariffDTO) o;
    return Objects.equals(type, tariffDTO.type) &&
        Objects.equals(percent, tariffDTO.percent) &&
        Objects.equals(amount, tariffDTO.amount) &&
        Objects.equals(parameters, tariffDTO.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, percent, amount, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

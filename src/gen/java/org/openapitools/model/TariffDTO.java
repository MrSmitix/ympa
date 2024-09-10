package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TariffParameterDTO;
import org.openapitools.model.TariffType;



/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 **/

@ApiModel(description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffDTO   {
  @JsonProperty("type")
  private TariffType type;

  @JsonProperty("percent")
  private BigDecimal percent;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("parameters")
  private List<TariffParameterDTO> parameters = new ArrayList<>();

  /**
   **/
  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public TariffType getType() {
    return type;
  }
  public void setType(TariffType type) {
    this.type = type;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
   **/
  public TariffDTO percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }
  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  /**
   * Значение тарифа в рублях.
   **/
  public TariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение тарифа в рублях.")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Параметры расчета тарифа.
   **/
  public TariffDTO parameters(List<TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
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


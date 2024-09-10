package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TariffParameterDTO;
import com.prokarma.pkmst.model.TariffType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
@ApiModel(description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffDTO   {
  @JsonProperty("type")
  private TariffType type;

  @JsonProperty("percent")
  private BigDecimal percent;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("parameters")
  
  private List<TariffParameterDTO> parameters = new ArrayList<>();

  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public TariffType getType() {
    return type;
  }

  public void setType(TariffType type) {
    this.type = type;
  }

  public TariffDTO percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
   * @return percent
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public TariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Значение тарифа в рублях.
   * @return amount
   */
  @ApiModelProperty(required = true, value = "Значение тарифа в рублях.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TariffDTO parameters(List<TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TariffDTO addParametersItem(TariffParameterDTO parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Параметры расчета тарифа.
   * @return parameters
   */
  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
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
    return Objects.equals(this.type, tariffDTO.type) &&
        Objects.equals(this.percent, tariffDTO.percent) &&
        Objects.equals(this.amount, tariffDTO.amount) &&
        Objects.equals(this.parameters, tariffDTO.parameters);
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


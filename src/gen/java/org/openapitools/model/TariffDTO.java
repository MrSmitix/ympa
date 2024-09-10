package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TariffParameterDTO;
import org.openapitools.model.TariffType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 **/
@ApiModel(description="Информация о тарифах, по которым нужно заплатить за услуги Маркета.")

public class TariffDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private TariffType type;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  **/
  private BigDecimal percent;

  @ApiModelProperty(required = true, value = "Значение тарифа в рублях.")
  @Valid
 /**
   * Значение тарифа в рублях.
  **/
  private BigDecimal amount;

  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
  @Valid
 /**
   * Параметры расчета тарифа.
  **/
  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public TariffType getType() {
    return type;
  }

  public void setType(TariffType type) {
    this.type = type;
  }

  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
   * @return percent
  **/
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public TariffDTO percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

 /**
   * Значение тарифа в рублях.
   * @return amount
  **/
  @JsonProperty("amount")
  @NotNull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Параметры расчета тарифа.
   * @return parameters
  **/
  @JsonProperty("parameters")
  @NotNull
  public List<@Valid TariffParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
  }

  public TariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TariffDTO addParametersItem(TariffParameterDTO parametersItem) {
    this.parameters.add(parametersItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


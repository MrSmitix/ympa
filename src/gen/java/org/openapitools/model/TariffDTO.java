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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
@ApiModel(description="Информация о тарифах, по которым нужно заплатить за услуги Маркета.")

public class TariffDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private TariffType type;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
  @Valid
  private BigDecimal percent;

 /**
  * Значение тарифа в рублях.
  */
  @ApiModelProperty(required = true, value = "Значение тарифа в рублях.")
  @Valid
  private BigDecimal amount;

 /**
  * Параметры расчета тарифа.
  */
  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
  @Valid
  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public TariffType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TariffType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  * @return percent
  */
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
 public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
  public TariffDTO percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

 /**
  * Значение тарифа в рублях.
  * @return amount
  */
  @JsonProperty("amount")
  @NotNull
  public BigDecimal getAmount() {
    return amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
 public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
  public TariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

 /**
  * Параметры расчета тарифа.
  * @return parameters
  */
  @JsonProperty("parameters")
  @NotNull
  public List<@Valid TariffParameterDTO> getParameters() {
    return parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
 public void setParameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
  public TariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Adds a new item to the <code>parameters</code> list.
   */
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


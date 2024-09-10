/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
@ApiModel(description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.")
@JsonPropertyOrder({
  TariffDTO.JSON_PROPERTY_TYPE,
  TariffDTO.JSON_PROPERTY_PERCENT,
  TariffDTO.JSON_PROPERTY_AMOUNT,
  TariffDTO.JSON_PROPERTY_PARAMETERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffDTO   {
  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TariffType type;

  public static final String JSON_PROPERTY_PERCENT = "percent";
  @JsonProperty(JSON_PROPERTY_PERCENT)
  private BigDecimal percent;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  private BigDecimal amount;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
   * @return percent
   **/
  @JsonProperty(value = "percent")
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
  @Valid 
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
   **/
  @JsonProperty(value = "amount")
  @ApiModelProperty(required = true, value = "Значение тарифа в рублях.")
  @NotNull @Valid 
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
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
   **/
  @JsonProperty(value = "parameters")
  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
  @NotNull @Valid 
  public List<@Valid TariffParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid TariffParameterDTO> parameters) {
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


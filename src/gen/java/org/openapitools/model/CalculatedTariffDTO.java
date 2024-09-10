package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculatedTariffType;
import org.openapitools.model.TariffParameterDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об услугах Маркета.
 */
@ApiModel(description="Информация об услугах Маркета.")

public class CalculatedTariffDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CalculatedTariffType type;

 /**
  * Стоимость услуги в рублях.
  */
  @ApiModelProperty(value = "Стоимость услуги в рублях.")
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
  public CalculatedTariffType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(CalculatedTariffType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CalculatedTariffDTO type(CalculatedTariffType type) {
    this.type = type;
    return this;
  }

 /**
  * Стоимость услуги в рублях.
  * @return amount
  */
  @JsonProperty("amount")
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
  public CalculatedTariffDTO amount(BigDecimal amount) {
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
  public CalculatedTariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Adds a new item to the <code>parameters</code> list.
   */
  public CalculatedTariffDTO addParametersItem(TariffParameterDTO parametersItem) {
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
    CalculatedTariffDTO calculatedTariffDTO = (CalculatedTariffDTO) o;
    return Objects.equals(this.type, calculatedTariffDTO.type) &&
        Objects.equals(this.amount, calculatedTariffDTO.amount) &&
        Objects.equals(this.parameters, calculatedTariffDTO.parameters);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


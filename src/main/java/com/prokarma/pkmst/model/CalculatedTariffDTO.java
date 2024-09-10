package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CalculatedTariffType;
import com.prokarma.pkmst.model.TariffParameterDTO;
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
 * Информация об услугах Маркета.
 */
@ApiModel(description = "Информация об услугах Маркета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculatedTariffDTO   {
  @JsonProperty("type")
  private CalculatedTariffType type;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("parameters")
  
  private List<TariffParameterDTO> parameters = new ArrayList<>();

  public CalculatedTariffDTO type(CalculatedTariffType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public CalculatedTariffType getType() {
    return type;
  }

  public void setType(CalculatedTariffType type) {
    this.type = type;
  }

  public CalculatedTariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Стоимость услуги в рублях.
   * @return amount
   */
  @ApiModelProperty(value = "Стоимость услуги в рублях.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CalculatedTariffDTO parameters(List<TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CalculatedTariffDTO addParametersItem(TariffParameterDTO parametersItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

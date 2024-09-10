package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculatedTariffType;
import org.openapitools.model.TariffParameterDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об услугах Маркета.
 **/
@ApiModel(description = "Информация об услугах Маркета.")
@JsonTypeName("CalculatedTariffDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculatedTariffDTO   {
  private CalculatedTariffType type;
  private BigDecimal amount;
  private @Valid List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

  /**
   **/
  public CalculatedTariffDTO type(CalculatedTariffType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull public CalculatedTariffType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(CalculatedTariffType type) {
    this.type = type;
  }

  /**
   * Стоимость услуги в рублях.
   **/
  public CalculatedTariffDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "Стоимость услуги в рублях.")
  @JsonProperty("amount")
  @Valid public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Параметры расчета тарифа.
   **/
  public CalculatedTariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Параметры расчета тарифа.")
  @JsonProperty("parameters")
  @NotNull @Valid public List<@Valid TariffParameterDTO> getParameters() {
    return parameters;
  }

  @JsonProperty("parameters")
  public void setParameters(List<@Valid TariffParameterDTO> parameters) {
    this.parameters = parameters;
  }

  public CalculatedTariffDTO addParametersItem(TariffParameterDTO parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }

    this.parameters.add(parametersItem);
    return this;
  }

  public CalculatedTariffDTO removeParametersItem(TariffParameterDTO parametersItem) {
    if (parametersItem != null && this.parameters != null) {
      this.parameters.remove(parametersItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


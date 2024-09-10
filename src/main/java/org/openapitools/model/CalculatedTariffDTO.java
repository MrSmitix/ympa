package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculatedTariffType;
import org.openapitools.model.TariffParameterDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об услугах Маркета.
 */

@Schema(name = "CalculatedTariffDTO", description = "Информация об услугах Маркета.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculatedTariffDTO {

  private CalculatedTariffType type;

  private BigDecimal amount;

  @Valid
  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

  public CalculatedTariffDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CalculatedTariffDTO(CalculatedTariffType type, List<@Valid TariffParameterDTO> parameters) {
    this.type = type;
    this.parameters = parameters;
  }

  public CalculatedTariffDTO type(CalculatedTariffType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
  @Valid 
  @Schema(name = "amount", description = "Стоимость услуги в рублях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CalculatedTariffDTO parameters(List<@Valid TariffParameterDTO> parameters) {
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
  @NotNull @Valid 
  @Schema(name = "parameters", description = "Параметры расчета тарифа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parameters")
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


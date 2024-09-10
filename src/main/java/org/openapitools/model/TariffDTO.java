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
import org.openapitools.model.TariffParameterDTO;
import org.openapitools.model.TariffType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */

@Schema(name = "TariffDTO", description = "Информация о тарифах, по которым нужно заплатить за услуги Маркета.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffDTO {

  private TariffType type;

  @Deprecated
  private BigDecimal percent;

  private BigDecimal amount;

  @Valid
  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

  public TariffDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TariffDTO(TariffType type, BigDecimal amount, List<@Valid TariffParameterDTO> parameters) {
    this.type = type;
    this.amount = amount;
    this.parameters = parameters;
  }

  public TariffDTO type(TariffType type) {
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
   * @deprecated
   */
  @Valid 
  @Schema(name = "percent", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  @Deprecated
  public BigDecimal getPercent() {
    return percent;
  }

  /**
   * @deprecated
   */
  @Deprecated
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
  @NotNull @Valid 
  @Schema(name = "amount", description = "Значение тарифа в рублях.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
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


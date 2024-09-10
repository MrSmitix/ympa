package apimodels;

import apimodels.TariffParameterDTO;
import apimodels.TariffType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TariffDTO   {
  @JsonProperty("type")
  @NotNull
@Valid

  private TariffType type;

  @JsonProperty("percent")
  @Valid

  private BigDecimal percent;

  @JsonProperty("amount")
  @NotNull
@Valid

  private BigDecimal amount;

  @JsonProperty("parameters")
  @NotNull
@Valid

  private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

  public TariffDTO type(TariffType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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
    return Objects.equals(type, tariffDTO.type) &&
        Objects.equals(percent, tariffDTO.percent) &&
        Objects.equals(amount, tariffDTO.amount) &&
        Objects.equals(parameters, tariffDTO.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, percent, amount, parameters);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


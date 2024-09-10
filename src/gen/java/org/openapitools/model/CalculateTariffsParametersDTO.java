package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PaymentFrequencyType;
import org.openapitools.model.SellingProgramType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Параметры для расчета стоимости услуг.
 **/
@ApiModel(description = "Параметры для расчета стоимости услуг.")
@JsonTypeName("CalculateTariffsParametersDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsParametersDTO   {
  private Long campaignId;
  private SellingProgramType sellingProgram;
  private PaymentFrequencyType frequency;

  /**
   * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. 
   **/
  public CalculateTariffsParametersDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. ")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaignId")
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  public CalculateTariffsParametersDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  @JsonProperty("sellingProgram")
  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  /**
   **/
  public CalculateTariffsParametersDTO frequency(PaymentFrequencyType frequency) {
    this.frequency = frequency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("frequency")
  public PaymentFrequencyType getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency")
  public void setFrequency(PaymentFrequencyType frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsParametersDTO calculateTariffsParametersDTO = (CalculateTariffsParametersDTO) o;
    return Objects.equals(this.campaignId, calculateTariffsParametersDTO.campaignId) &&
        Objects.equals(this.sellingProgram, calculateTariffsParametersDTO.sellingProgram) &&
        Objects.equals(this.frequency, calculateTariffsParametersDTO.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, sellingProgram, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsParametersDTO {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    sellingProgram: ").append(toIndentedString(sellingProgram)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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


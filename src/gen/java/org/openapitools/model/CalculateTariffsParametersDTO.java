package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.PaymentFrequencyType;
import org.openapitools.model.SellingProgramType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры для расчета стоимости услуг.
 */
@ApiModel(description="Параметры для расчета стоимости услуг.")

public class CalculateTariffsParametersDTO  {
  
 /**
  * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
  */
  @ApiModelProperty(value = "Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. ")
  private Long campaignId;

  @ApiModelProperty(value = "")
  @Valid
  private SellingProgramType sellingProgram;

  @ApiModelProperty(value = "")
  @Valid
  private PaymentFrequencyType frequency;
 /**
  * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. 
  * @return campaignId
  */
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public CalculateTariffsParametersDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Get sellingProgram
  * @return sellingProgram
  */
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  /**
   * Sets the <code>sellingProgram</code> property.
   */
 public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  /**
   * Sets the <code>sellingProgram</code> property.
   */
  public CalculateTariffsParametersDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

 /**
  * Get frequency
  * @return frequency
  */
  @JsonProperty("frequency")
  public PaymentFrequencyType getFrequency() {
    return frequency;
  }

  /**
   * Sets the <code>frequency</code> property.
   */
 public void setFrequency(PaymentFrequencyType frequency) {
    this.frequency = frequency;
  }

  /**
   * Sets the <code>frequency</code> property.
   */
  public CalculateTariffsParametersDTO frequency(PaymentFrequencyType frequency) {
    this.frequency = frequency;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


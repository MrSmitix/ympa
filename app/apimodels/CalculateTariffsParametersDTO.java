package apimodels;

import apimodels.PaymentFrequencyType;
import apimodels.SellingProgramType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Параметры для расчета стоимости услуг.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CalculateTariffsParametersDTO   {
  @JsonProperty("campaignId")
  
  private Long campaignId;

  @JsonProperty("sellingProgram")
  @Valid

  private SellingProgramType sellingProgram;

  @JsonProperty("frequency")
  @Valid

  private PaymentFrequencyType frequency;

  public CalculateTariffsParametersDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
   * @return campaignId
  **/
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CalculateTariffsParametersDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

   /**
   * Get sellingProgram
   * @return sellingProgram
  **/
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  public CalculateTariffsParametersDTO frequency(PaymentFrequencyType frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  public PaymentFrequencyType getFrequency() {
    return frequency;
  }

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
    return Objects.equals(campaignId, calculateTariffsParametersDTO.campaignId) &&
        Objects.equals(sellingProgram, calculateTariffsParametersDTO.sellingProgram) &&
        Objects.equals(frequency, calculateTariffsParametersDTO.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, sellingProgram, frequency);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


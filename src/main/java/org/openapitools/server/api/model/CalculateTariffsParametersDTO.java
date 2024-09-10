package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.PaymentFrequencyType;
import org.openapitools.server.api.model.SellingProgramType;

/**
 * Параметры для расчета стоимости услуг.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateTariffsParametersDTO   {
  
  private Long campaignId;
  private SellingProgramType sellingProgram;
  private PaymentFrequencyType frequency;

  public CalculateTariffsParametersDTO () {

  }

  public CalculateTariffsParametersDTO (Long campaignId, SellingProgramType sellingProgram, PaymentFrequencyType frequency) {
    this.campaignId = campaignId;
    this.sellingProgram = sellingProgram;
    this.frequency = frequency;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }
  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

    
  @JsonProperty("frequency")
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

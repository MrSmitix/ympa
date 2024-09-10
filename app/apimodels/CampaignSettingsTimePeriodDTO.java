package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignSettingsTimePeriodDTO   {
  @JsonProperty("fromDate")
  
  private String fromDate;

  @JsonProperty("toDate")
  
  private String toDate;

  public CampaignSettingsTimePeriodDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   * @return fromDate
  **/
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public CampaignSettingsTimePeriodDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   * @return toDate
  **/
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO = (CampaignSettingsTimePeriodDTO) o;
    return Objects.equals(fromDate, campaignSettingsTimePeriodDTO.fromDate) &&
        Objects.equals(toDate, campaignSettingsTimePeriodDTO.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, toDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsTimePeriodDTO {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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


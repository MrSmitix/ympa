package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 **/
@ApiModel(description="Период, за который рассчитывается итоговый список нерабочих дней службы доставки.")

public class CampaignSettingsTimePeriodDTO  {
  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String fromDate;

  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String toDate;
 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return fromDate
  **/
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public CampaignSettingsTimePeriodDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return toDate
  **/
  @JsonProperty("toDate")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public CampaignSettingsTimePeriodDTO toDate(String toDate) {
    this.toDate = toDate;
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
    CampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO = (CampaignSettingsTimePeriodDTO) o;
    return Objects.equals(this.fromDate, campaignSettingsTimePeriodDTO.fromDate) &&
        Objects.equals(this.toDate, campaignSettingsTimePeriodDTO.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, toDate);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Период, за который рассчитывается итоговый список нерабочих дней службы доставки.")
public class CampaignSettingsTimePeriodDTO   {
  
  private String fromDate;

  private String toDate;

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public CampaignSettingsTimePeriodDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("fromDate")
  public String getFromDate() {
    return fromDate;
  }
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }


  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public CampaignSettingsTimePeriodDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("toDate")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации отчета. 
 */
@ApiModel(description="Данные, необходимые для генерации отчета. ")

public class GenerateGoodsTurnoverRequest  {
  
 /**
  * Идентификатор кампании.
  */
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  private Long campaignId;

 /**
  * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
  */
  @ApiModelProperty(value = "Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate date;
 /**
  * Идентификатор кампании.
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
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
  public GenerateGoodsTurnoverRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
  * @return date
  */
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public GenerateGoodsTurnoverRequest date(LocalDate date) {
    this.date = date;
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
    GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = (GenerateGoodsTurnoverRequest) o;
    return Objects.equals(this.campaignId, generateGoodsTurnoverRequest.campaignId) &&
        Objects.equals(this.date, generateGoodsTurnoverRequest.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsTurnoverRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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


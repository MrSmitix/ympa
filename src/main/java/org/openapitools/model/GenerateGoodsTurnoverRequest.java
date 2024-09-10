/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Данные, необходимые для генерации отчета. 
 */

@ApiModel(description = "Данные, необходимые для генерации отчета. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsTurnoverRequest   {
  
  private Long campaignId;
  private Date date;

  /**
   * Идентификатор кампании.
   */
  public GenerateGoodsTurnoverRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
   */
  public GenerateGoodsTurnoverRequest date(Date date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
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
    return Objects.equals(campaignId, generateGoodsTurnoverRequest.campaignId) &&
        Objects.equals(date, generateGoodsTurnoverRequest.date);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


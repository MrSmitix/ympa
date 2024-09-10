/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
  */

public class GenerateGoodsRealizationReportRequest  {
  
 /**
  * Идентификатор кампании.
  */
  @JsonbProperty("campaignId")
  private Long campaignId;

 /**
  * Год.
  */
  @JsonbProperty("year")
  private Integer year;

 /**
  * Номер месяца.
  */
  @JsonbProperty("month")
  private Integer month;

  /**
   * Идентификатор кампании.
   * @return campaignId
   **/
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Set campaignId
   */
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsRealizationReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Год.
   * @return year
   **/
  public Integer getYear() {
    return year;
  }

  /**
   * Set year
   */
  public void setYear(Integer year) {
    this.year = year;
  }

  public GenerateGoodsRealizationReportRequest year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Номер месяца.
   * minimum: 1
   * maximum: 12
   * @return month
   **/
  public Integer getMonth() {
    return month;
  }

  /**
   * Set month
   */
  public void setMonth(Integer month) {
    this.month = month;
  }

  public GenerateGoodsRealizationReportRequest month(Integer month) {
    this.month = month;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsRealizationReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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


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

import java.util.Date;
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
  * Данные, необходимые для генерации отчета.
  */

public class GenerateGoodsMovementReportRequest  {
  
 /**
  * Идентификатор кампании.
  */
  @JsonbProperty("campaignId")
  private Long campaignId;

 /**
  * Начало периода, включительно.
  */
  @JsonbProperty("dateFrom")
  private Date dateFrom;

 /**
  * Конец периода, включительно.
  */
  @JsonbProperty("dateTo")
  private Date dateTo;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @JsonbProperty("shopSku")
  private String shopSku;

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

  public GenerateGoodsMovementReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Начало периода, включительно.
   * @return dateFrom
   **/
  public Date getDateFrom() {
    return dateFrom;
  }

  /**
   * Set dateFrom
   */
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateGoodsMovementReportRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Конец периода, включительно.
   * @return dateTo
   **/
  public Date getDateTo() {
    return dateTo;
  }

  /**
   * Set dateTo
   */
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateGoodsMovementReportRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   **/
  public String getShopSku() {
    return shopSku;
  }

  /**
   * Set shopSku
   */
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public GenerateGoodsMovementReportRequest shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsMovementReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
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


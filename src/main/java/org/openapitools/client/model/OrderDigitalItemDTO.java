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

package org.openapitools.client.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Ключ цифрового товара.
 **/
@ApiModel(description = "Ключ цифрового товара.")
public class OrderDigitalItemDTO {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("slip")
  private String slip = null;
  @SerializedName("activate_till")
  private Date activateTill = null;

  /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   **/
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Сам ключ.
   **/
  @ApiModelProperty(required = true, value = "Сам ключ.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Инструкция по активации.
   **/
  @ApiModelProperty(required = true, value = "Инструкция по активации.")
  public String getSlip() {
    return slip;
  }
  public void setSlip(String slip) {
    this.slip = slip;
  }

  /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
   **/
  @ApiModelProperty(required = true, value = "Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. ")
  public Date getActivateTill() {
    return activateTill;
  }
  public void setActivateTill(Date activateTill) {
    this.activateTill = activateTill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDigitalItemDTO orderDigitalItemDTO = (OrderDigitalItemDTO) o;
    return (this.id == null ? orderDigitalItemDTO.id == null : this.id.equals(orderDigitalItemDTO.id)) &&
        (this.code == null ? orderDigitalItemDTO.code == null : this.code.equals(orderDigitalItemDTO.code)) &&
        (this.slip == null ? orderDigitalItemDTO.slip == null : this.slip.equals(orderDigitalItemDTO.slip)) &&
        (this.activateTill == null ? orderDigitalItemDTO.activateTill == null : this.activateTill.equals(orderDigitalItemDTO.activateTill));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.slip == null ? 0: this.slip.hashCode());
    result = 31 * result + (this.activateTill == null ? 0: this.activateTill.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDigitalItemDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  slip: ").append(slip).append("\n");
    sb.append("  activateTill: ").append(activateTill).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

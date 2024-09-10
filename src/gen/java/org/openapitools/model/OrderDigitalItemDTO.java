package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ключ цифрового товара.
 **/
@ApiModel(description="Ключ цифрового товара.")

public class OrderDigitalItemDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
 /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Сам ключ.")
 /**
   * Сам ключ.
  **/
  private String code;

  @ApiModelProperty(required = true, value = "Инструкция по активации.")
 /**
   * Инструкция по активации.
  **/
  private String slip;

  @ApiModelProperty(required = true, value = "Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. ")
 /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
  **/
  private LocalDate activateTill;
 /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Сам ключ.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderDigitalItemDTO code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Инструкция по активации.
   * @return slip
  **/
  @JsonProperty("slip")
  public String getSlip() {
    return slip;
  }

  public void setSlip(String slip) {
    this.slip = slip;
  }

  public OrderDigitalItemDTO slip(String slip) {
    this.slip = slip;
    return this;
  }

 /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return activateTill
  **/
  @JsonProperty("activate_till")
  public LocalDate getActivateTill() {
    return activateTill;
  }

  public void setActivateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
  }

  public OrderDigitalItemDTO activateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
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
    OrderDigitalItemDTO orderDigitalItemDTO = (OrderDigitalItemDTO) o;
    return Objects.equals(this.id, orderDigitalItemDTO.id) &&
        Objects.equals(this.code, orderDigitalItemDTO.code) &&
        Objects.equals(this.slip, orderDigitalItemDTO.slip) &&
        Objects.equals(this.activateTill, orderDigitalItemDTO.activateTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, slip, activateTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDigitalItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    slip: ").append(toIndentedString(slip)).append("\n");
    sb.append("    activateTill: ").append(toIndentedString(activateTill)).append("\n");
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


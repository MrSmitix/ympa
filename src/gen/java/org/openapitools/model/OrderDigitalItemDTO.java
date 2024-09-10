package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ключ цифрового товара.
 */
@ApiModel(description="Ключ цифрового товара.")

public class OrderDigitalItemDTO  {
  
 /**
  * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  private Long id;

 /**
  * Сам ключ.
  */
  @ApiModelProperty(required = true, value = "Сам ключ.")
  private String code;

 /**
  * Инструкция по активации.
  */
  @ApiModelProperty(required = true, value = "Инструкция по активации.")
  private String slip;

 /**
  * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
  @ApiModelProperty(required = true, value = "Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate activateTill;
 /**
  * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Сам ключ.
  * @return code
  */
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public OrderDigitalItemDTO code(String code) {
    this.code = code;
    return this;
  }

 /**
  * Инструкция по активации.
  * @return slip
  */
  @JsonProperty("slip")
  @NotNull
  public String getSlip() {
    return slip;
  }

  /**
   * Sets the <code>slip</code> property.
   */
 public void setSlip(String slip) {
    this.slip = slip;
  }

  /**
   * Sets the <code>slip</code> property.
   */
  public OrderDigitalItemDTO slip(String slip) {
    this.slip = slip;
    return this;
  }

 /**
  * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
  * @return activateTill
  */
  @JsonProperty("activate_till")
  @NotNull
  public LocalDate getActivateTill() {
    return activateTill;
  }

  /**
   * Sets the <code>activateTill</code> property.
   */
 public void setActivateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
  }

  /**
   * Sets the <code>activateTill</code> property.
   */
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


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ключ цифрового товара.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ключ цифрового товара.")
public class OrderDigitalItemDTO   {
  
  private Long id;

  private String code;

  private String slip;

  private LocalDate activateTill;

  /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
   **/
  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Сам ключ.
   **/
  public OrderDigitalItemDTO code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Сам ключ.")
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Инструкция по активации.
   **/
  public OrderDigitalItemDTO slip(String slip) {
    this.slip = slip;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Инструкция по активации.")
  @JsonProperty("slip")
  @NotNull
  public String getSlip() {
    return slip;
  }
  public void setSlip(String slip) {
    this.slip = slip;
  }


  /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   **/
  public OrderDigitalItemDTO activateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("activate_till")
  @NotNull
  public LocalDate getActivateTill() {
    return activateTill;
  }
  public void setActivateTill(LocalDate activateTill) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


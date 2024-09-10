package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Ключ цифрового товара.
 */
@ApiModel(description = "Ключ цифрового товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDigitalItemDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("code")
  private String code;

  @JsonProperty("slip")
  private String slip;

  @JsonProperty("activate_till")
  private Date activateTill;

  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDigitalItemDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Сам ключ.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Сам ключ.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderDigitalItemDTO slip(String slip) {
    this.slip = slip;
    return this;
  }

   /**
   * Инструкция по активации.
   * @return slip
  **/
  @ApiModelProperty(required = true, value = "Инструкция по активации.")
  public String getSlip() {
    return slip;
  }

  public void setSlip(String slip) {
    this.slip = slip;
  }

  public OrderDigitalItemDTO activateTill(Date activateTill) {
    this.activateTill = activateTill;
    return this;
  }

   /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return activateTill
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


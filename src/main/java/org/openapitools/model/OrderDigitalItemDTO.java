package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ключ цифрового товара.
 */

@Schema(name = "OrderDigitalItemDTO", description = "Ключ цифрового товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDigitalItemDTO {

  private Long id;

  private String code;

  private String slip;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date activateTill;

  public OrderDigitalItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderDigitalItemDTO(Long id, String code, String slip, Date activateTill) {
    this.id = id;
    this.code = code;
    this.slip = slip;
    this.activateTill = activateTill;
  }

  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "code", description = "Сам ключ.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
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
   */
  @NotNull 
  @Schema(name = "slip", description = "Инструкция по активации.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slip")
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
   */
  @NotNull @Valid 
  @Schema(name = "activate_till", description = "Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activate_till")
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


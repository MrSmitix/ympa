package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ключ цифрового товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderDigitalItemDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("code")
  @NotNull

  private String code;

  @JsonProperty("slip")
  @NotNull

  private String slip;

  @JsonProperty("activate_till")
  @NotNull
@Valid

  private LocalDate activateTill;

  public OrderDigitalItemDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
   * @return id
  **/
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
  public String getSlip() {
    return slip;
  }

  public void setSlip(String slip) {
    this.slip = slip;
  }

  public OrderDigitalItemDTO activateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
    return this;
  }

   /**
   * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return activateTill
  **/
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
    return Objects.equals(id, orderDigitalItemDTO.id) &&
        Objects.equals(code, orderDigitalItemDTO.code) &&
        Objects.equals(slip, orderDigitalItemDTO.slip) &&
        Objects.equals(activateTill, orderDigitalItemDTO.activateTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, slip, activateTill);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


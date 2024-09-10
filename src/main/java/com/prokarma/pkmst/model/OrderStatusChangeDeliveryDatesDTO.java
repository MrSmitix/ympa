package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Диапазон дат доставки.
 */
@ApiModel(description = "Диапазон дат доставки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderStatusChangeDeliveryDatesDTO   {
  @JsonProperty("realDeliveryDate")
  private LocalDate realDeliveryDate;

  public OrderStatusChangeDeliveryDatesDTO realDeliveryDate(LocalDate realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
    return this;
  }

  /**
   * **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
   * @return realDeliveryDate
   */
  @ApiModelProperty(value = "**Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      ")
  public LocalDate getRealDeliveryDate() {
    return realDeliveryDate;
  }

  public void setRealDeliveryDate(LocalDate realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO = (OrderStatusChangeDeliveryDatesDTO) o;
    return Objects.equals(this.realDeliveryDate, orderStatusChangeDeliveryDatesDTO.realDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDeliveryDatesDTO {\n");
    
    sb.append("    realDeliveryDate: ").append(toIndentedString(realDeliveryDate)).append("\n");
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


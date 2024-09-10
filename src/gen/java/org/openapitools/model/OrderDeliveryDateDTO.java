package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о новой дате доставки заказа.
 **/
@ApiModel(description="Информация о новой дате доставки заказа.")

public class OrderDeliveryDateDTO  {
  
  @ApiModelProperty(required = true, value = "Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
 /**
   * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  **/
  private LocalDate toDate;
 /**
   * Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return toDate
  **/
  @JsonProperty("toDate")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public OrderDeliveryDateDTO toDate(LocalDate toDate) {
    this.toDate = toDate;
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
    OrderDeliveryDateDTO orderDeliveryDateDTO = (OrderDeliveryDateDTO) o;
    return Objects.equals(this.toDate, orderDeliveryDateDTO.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryDateDTO {\n");
    
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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


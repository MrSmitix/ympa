package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о платежном получении.
 */
@ApiModel(description="Информация о платежном получении.")

public class OrdersStatsPaymentOrderDTO  {
  
 /**
  * Номер платежного поручения.
  */
  @ApiModelProperty(value = "Номер платежного поручения.")
  private String id;

 /**
  * Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  */
  @ApiModelProperty(value = "Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate date;
 /**
  * Номер платежного поручения.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrdersStatsPaymentOrderDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
  * @return date
  */
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public OrdersStatsPaymentOrderDTO date(LocalDate date) {
    this.date = date;
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
    OrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO = (OrdersStatsPaymentOrderDTO) o;
    return Objects.equals(this.id, ordersStatsPaymentOrderDTO.id) &&
        Objects.equals(this.date, ordersStatsPaymentOrderDTO.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsPaymentOrderDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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


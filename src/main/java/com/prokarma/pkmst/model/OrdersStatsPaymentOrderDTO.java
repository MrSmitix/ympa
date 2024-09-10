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
 * Информация о платежном получении.
 */
@ApiModel(description = "Информация о платежном получении.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPaymentOrderDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("date")
  private LocalDate date;

  public OrdersStatsPaymentOrderDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Номер платежного поручения.
   * @return id
   */
  @ApiModelProperty(value = "Номер платежного поручения.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrdersStatsPaymentOrderDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
   * @return date
   */
  @ApiModelProperty(value = "Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. ")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


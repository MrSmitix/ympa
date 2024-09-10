package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о платежном получении.
 */

@Schema(name = "OrdersStatsPaymentOrderDTO", description = "Информация о платежном получении.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPaymentOrderDTO {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  public OrdersStatsPaymentOrderDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Номер платежного поручения.
   * @return id
   */
  
  @Schema(name = "id", description = "Номер платежного поручения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  @Valid 
  @Schema(name = "date", description = "Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
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


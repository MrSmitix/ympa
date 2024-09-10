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
 * Информация о новой дате доставки заказа.
 */

@Schema(name = "OrderDeliveryDateDTO", description = "Информация о новой дате доставки заказа.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDateDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate toDate;

  public OrderDeliveryDateDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderDeliveryDateDTO(LocalDate toDate) {
    this.toDate = toDate;
  }

  public OrderDeliveryDateDTO toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return toDate
   */
  @NotNull @Valid 
  @Schema(name = "toDate", description = "Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toDate")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


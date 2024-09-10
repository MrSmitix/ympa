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
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

@Schema(name = "UpdateOrderStorageLimitRequest", description = "Запрос на обновление срока хранения заказа в ПВЗ.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStorageLimitRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate newDate;

  public UpdateOrderStorageLimitRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOrderStorageLimitRequest(LocalDate newDate) {
    this.newDate = newDate;
  }

  public UpdateOrderStorageLimitRequest newDate(LocalDate newDate) {
    this.newDate = newDate;
    return this;
  }

  /**
   * Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return newDate
   */
  @NotNull @Valid 
  @Schema(name = "newDate", description = "Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newDate")
  public LocalDate getNewDate() {
    return newDate;
  }

  public void setNewDate(LocalDate newDate) {
    this.newDate = newDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = (UpdateOrderStorageLimitRequest) o;
    return Objects.equals(this.newDate, updateOrderStorageLimitRequest.newDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStorageLimitRequest {\n");
    sb.append("    newDate: ").append(toIndentedString(newDate)).append("\n");
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


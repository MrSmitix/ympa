package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.OrderDocumentStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о документе.
 */

@Schema(name = "DocumentDTO", description = "Информация о документе.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DocumentDTO {

  private OrderDocumentStatusType status;

  private String number;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date date;

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OrderDocumentStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderDocumentStatusType status) {
    this.status = status;
  }

  public DocumentDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер документа.
   * @return number
   */
  
  @Schema(name = "number", description = "Номер документа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DocumentDTO date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Дата создания документа.
   * @return date
   */
  @Valid 
  @Schema(name = "date", description = "Дата создания документа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
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
    DocumentDTO documentDTO = (DocumentDTO) o;
    return Objects.equals(this.status, documentDTO.status) &&
        Objects.equals(this.number, documentDTO.number) &&
        Objects.equals(this.date, documentDTO.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, number, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDTO {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderDocumentStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о документе.
 */
@ApiModel(description = "Информация о документе.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DocumentDTO   {
  @JsonProperty("status")
  private OrderDocumentStatusType status;

  @JsonProperty("number")
  private String number;

  @JsonProperty("date")
  private LocalDate date;

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Номер документа.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DocumentDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Дата создания документа.
   * @return date
   */
  @ApiModelProperty(value = "Дата создания документа.")
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


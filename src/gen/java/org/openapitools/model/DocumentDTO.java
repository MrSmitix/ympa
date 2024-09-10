package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.model.OrderDocumentStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о документе.
 **/
@ApiModel(description="Информация о документе.")

public class DocumentDTO  {
  
  @ApiModelProperty(value = "")
  private OrderDocumentStatusType status;

  @ApiModelProperty(value = "Номер документа.")
 /**
   * Номер документа.
  **/
  private String number;

  @ApiModelProperty(value = "Дата создания документа.")
 /**
   * Дата создания документа.
  **/
  private LocalDate date;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OrderDocumentStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderDocumentStatusType status) {
    this.status = status;
  }

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Номер документа.
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DocumentDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Дата создания документа.
   * @return date
  **/
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DocumentDTO date(LocalDate date) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


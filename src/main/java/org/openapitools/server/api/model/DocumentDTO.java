package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.api.model.OrderDocumentStatusType;

/**
 * Информация о документе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentDTO   {
  
  private OrderDocumentStatusType status;
  private String number;
  private LocalDate date;

  public DocumentDTO () {

  }

  public DocumentDTO (OrderDocumentStatusType status, String number, LocalDate date) {
    this.status = status;
    this.number = number;
    this.date = date;
  }

    
  @JsonProperty("status")
  public OrderDocumentStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderDocumentStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

    
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
    DocumentDTO documentDTO = (DocumentDTO) o;
    return Objects.equals(status, documentDTO.status) &&
        Objects.equals(number, documentDTO.number) &&
        Objects.equals(date, documentDTO.date);
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

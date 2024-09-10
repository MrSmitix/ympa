package apimodels;

import apimodels.OrderDocumentStatusType;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о документе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DocumentDTO   {
  @JsonProperty("status")
  @Valid

  private OrderDocumentStatusType status;

  @JsonProperty("number")
  
  private String number;

  @JsonProperty("date")
  @Valid

  private LocalDate date;

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


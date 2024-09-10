package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.OrderDocumentStatusType;



/**
 * Информация о документе.
 **/

@ApiModel(description = "Информация о документе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DocumentDTO   {
  @JsonProperty("status")
  private OrderDocumentStatusType status;

  @JsonProperty("number")
  private String number;

  @JsonProperty("date")
  private Date date;

  /**
   **/
  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OrderDocumentStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderDocumentStatusType status) {
    this.status = status;
  }

  /**
   * Номер документа.
   **/
  public DocumentDTO number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Номер документа.")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Дата создания документа.
   **/
  public DocumentDTO date(Date date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "Дата создания документа.")
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


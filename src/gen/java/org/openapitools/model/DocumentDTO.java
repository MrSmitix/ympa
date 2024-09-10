/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.OrderDocumentStatusType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о документе.
 */
@ApiModel(description = "Информация о документе.")
@JsonPropertyOrder({
  DocumentDTO.JSON_PROPERTY_STATUS,
  DocumentDTO.JSON_PROPERTY_NUMBER,
  DocumentDTO.JSON_PROPERTY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DocumentDTO   {
  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private OrderDocumentStatusType status;

  public static final String JSON_PROPERTY_NUMBER = "number";
  @JsonProperty(JSON_PROPERTY_NUMBER)
  private String number;

  public static final String JSON_PROPERTY_DATE = "date";
  @JsonProperty(JSON_PROPERTY_DATE)
  private Date date;

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
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
   **/
  @JsonProperty(value = "number")
  @ApiModelProperty(value = "Номер документа.")
  
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
   **/
  @JsonProperty(value = "date")
  @ApiModelProperty(value = "Дата создания документа.")
  
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


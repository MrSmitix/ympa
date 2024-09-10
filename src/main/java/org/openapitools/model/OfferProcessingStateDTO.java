/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferProcessingNoteDTO;
import org.openapitools.model.OfferProcessingStatusType;



/**
 * Информация о статусе публикации товара на Маркете.
 */

@ApiModel(description = "Информация о статусе публикации товара на Маркете.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingStateDTO   {
  
  private OfferProcessingStatusType status;
  private List<OfferProcessingNoteDTO> notes;

  /**
   */
  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OfferProcessingStatusType getStatus() {
    return status;
  }
  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  /**
   * Причины, по которым товар не прошел модерацию.
   */
  public OfferProcessingStateDTO notes(List<OfferProcessingNoteDTO> notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(value = "Причины, по которым товар не прошел модерацию.")
  @JsonProperty("notes")
  public List<OfferProcessingNoteDTO> getNotes() {
    return notes;
  }
  public void setNotes(List<OfferProcessingNoteDTO> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferProcessingStateDTO offerProcessingStateDTO = (OfferProcessingStateDTO) o;
    return Objects.equals(status, offerProcessingStateDTO.status) &&
        Objects.equals(notes, offerProcessingStateDTO.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferProcessingStateDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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


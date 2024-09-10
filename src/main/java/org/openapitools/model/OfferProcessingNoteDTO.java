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
import org.openapitools.model.OfferProcessingNoteType;



/**
 * Причины, по которым товар не прошел модерацию.
 */

@ApiModel(description = "Причины, по которым товар не прошел модерацию.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingNoteDTO   {
  
  private OfferProcessingNoteType type;
  private String payload;

  /**
   */
  public OfferProcessingNoteDTO type(OfferProcessingNoteType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OfferProcessingNoteType getType() {
    return type;
  }
  public void setType(OfferProcessingNoteType type) {
    this.type = type;
  }

  /**
   * Дополнительная информация о причине отклонения товара. 
   */
  public OfferProcessingNoteDTO payload(String payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(value = "Дополнительная информация о причине отклонения товара. ")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferProcessingNoteDTO offerProcessingNoteDTO = (OfferProcessingNoteDTO) o;
    return Objects.equals(type, offerProcessingNoteDTO.type) &&
        Objects.equals(payload, offerProcessingNoteDTO.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferProcessingNoteDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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


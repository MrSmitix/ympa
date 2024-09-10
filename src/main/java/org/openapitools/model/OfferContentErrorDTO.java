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
import org.openapitools.model.OfferContentErrorType;



/**
 * Текст ошибки.
 */

@ApiModel(description = "Текст ошибки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferContentErrorDTO   {
  
  private OfferContentErrorType type;
  private Long parameterId;
  private String message;

  /**
   */
  public OfferContentErrorDTO type(OfferContentErrorType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public OfferContentErrorType getType() {
    return type;
  }
  public void setType(OfferContentErrorType type) {
    this.type = type;
  }

  /**
   * Идентификатор характеристики, с которой связана ошибка.
   */
  public OfferContentErrorDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор характеристики, с которой связана ошибка.")
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  /**
   * Текст ошибки.
   */
  public OfferContentErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Текст ошибки.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContentErrorDTO offerContentErrorDTO = (OfferContentErrorDTO) o;
    return Objects.equals(type, offerContentErrorDTO.type) &&
        Objects.equals(parameterId, offerContentErrorDTO.parameterId) &&
        Objects.equals(message, offerContentErrorDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameterId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContentErrorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


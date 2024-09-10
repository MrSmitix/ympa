/**
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

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ApiErrorDTO;
import org.openapitools.server.model.ApiResponseStatusType;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Внутренняя ошибка сервера.
  */

public class ApiServerErrorResponse  {
  
  @JsonbProperty("status")
  private ApiResponseStatusType status;

 /**
  * Список ошибок.
  */
  @JsonbProperty("errors")
  private List<ApiErrorDTO> errors = null;

  /**
   * Get status
   * @return status
   **/
  public ApiResponseStatusType getStatus() {
    return status;
  }

  /**
   * Set status
   */
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public ApiServerErrorResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Список ошибок.
   * @return errors
   **/
  public List<ApiErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Set errors
   */
  public void setErrors(List<ApiErrorDTO> errors) {
    this.errors = errors;
  }

  public ApiServerErrorResponse errors(List<ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ApiServerErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiServerErrorResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


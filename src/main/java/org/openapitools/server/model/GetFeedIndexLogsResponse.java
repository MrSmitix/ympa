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

import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.FeedIndexLogsResultDTO;
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


public class GetFeedIndexLogsResponse  {
  
  @JsonbProperty("status")
  private ApiResponseStatusType status;

  @JsonbProperty("result")
  private FeedIndexLogsResultDTO result;

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

  public GetFeedIndexLogsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  public FeedIndexLogsResultDTO getResult() {
    return result;
  }

  /**
   * Set result
   */
  public void setResult(FeedIndexLogsResultDTO result) {
    this.result = result;
  }

  public GetFeedIndexLogsResponse result(FeedIndexLogsResultDTO result) {
    this.result = result;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedIndexLogsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


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
import org.openapitools.server.model.SkuBidRecommendationItemDTO;
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
  * Список товаров с рекомендованными ставками.
  */

public class GetBidsRecommendationsResponseDTO  {
  
 /**
  * Список товаров с рекомендованными ставками.
  */
  @JsonbProperty("recommendations")
  private List<SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  /**
   * Список товаров с рекомендованными ставками.
   * @return recommendations
   **/
  public List<SkuBidRecommendationItemDTO> getRecommendations() {
    return recommendations;
  }

  /**
   * Set recommendations
   */
  public void setRecommendations(List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
  }

  public GetBidsRecommendationsResponseDTO recommendations(List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public GetBidsRecommendationsResponseDTO addRecommendationsItem(SkuBidRecommendationItemDTO recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBidsRecommendationsResponseDTO {\n");
    
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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


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
import org.openapitools.server.model.FeedbackDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
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
  * Отзывы пользователей Яндекс Маркета об указанном магазине.
  */

public class FeedbackListDTO  {
  
  @JsonbProperty("paging")
  private ScrollingPagerDTO paging;

 /**
  * Список отзывов.  Содержит не более 20 отзывов. 
  */
  @JsonbProperty("feedbackList")
  private List<FeedbackDTO> feedbackList = new ArrayList<>();

  /**
   * Get paging
   * @return paging
   **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Set paging
   */
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public FeedbackListDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Список отзывов.  Содержит не более 20 отзывов. 
   * @return feedbackList
   **/
  public List<FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }

  /**
   * Set feedbackList
   */
  public void setFeedbackList(List<FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }

  public FeedbackListDTO feedbackList(List<FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
    if (this.feedbackList == null) {
      this.feedbackList = new ArrayList<>();
    }
    this.feedbackList.add(feedbackListItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackListDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
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


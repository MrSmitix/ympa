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

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ChatMessageDTO;
import org.openapitools.client.model.ForwardScrollingPagerDTO;



/**
  * Информация о сообщениях.
 **/

public class ChatMessagesResultDTO  {
  
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

 /**
   * Информация о сообщениях.
  **/
  private List<ChatMessageDTO> messages = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

 /**
   * Идентификатор заказа.
   * @return orderId
  **/
  public Long getOrderId() {
    return orderId;
  }

  /**
    * Set orderId
  **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ChatMessagesResultDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Информация о сообщениях.
   * @return messages
  **/
  public List<ChatMessageDTO> getMessages() {
    return messages;
  }

  /**
    * Set messages
  **/
  public void setMessages(List<ChatMessageDTO> messages) {
    this.messages = messages;
  }

  public ChatMessagesResultDTO messages(List<ChatMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  public ChatMessagesResultDTO addMessagesItem(ChatMessageDTO messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
    * Set paging
  **/
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public ChatMessagesResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessagesResultDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatMessageDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;



/**
 * Информация о сообщениях.
 */

@ApiModel(description = "Информация о сообщениях.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessagesResultDTO   {
  
  private Long orderId;
  private List<ChatMessageDTO> messages = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Идентификатор заказа.
   */
  public ChatMessagesResultDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Информация о сообщениях.
   */
  public ChatMessagesResultDTO messages(List<ChatMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о сообщениях.")
  @JsonProperty("messages")
  public List<ChatMessageDTO> getMessages() {
    return messages;
  }
  public void setMessages(List<ChatMessageDTO> messages) {
    this.messages = messages;
  }

  /**
   */
  public ChatMessagesResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessagesResultDTO chatMessagesResultDTO = (ChatMessagesResultDTO) o;
    return Objects.equals(orderId, chatMessagesResultDTO.orderId) &&
        Objects.equals(messages, chatMessagesResultDTO.messages) &&
        Objects.equals(paging, chatMessagesResultDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, messages, paging);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


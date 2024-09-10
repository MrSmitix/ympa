package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ChatMessageDTO;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;

/**
 * Информация о сообщениях.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessagesResultDTO   {
  
  private Long orderId;
  private List<ChatMessageDTO> messages = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public ChatMessagesResultDTO () {

  }

  public ChatMessagesResultDTO (Long orderId, List<ChatMessageDTO> messages, ForwardScrollingPagerDTO paging) {
    this.orderId = orderId;
    this.messages = messages;
    this.paging = paging;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("messages")
  public List<ChatMessageDTO> getMessages() {
    return messages;
  }
  public void setMessages(List<ChatMessageDTO> messages) {
    this.messages = messages;
  }

    
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

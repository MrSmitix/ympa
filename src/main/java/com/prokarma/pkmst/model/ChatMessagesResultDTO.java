package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ChatMessageDTO;
import com.prokarma.pkmst.model.ForwardScrollingPagerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о сообщениях.
 */
@ApiModel(description = "Информация о сообщениях.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessagesResultDTO   {
  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("messages")
  
  private List<ChatMessageDTO> messages = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  public ChatMessagesResultDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return orderId
   */
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ChatMessagesResultDTO messages(List<ChatMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  public ChatMessagesResultDTO addMessagesItem(ChatMessageDTO messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Информация о сообщениях.
   * @return messages
   */
  @ApiModelProperty(required = true, value = "Информация о сообщениях.")
  public List<ChatMessageDTO> getMessages() {
    return messages;
  }

  public void setMessages(List<ChatMessageDTO> messages) {
    this.messages = messages;
  }

  public ChatMessagesResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.orderId, chatMessagesResultDTO.orderId) &&
        Objects.equals(this.messages, chatMessagesResultDTO.messages) &&
        Objects.equals(this.paging, chatMessagesResultDTO.paging);
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

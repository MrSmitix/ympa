package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatMessageDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о сообщениях.
 **/
@ApiModel(description="Информация о сообщениях.")

public class ChatMessagesResultDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

  @ApiModelProperty(required = true, value = "Информация о сообщениях.")
  @Valid
 /**
   * Информация о сообщениях.
  **/
  private List<@Valid ChatMessageDTO> messages = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
   * Идентификатор заказа.
   * @return orderId
  **/
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }

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
  @JsonProperty("messages")
  @NotNull
  public List<@Valid ChatMessageDTO> getMessages() {
    return messages;
  }

  public void setMessages(List<@Valid ChatMessageDTO> messages) {
    this.messages = messages;
  }

  public ChatMessagesResultDTO messages(List<@Valid ChatMessageDTO> messages) {
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
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public ChatMessagesResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatMessageDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о сообщениях.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о сообщениях.")
public class ChatMessagesResultDTO   {
  
  private Long orderId;

  private List<@Valid ChatMessageDTO> messages = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  /**
   * Идентификатор заказа.
   **/
  public ChatMessagesResultDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  @JsonProperty("orderId")
  @NotNull
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  /**
   * Информация о сообщениях.
   **/
  public ChatMessagesResultDTO messages(List<@Valid ChatMessageDTO> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о сообщениях.")
  @JsonProperty("messages")
  @NotNull
  public List<@Valid ChatMessageDTO> getMessages() {
    return messages;
  }
  public void setMessages(List<@Valid ChatMessageDTO> messages) {
    this.messages = messages;
  }

  public ChatMessagesResultDTO addMessagesItem(ChatMessageDTO messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }


  /**
   **/
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


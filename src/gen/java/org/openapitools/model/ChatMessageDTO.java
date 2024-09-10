package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatMessagePayloadDTO;
import org.openapitools.model.ChatMessageSenderType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о сообщениях.
 */
@ApiModel(description="Информация о сообщениях.")

public class ChatMessageDTO  {
  
 /**
  * Идентификатор сообщения.
  */
  @ApiModelProperty(required = true, value = "Идентификатор сообщения.")
  private Long messageId;

 /**
  * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  */
  @ApiModelProperty(required = true, value = "Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatMessageSenderType sender;

 /**
  * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
  */
  @ApiModelProperty(value = "Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ")
  private String message;

 /**
  * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
  */
  @ApiModelProperty(value = "Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ")
  @Valid
  private List<@Valid ChatMessagePayloadDTO> payload;
 /**
  * Идентификатор сообщения.
  * @return messageId
  */
  @JsonProperty("messageId")
  @NotNull
  public Long getMessageId() {
    return messageId;
  }

  /**
   * Sets the <code>messageId</code> property.
   */
 public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  /**
   * Sets the <code>messageId</code> property.
   */
  public ChatMessageDTO messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

 /**
  * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
  * @return createdAt
  */
  @JsonProperty("createdAt")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public ChatMessageDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get sender
  * @return sender
  */
  @JsonProperty("sender")
  @NotNull
  public ChatMessageSenderType getSender() {
    return sender;
  }

  /**
   * Sets the <code>sender</code> property.
   */
 public void setSender(ChatMessageSenderType sender) {
    this.sender = sender;
  }

  /**
   * Sets the <code>sender</code> property.
   */
  public ChatMessageDTO sender(ChatMessageSenderType sender) {
    this.sender = sender;
    return this;
  }

 /**
  * Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;. 
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public ChatMessageDTO message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;. 
  * @return payload
  */
  @JsonProperty("payload")
  public List<@Valid ChatMessagePayloadDTO> getPayload() {
    return payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
 public void setPayload(List<@Valid ChatMessagePayloadDTO> payload) {
    this.payload = payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
  public ChatMessageDTO payload(List<@Valid ChatMessagePayloadDTO> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Adds a new item to the <code>payload</code> list.
   */
  public ChatMessageDTO addPayloadItem(ChatMessagePayloadDTO payloadItem) {
    this.payload.add(payloadItem);
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
    ChatMessageDTO chatMessageDTO = (ChatMessageDTO) o;
    return Objects.equals(this.messageId, chatMessageDTO.messageId) &&
        Objects.equals(this.createdAt, chatMessageDTO.createdAt) &&
        Objects.equals(this.sender, chatMessageDTO.sender) &&
        Objects.equals(this.message, chatMessageDTO.message) &&
        Objects.equals(this.payload, chatMessageDTO.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, createdAt, sender, message, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessageDTO {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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


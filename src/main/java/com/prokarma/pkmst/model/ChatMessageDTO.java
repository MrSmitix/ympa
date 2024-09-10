package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ChatMessagePayloadDTO;
import com.prokarma.pkmst.model.ChatMessageSenderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
public class ChatMessageDTO   {
  @JsonProperty("messageId")
  private Long messageId;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("sender")
  private ChatMessageSenderType sender;

  @JsonProperty("message")
  private String message;

  @JsonProperty("payload")
  
  private List<ChatMessagePayloadDTO> payload = null;

  public ChatMessageDTO messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Идентификатор сообщения.
   * @return messageId
   */
  @ApiModelProperty(required = true, value = "Идентификатор сообщения.")
  public Long getMessageId() {
    return messageId;
  }

  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  public ChatMessageDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ChatMessageDTO sender(ChatMessageSenderType sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @ApiModelProperty(required = true, value = "")
  public ChatMessageSenderType getSender() {
    return sender;
  }

  public void setSender(ChatMessageSenderType sender) {
    this.sender = sender;
  }

  public ChatMessageDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
   * @return message
   */
  @ApiModelProperty(value = "Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChatMessageDTO payload(List<ChatMessagePayloadDTO> payload) {
    this.payload = payload;
    return this;
  }

  public ChatMessageDTO addPayloadItem(ChatMessagePayloadDTO payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<>();
    }
    this.payload.add(payloadItem);
    return this;
  }

  /**
   * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
   * @return payload
   */
  @ApiModelProperty(value = "Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ")
  public List<ChatMessagePayloadDTO> getPayload() {
    return payload;
  }

  public void setPayload(List<ChatMessagePayloadDTO> payload) {
    this.payload = payload;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


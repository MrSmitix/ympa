package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ChatMessagePayloadDTO;
import org.openapitools.server.api.model.ChatMessageSenderType;

/**
 * Информация о сообщениях.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessageDTO   {
  
  private Long messageId;
  private OffsetDateTime createdAt;
  private ChatMessageSenderType sender;
  private String message;
  private List<ChatMessagePayloadDTO> payload;

  public ChatMessageDTO () {

  }

  public ChatMessageDTO (Long messageId, OffsetDateTime createdAt, ChatMessageSenderType sender, String message, List<ChatMessagePayloadDTO> payload) {
    this.messageId = messageId;
    this.createdAt = createdAt;
    this.sender = sender;
    this.message = message;
    this.payload = payload;
  }

    
  @JsonProperty("messageId")
  public Long getMessageId() {
    return messageId;
  }
  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("sender")
  public ChatMessageSenderType getSender() {
    return sender;
  }
  public void setSender(ChatMessageSenderType sender) {
    this.sender = sender;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("payload")
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
    return Objects.equals(messageId, chatMessageDTO.messageId) &&
        Objects.equals(createdAt, chatMessageDTO.createdAt) &&
        Objects.equals(sender, chatMessageDTO.sender) &&
        Objects.equals(message, chatMessageDTO.message) &&
        Objects.equals(payload, chatMessageDTO.payload);
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

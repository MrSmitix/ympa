package apimodels;

import apimodels.ChatMessagePayloadDTO;
import apimodels.ChatMessageSenderType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о сообщениях.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatMessageDTO   {
  @JsonProperty("messageId")
  @NotNull

  private Long messageId;

  @JsonProperty("createdAt")
  @NotNull
@Valid

  private OffsetDateTime createdAt;

  @JsonProperty("sender")
  @NotNull
@Valid

  private ChatMessageSenderType sender;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("payload")
  @Valid

  private List<@Valid ChatMessagePayloadDTO> payload = null;

  public ChatMessageDTO messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Идентификатор сообщения.
   * @return messageId
  **/
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
  **/
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
  **/
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
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChatMessageDTO payload(List<@Valid ChatMessagePayloadDTO> payload) {
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
  **/
  public List<@Valid ChatMessagePayloadDTO> getPayload() {
    return payload;
  }

  public void setPayload(List<@Valid ChatMessagePayloadDTO> payload) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


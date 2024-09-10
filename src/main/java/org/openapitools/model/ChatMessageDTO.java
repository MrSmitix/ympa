package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatMessagePayloadDTO;
import org.openapitools.model.ChatMessageSenderType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о сообщениях.
 */

@Schema(name = "ChatMessageDTO", description = "Информация о сообщениях.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessageDTO {

  private Long messageId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private ChatMessageSenderType sender;

  private String message;

  @Valid
  private JsonNullable<List<@Valid ChatMessagePayloadDTO>> payload = JsonNullable.<List<@Valid ChatMessagePayloadDTO>>undefined();

  public ChatMessageDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatMessageDTO(Long messageId, OffsetDateTime createdAt, ChatMessageSenderType sender) {
    this.messageId = messageId;
    this.createdAt = createdAt;
    this.sender = sender;
  }

  public ChatMessageDTO messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Идентификатор сообщения.
   * @return messageId
   */
  @NotNull 
  @Schema(name = "messageId", description = "Идентификатор сообщения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageId")
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
  @NotNull @Valid 
  @Schema(name = "createdAt", description = "Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
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
  @NotNull @Valid 
  @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sender")
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
  
  @Schema(name = "message", description = "Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChatMessageDTO payload(List<@Valid ChatMessagePayloadDTO> payload) {
    this.payload = JsonNullable.of(payload);
    return this;
  }

  public ChatMessageDTO addPayloadItem(ChatMessagePayloadDTO payloadItem) {
    if (this.payload == null || !this.payload.isPresent()) {
      this.payload = JsonNullable.of(new ArrayList<>());
    }
    this.payload.get().add(payloadItem);
    return this;
  }

  /**
   * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
   * @return payload
   */
  @Valid 
  @Schema(name = "payload", description = "Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payload")
  public JsonNullable<List<@Valid ChatMessagePayloadDTO>> getPayload() {
    return payload;
  }

  public void setPayload(JsonNullable<List<@Valid ChatMessagePayloadDTO>> payload) {
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
        equalsNullable(this.payload, chatMessageDTO.payload);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, createdAt, sender, message, hashCodeNullable(payload));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


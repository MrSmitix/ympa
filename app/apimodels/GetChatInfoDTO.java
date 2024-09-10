package apimodels;

import apimodels.ChatStatusType;
import apimodels.ChatType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о чатах.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetChatInfoDTO   {
  @JsonProperty("chatId")
  @NotNull

  private Long chatId;

  @JsonProperty("orderId")
  @NotNull

  private Long orderId;

  @JsonProperty("type")
  @NotNull
@Valid

  private ChatType type;

  @JsonProperty("status")
  @NotNull
@Valid

  private ChatStatusType status;

  @JsonProperty("createdAt")
  @NotNull
@Valid

  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @NotNull
@Valid

  private OffsetDateTime updatedAt;

  public GetChatInfoDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

   /**
   * Идентификатор чата.
   * @return chatId
  **/
  public Long getChatId() {
    return chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  public GetChatInfoDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Идентификатор заказа.
   * @return orderId
  **/
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetChatInfoDTO type(ChatType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public ChatType getType() {
    return type;
  }

  public void setType(ChatType type) {
    this.type = type;
  }

  public GetChatInfoDTO status(ChatStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ChatStatusType getStatus() {
    return status;
  }

  public void setStatus(ChatStatusType status) {
    this.status = status;
  }

  public GetChatInfoDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GetChatInfoDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Дата и время последнего сообщения в чате.
   * @return updatedAt
  **/
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChatInfoDTO getChatInfoDTO = (GetChatInfoDTO) o;
    return Objects.equals(chatId, getChatInfoDTO.chatId) &&
        Objects.equals(orderId, getChatInfoDTO.orderId) &&
        Objects.equals(type, getChatInfoDTO.type) &&
        Objects.equals(status, getChatInfoDTO.status) &&
        Objects.equals(createdAt, getChatInfoDTO.createdAt) &&
        Objects.equals(updatedAt, getChatInfoDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatId, orderId, type, status, createdAt, updatedAt);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChatInfoDTO {\n");
    
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


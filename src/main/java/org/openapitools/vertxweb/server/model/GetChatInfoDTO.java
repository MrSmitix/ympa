package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.ChatStatusType;
import org.openapitools.vertxweb.server.model.ChatType;

/**
 * Информация о чатах.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChatInfoDTO   {
  
  private Long chatId;
  private Long orderId;
  private ChatType type;
  private ChatStatusType status;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;

  public GetChatInfoDTO () {

  }

  public GetChatInfoDTO (Long chatId, Long orderId, ChatType type, ChatStatusType status, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.chatId = chatId;
    this.orderId = orderId;
    this.type = type;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("chatId")
  public Long getChatId() {
    return chatId;
  }
  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("type")
  public ChatType getType() {
    return type;
  }
  public void setType(ChatType type) {
    this.type = type;
  }

    
  @JsonProperty("status")
  public ChatStatusType getStatus() {
    return status;
  }
  public void setStatus(ChatStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("updatedAt")
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

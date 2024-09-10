package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о чатах.
 **/
@ApiModel(description="Информация о чатах.")

public class GetChatInfoDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор чата.")
 /**
   * Идентификатор чата.
  **/
  private Long chatId;

  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatType type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatStatusType status;

  @ApiModelProperty(required = true, value = "Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
 /**
   * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  **/
  private Date createdAt;

  @ApiModelProperty(required = true, value = "Дата и время последнего сообщения в чате.")
 /**
   * Дата и время последнего сообщения в чате.
  **/
  private Date updatedAt;
 /**
   * Идентификатор чата.
   * @return chatId
  **/
  @JsonProperty("chatId")
  @NotNull
  public Long getChatId() {
    return chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  public GetChatInfoDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

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

  public GetChatInfoDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public ChatType getType() {
    return type;
  }

  public void setType(ChatType type) {
    this.type = type;
  }

  public GetChatInfoDTO type(ChatType type) {
    this.type = type;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public ChatStatusType getStatus() {
    return status;
  }

  public void setStatus(ChatStatusType status) {
    this.status = status;
  }

  public GetChatInfoDTO status(ChatStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public GetChatInfoDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Дата и время последнего сообщения в чате.
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GetChatInfoDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    GetChatInfoDTO getChatInfoDTO = (GetChatInfoDTO) o;
    return Objects.equals(this.chatId, getChatInfoDTO.chatId) &&
        Objects.equals(this.orderId, getChatInfoDTO.orderId) &&
        Objects.equals(this.type, getChatInfoDTO.type) &&
        Objects.equals(this.status, getChatInfoDTO.status) &&
        Objects.equals(this.createdAt, getChatInfoDTO.createdAt) &&
        Objects.equals(this.updatedAt, getChatInfoDTO.updatedAt);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


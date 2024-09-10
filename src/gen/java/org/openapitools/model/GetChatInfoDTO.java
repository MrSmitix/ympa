package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о чатах.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о чатах.")
public class GetChatInfoDTO   {
  
  private Long chatId;

  private Long orderId;

  private ChatType type;

  private ChatStatusType status;

  private java.util.Date createdAt;

  private java.util.Date updatedAt;

  /**
   * Идентификатор чата.
   **/
  public GetChatInfoDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор чата.")
  @JsonProperty("chatId")
  @NotNull
  public Long getChatId() {
    return chatId;
  }
  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }


  /**
   * Идентификатор заказа.
   **/
  public GetChatInfoDTO orderId(Long orderId) {
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
   **/
  public GetChatInfoDTO type(ChatType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public ChatType getType() {
    return type;
  }
  public void setType(ChatType type) {
    this.type = type;
  }


  /**
   **/
  public GetChatInfoDTO status(ChatStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public ChatStatusType getStatus() {
    return status;
  }
  public void setStatus(ChatStatusType status) {
    this.status = status;
  }


  /**
   * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
   **/
  public GetChatInfoDTO createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  @NotNull
  public java.util.Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Дата и время последнего сообщения в чате.
   **/
  public GetChatInfoDTO updatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время последнего сообщения в чате.")
  @JsonProperty("updatedAt")
  @NotNull
  public java.util.Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(java.util.Date updatedAt) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


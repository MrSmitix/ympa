package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ChatStatusType;
import org.openapitools.model.ChatType;



/**
 * Информация о чатах.
 **/

@ApiModel(description = "Информация о чатах.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatInfoDTO   {
  @JsonProperty("chatId")
  private Long chatId;

  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("type")
  private ChatType type;

  @JsonProperty("status")
  private ChatStatusType status;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("updatedAt")
  private Date updatedAt;

  /**
   * Идентификатор чата.
   **/
  public GetChatInfoDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор чата.")
  @JsonProperty("chatId")
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
  public ChatStatusType getStatus() {
    return status;
  }
  public void setStatus(ChatStatusType status) {
    this.status = status;
  }

  /**
   * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   **/
  public GetChatInfoDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Дата и время последнего сообщения в чате.
   **/
  public GetChatInfoDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время последнего сообщения в чате.")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
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


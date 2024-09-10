/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatMessagePayloadDTO;
import org.openapitools.model.ChatMessageSenderType;



/**
 * Информация о сообщениях.
 */

@ApiModel(description = "Информация о сообщениях.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatMessageDTO   {
  
  private Long messageId;
  private Date createdAt;
  private ChatMessageSenderType sender;
  private String message;
  private List<ChatMessagePayloadDTO> payload;

  /**
   * Идентификатор сообщения.
   */
  public ChatMessageDTO messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор сообщения.")
  @JsonProperty("messageId")
  public Long getMessageId() {
    return messageId;
  }
  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  /**
   * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   */
  public ChatMessageDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   */
  public ChatMessageDTO sender(ChatMessageSenderType sender) {
    this.sender = sender;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sender")
  public ChatMessageSenderType getSender() {
    return sender;
  }
  public void setSender(ChatMessageSenderType sender) {
    this.sender = sender;
  }

  /**
   * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
   */
  public ChatMessageDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
   */
  public ChatMessageDTO payload(List<ChatMessagePayloadDTO> payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(value = "Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ")
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


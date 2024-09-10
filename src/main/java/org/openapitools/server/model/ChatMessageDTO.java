package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ChatMessagePayloadDTO;
import org.openapitools.server.model.ChatMessageSenderType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о сообщениях.
 */
public class ChatMessageDTO   {

    private Long messageId;
    private OffsetDateTime createdAt;
    private ChatMessageSenderType sender;
    private String message;
    private List<@Valid ChatMessagePayloadDTO> payload;

    /**
     * Default constructor.
     */
    public ChatMessageDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatMessageDTO.
     *
     * @param messageId Идентификатор сообщения.
     * @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @param sender sender
     * @param message Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;. 
     * @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;. 
     */
    public ChatMessageDTO(
        Long messageId, 
        OffsetDateTime createdAt, 
        ChatMessageSenderType sender, 
        String message, 
        List<@Valid ChatMessagePayloadDTO> payload
    ) {
        this.messageId = messageId;
        this.createdAt = createdAt;
        this.sender = sender;
        this.message = message;
        this.payload = payload;
    }



    /**
     * Идентификатор сообщения.
     * @return messageId
     */
    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get sender
     * @return sender
     */
    public ChatMessageSenderType getSender() {
        return sender;
    }

    public void setSender(ChatMessageSenderType sender) {
        this.sender = sender;
    }

    /**
     * Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
     * @return payload
     */
    public List<@Valid ChatMessagePayloadDTO> getPayload() {
        return payload;
    }

    public void setPayload(List<@Valid ChatMessagePayloadDTO> payload) {
        this.payload = payload;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


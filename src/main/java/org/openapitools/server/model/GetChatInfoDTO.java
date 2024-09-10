package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.ChatStatusType;
import org.openapitools.server.model.ChatType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о чатах.
 */
public class GetChatInfoDTO   {

    private Long chatId;
    private Long orderId;
    private ChatType type;
    private ChatStatusType status;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public GetChatInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetChatInfoDTO.
     *
     * @param chatId Идентификатор чата.
     * @param orderId Идентификатор заказа.
     * @param type type
     * @param status status
     * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
     * @param updatedAt Дата и время последнего сообщения в чате.
     */
    public GetChatInfoDTO(
        Long chatId, 
        Long orderId, 
        ChatType type, 
        ChatStatusType status, 
        OffsetDateTime createdAt, 
        OffsetDateTime updatedAt
    ) {
        this.chatId = chatId;
        this.orderId = orderId;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }



    /**
     * Идентификатор чата.
     * @return chatId
     */
    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    /**
     * Идентификатор заказа.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Get type
     * @return type
     */
    public ChatType getType() {
        return type;
    }

    public void setType(ChatType type) {
        this.type = type;
    }

    /**
     * Get status
     * @return status
     */
    public ChatStatusType getStatus() {
        return status;
    }

    public void setStatus(ChatStatusType status) {
        this.status = status;
    }

    /**
     * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Дата и время последнего сообщения в чате.
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


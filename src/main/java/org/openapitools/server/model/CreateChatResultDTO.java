package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о созданном чате.
 */
public class CreateChatResultDTO   {

    private Long chatId;

    /**
     * Default constructor.
     */
    public CreateChatResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatResultDTO.
     *
     * @param chatId Идентификатор чата.
     */
    public CreateChatResultDTO(
        Long chatId
    ) {
        this.chatId = chatId;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatResultDTO {\n");
        
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
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


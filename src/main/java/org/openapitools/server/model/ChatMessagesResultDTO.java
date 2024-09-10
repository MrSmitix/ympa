package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ChatMessageDTO;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о сообщениях.
 */
public class ChatMessagesResultDTO   {

    private Long orderId;
    private List<@Valid ChatMessageDTO> messages = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public ChatMessagesResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatMessagesResultDTO.
     *
     * @param orderId Идентификатор заказа.
     * @param messages Информация о сообщениях.
     * @param paging paging
     */
    public ChatMessagesResultDTO(
        Long orderId, 
        List<@Valid ChatMessageDTO> messages, 
        ForwardScrollingPagerDTO paging
    ) {
        this.orderId = orderId;
        this.messages = messages;
        this.paging = paging;
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
     * Информация о сообщениях.
     * @return messages
     */
    public List<@Valid ChatMessageDTO> getMessages() {
        return messages;
    }

    public void setMessages(List<@Valid ChatMessageDTO> messages) {
        this.messages = messages;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatMessagesResultDTO {\n");
        
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.GetChatInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список чатов.
 */
public class GetChatsInfoDTO   {

    private List<@Valid GetChatInfoDTO> chats = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GetChatsInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetChatsInfoDTO.
     *
     * @param chats Информация о чатах.
     * @param paging paging
     */
    public GetChatsInfoDTO(
        List<@Valid GetChatInfoDTO> chats, 
        ForwardScrollingPagerDTO paging
    ) {
        this.chats = chats;
        this.paging = paging;
    }



    /**
     * Информация о чатах.
     * @return chats
     */
    public List<@Valid GetChatInfoDTO> getChats() {
        return chats;
    }

    public void setChats(List<@Valid GetChatInfoDTO> chats) {
        this.chats = chats;
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
        sb.append("class GetChatsInfoDTO {\n");
        
        sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
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


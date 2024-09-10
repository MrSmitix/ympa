package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.GetChatInfoDTO;

/**
 * Список чатов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChatsInfoDTO   {
  
  private List<GetChatInfoDTO> chats = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GetChatsInfoDTO () {

  }

  public GetChatsInfoDTO (List<GetChatInfoDTO> chats, ForwardScrollingPagerDTO paging) {
    this.chats = chats;
    this.paging = paging;
  }

    
  @JsonProperty("chats")
  public List<GetChatInfoDTO> getChats() {
    return chats;
  }
  public void setChats(List<GetChatInfoDTO> chats) {
    this.chats = chats;
  }

    
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChatsInfoDTO getChatsInfoDTO = (GetChatsInfoDTO) o;
    return Objects.equals(chats, getChatsInfoDTO.chats) &&
        Objects.equals(paging, getChatsInfoDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chats, paging);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

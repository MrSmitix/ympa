package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.GetChatInfoDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список чатов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetChatsInfoDTO   {
  @JsonProperty("chats")
  @NotNull
@Valid

  private List<@Valid GetChatInfoDTO> chats = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  public GetChatsInfoDTO chats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
    return this;
  }

  public GetChatsInfoDTO addChatsItem(GetChatInfoDTO chatsItem) {
    if (this.chats == null) {
      this.chats = new ArrayList<>();
    }
    this.chats.add(chatsItem);
    return this;
  }

   /**
   * Информация о чатах.
   * @return chats
  **/
  public List<@Valid GetChatInfoDTO> getChats() {
    return chats;
  }

  public void setChats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
  }

  public GetChatsInfoDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


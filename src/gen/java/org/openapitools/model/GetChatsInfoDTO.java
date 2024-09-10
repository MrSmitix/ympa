package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetChatInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список чатов.
 */
@ApiModel(description="Список чатов.")

public class GetChatsInfoDTO  {
  
 /**
  * Информация о чатах.
  */
  @ApiModelProperty(required = true, value = "Информация о чатах.")
  @Valid
  private List<@Valid GetChatInfoDTO> chats = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Информация о чатах.
  * @return chats
  */
  @JsonProperty("chats")
  @NotNull
  public List<@Valid GetChatInfoDTO> getChats() {
    return chats;
  }

  /**
   * Sets the <code>chats</code> property.
   */
 public void setChats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
  }

  /**
   * Sets the <code>chats</code> property.
   */
  public GetChatsInfoDTO chats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
    return this;
  }

  /**
   * Adds a new item to the <code>chats</code> list.
   */
  public GetChatsInfoDTO addChatsItem(GetChatInfoDTO chatsItem) {
    this.chats.add(chatsItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public GetChatsInfoDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
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
    return Objects.equals(this.chats, getChatsInfoDTO.chats) &&
        Objects.equals(this.paging, getChatsInfoDTO.paging);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


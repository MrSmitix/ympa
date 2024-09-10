package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetChatInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список чатов.
 **/
@ApiModel(description = "Список чатов.")
@JsonTypeName("GetChatsInfoDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsInfoDTO   {
  private @Valid List<@Valid GetChatInfoDTO> chats = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Информация о чатах.
   **/
  public GetChatsInfoDTO chats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о чатах.")
  @JsonProperty("chats")
  @NotNull @Valid public List<@Valid GetChatInfoDTO> getChats() {
    return chats;
  }

  @JsonProperty("chats")
  public void setChats(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
  }

  public GetChatsInfoDTO addChatsItem(GetChatInfoDTO chatsItem) {
    if (this.chats == null) {
      this.chats = new ArrayList<>();
    }

    this.chats.add(chatsItem);
    return this;
  }

  public GetChatsInfoDTO removeChatsItem(GetChatInfoDTO chatsItem) {
    if (chatsItem != null && this.chats != null) {
      this.chats.remove(chatsItem);
    }

    return this;
  }
  /**
   **/
  public GetChatsInfoDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


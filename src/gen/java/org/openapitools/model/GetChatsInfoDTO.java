package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetChatInfoDTO;



/**
 * Список чатов.
 **/

@ApiModel(description = "Список чатов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsInfoDTO   {
  @JsonProperty("chats")
  private List<GetChatInfoDTO> chats = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  /**
   * Информация о чатах.
   **/
  public GetChatsInfoDTO chats(List<GetChatInfoDTO> chats) {
    this.chats = chats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о чатах.")
  @JsonProperty("chats")
  public List<GetChatInfoDTO> getChats() {
    return chats;
  }
  public void setChats(List<GetChatInfoDTO> chats) {
    this.chats = chats;
  }

  /**
   **/
  public GetChatsInfoDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
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


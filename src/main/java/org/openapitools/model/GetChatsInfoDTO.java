package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetChatInfoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список чатов.
 */

@Schema(name = "GetChatsInfoDTO", description = "Список чатов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatsInfoDTO {

  @Valid
  private List<@Valid GetChatInfoDTO> chats = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public GetChatsInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetChatsInfoDTO(List<@Valid GetChatInfoDTO> chats) {
    this.chats = chats;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "chats", description = "Информация о чатах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chats")
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
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


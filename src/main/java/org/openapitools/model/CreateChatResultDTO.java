package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о созданном чате.
 */

@Schema(name = "CreateChatResultDTO", description = "Информация о созданном чате.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CreateChatResultDTO {

  private Long chatId;

  public CreateChatResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatResultDTO(Long chatId) {
    this.chatId = chatId;
  }

  public CreateChatResultDTO chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

  /**
   * Идентификатор чата.
   * @return chatId
   */
  @NotNull 
  @Schema(name = "chatId", description = "Идентификатор чата.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chatId")
  public Long getChatId() {
    return chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatResultDTO createChatResultDTO = (CreateChatResultDTO) o;
    return Objects.equals(this.chatId, createChatResultDTO.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatId);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


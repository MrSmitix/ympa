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
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */

@Schema(name = "GetChatHistoryRequest", description = "Историю какого чата нужно получить — и начиная с какого сообщения. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetChatHistoryRequest {

  private Long messageIdFrom;

  public GetChatHistoryRequest messageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
    return this;
  }

  /**
   * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
   * @return messageIdFrom
   */
  
  @Schema(name = "messageIdFrom", description = "Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageIdFrom")
  public Long getMessageIdFrom() {
    return messageIdFrom;
  }

  public void setMessageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChatHistoryRequest getChatHistoryRequest = (GetChatHistoryRequest) o;
    return Objects.equals(this.messageIdFrom, getChatHistoryRequest.messageIdFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageIdFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChatHistoryRequest {\n");
    sb.append("    messageIdFrom: ").append(toIndentedString(messageIdFrom)).append("\n");
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


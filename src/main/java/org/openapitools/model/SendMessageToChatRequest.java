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
 * В какой чат нужно отправить сообщение и текст сообщения.
 */

@Schema(name = "SendMessageToChatRequest", description = "В какой чат нужно отправить сообщение и текст сообщения.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SendMessageToChatRequest {

  private String message;

  public SendMessageToChatRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SendMessageToChatRequest(String message) {
    this.message = message;
  }

  public SendMessageToChatRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Текст сообщения. Максимальная длина — 4096 символа.
   * @return message
   */
  @NotNull @Size(min = 1, max = 4096) 
  @Schema(name = "message", description = "Текст сообщения. Максимальная длина — 4096 символа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageToChatRequest sendMessageToChatRequest = (SendMessageToChatRequest) o;
    return Objects.equals(this.message, sendMessageToChatRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageToChatRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


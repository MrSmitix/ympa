package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "В какой чат нужно отправить сообщение и текст сообщения.")
public class SendMessageToChatRequest   {
  
  private String message;

  /**
   * Текст сообщения. Максимальная длина — 4096 символа.
   **/
  public SendMessageToChatRequest message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Текст сообщения. Максимальная длина — 4096 символа.")
  @JsonProperty("message")
  @NotNull
 @Size(min=1,max=4096)  public String getMessage() {
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


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 */
@ApiModel(description="В какой чат нужно отправить сообщение и текст сообщения.")

public class SendMessageToChatRequest  {
  
 /**
  * Текст сообщения. Максимальная длина — 4096 символа.
  */
  @ApiModelProperty(required = true, value = "Текст сообщения. Максимальная длина — 4096 символа.")
  private String message;
 /**
  * Текст сообщения. Максимальная длина — 4096 символа.
  * @return message
  */
  @JsonProperty("message")
  @NotNull
 @Size(min=1,max=4096)  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public SendMessageToChatRequest message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


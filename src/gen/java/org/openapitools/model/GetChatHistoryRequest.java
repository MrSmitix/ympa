package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Историю какого чата нужно получить — и начиная с какого сообщения. 
 **/
@ApiModel(description="Историю какого чата нужно получить — и начиная с какого сообщения. ")

public class GetChatHistoryRequest  {
  
  @ApiModelProperty(value = "Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.")
 /**
   * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
  **/
  private Long messageIdFrom;
 /**
   * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
   * @return messageIdFrom
  **/
  @JsonProperty("messageIdFrom")
  public Long getMessageIdFrom() {
    return messageIdFrom;
  }

  public void setMessageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
  }

  public GetChatHistoryRequest messageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


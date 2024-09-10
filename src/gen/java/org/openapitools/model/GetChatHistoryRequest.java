package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Историю какого чата нужно получить — и начиная с какого сообщения. ")
public class GetChatHistoryRequest   {
  
  private Long messageIdFrom;

  /**
   * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
   **/
  public GetChatHistoryRequest messageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.")
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


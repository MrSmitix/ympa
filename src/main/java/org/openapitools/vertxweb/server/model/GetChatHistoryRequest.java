package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetChatHistoryRequest   {
  
  private Long messageIdFrom;

  public GetChatHistoryRequest () {

  }

  public GetChatHistoryRequest (Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
  }

    
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
    return Objects.equals(messageIdFrom, getChatHistoryRequest.messageIdFrom);
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

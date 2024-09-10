package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetChatHistoryRequest   {
  @JsonProperty("messageIdFrom")
  
  private Long messageIdFrom;

  public GetChatHistoryRequest messageIdFrom(Long messageIdFrom) {
    this.messageIdFrom = messageIdFrom;
    return this;
  }

   /**
   * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
   * @return messageIdFrom
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


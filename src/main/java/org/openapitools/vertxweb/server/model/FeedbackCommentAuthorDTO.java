package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FeedbackCommentAuthorType;

/**
 * Информация об авторе комментария.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackCommentAuthorDTO   {
  
  private FeedbackCommentAuthorType type;
  private String name;

  public FeedbackCommentAuthorDTO () {

  }

  public FeedbackCommentAuthorDTO (FeedbackCommentAuthorType type, String name) {
    this.type = type;
    this.name = name;
  }

    
  @JsonProperty("type")
  public FeedbackCommentAuthorType getType() {
    return type;
  }
  public void setType(FeedbackCommentAuthorType type) {
    this.type = type;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackCommentAuthorDTO feedbackCommentAuthorDTO = (FeedbackCommentAuthorDTO) o;
    return Objects.equals(type, feedbackCommentAuthorDTO.type) &&
        Objects.equals(name, feedbackCommentAuthorDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackCommentAuthorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

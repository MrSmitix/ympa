package apimodels;

import apimodels.FeedbackCommentAuthorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об авторе комментария.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackCommentAuthorDTO   {
  @JsonProperty("type")
  @Valid

  private FeedbackCommentAuthorType type;

  @JsonProperty("name")
  
  private String name;

  public FeedbackCommentAuthorDTO type(FeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public FeedbackCommentAuthorType getType() {
    return type;
  }

  public void setType(FeedbackCommentAuthorType type) {
    this.type = type;
  }

  public FeedbackCommentAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя автора отзыва или название магазина.
   * @return name
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


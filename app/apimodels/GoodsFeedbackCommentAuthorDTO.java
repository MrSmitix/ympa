package apimodels;

import apimodels.GoodsFeedbackCommentAuthorType;
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
public class GoodsFeedbackCommentAuthorDTO   {
  @JsonProperty("type")
  @Valid

  private GoodsFeedbackCommentAuthorType type;

  @JsonProperty("name")
  
  private String name;

  public GoodsFeedbackCommentAuthorDTO type(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public GoodsFeedbackCommentAuthorType getType() {
    return type;
  }

  public void setType(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
  }

  public GoodsFeedbackCommentAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя автора или название кабинета.
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
    GoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO = (GoodsFeedbackCommentAuthorDTO) o;
    return Objects.equals(type, goodsFeedbackCommentAuthorDTO.type) &&
        Objects.equals(name, goodsFeedbackCommentAuthorDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackCommentAuthorDTO {\n");
    
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


package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedbackCommentAuthorType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация об авторе комментария.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentAuthorDTO   {
  
  private FeedbackCommentAuthorType type;
  private String name;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public FeedbackCommentAuthorType getType() {
    return type;
  }
  public void setType(FeedbackCommentAuthorType type) {
    this.type = type;
  }

  /**
   * Имя автора отзыва или название магазина.
   **/
  
  @ApiModelProperty(value = "Имя автора отзыва или название магазина.")
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
    return Objects.equals(this.type, feedbackCommentAuthorDTO.type) &&
        Objects.equals(this.name, feedbackCommentAuthorDTO.name);
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

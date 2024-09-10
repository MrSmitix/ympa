package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FeedbackCommentAuthorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об авторе комментария.
 */

@Schema(name = "FeedbackCommentAuthorDTO", description = "Информация об авторе комментария.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentAuthorDTO {

  private FeedbackCommentAuthorType type;

  private String name;

  public FeedbackCommentAuthorDTO type(FeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  
  @Schema(name = "name", description = "Имя автора отзыва или название магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


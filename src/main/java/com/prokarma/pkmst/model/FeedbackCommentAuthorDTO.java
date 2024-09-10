package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.FeedbackCommentAuthorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об авторе комментария.
 */
@ApiModel(description = "Информация об авторе комментария.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentAuthorDTO   {
  @JsonProperty("type")
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
   */
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Имя автора отзыва или название магазина.")
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


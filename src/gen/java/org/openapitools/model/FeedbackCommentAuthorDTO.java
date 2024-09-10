package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedbackCommentAuthorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об авторе комментария.
 */
@ApiModel(description="Информация об авторе комментария.")

public class FeedbackCommentAuthorDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FeedbackCommentAuthorType type;

 /**
  * Имя автора отзыва или название магазина.
  */
  @ApiModelProperty(value = "Имя автора отзыва или название магазина.")
  private String name;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public FeedbackCommentAuthorType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(FeedbackCommentAuthorType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public FeedbackCommentAuthorDTO type(FeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

 /**
  * Имя автора отзыва или название магазина.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public FeedbackCommentAuthorDTO name(String name) {
    this.name = name;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


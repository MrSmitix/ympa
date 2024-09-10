package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GoodsFeedbackCommentAuthorType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об авторе комментария.
 **/
@ApiModel(description="Информация об авторе комментария.")

public class GoodsFeedbackCommentAuthorDTO  {
  
  @ApiModelProperty(value = "")
  private GoodsFeedbackCommentAuthorType type;

  @ApiModelProperty(value = "Имя автора или название кабинета.")
 /**
   * Имя автора или название кабинета.
  **/
  private String name;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public GoodsFeedbackCommentAuthorType getType() {
    return type;
  }

  public void setType(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
  }

  public GoodsFeedbackCommentAuthorDTO type(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

 /**
   * Имя автора или название кабинета.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoodsFeedbackCommentAuthorDTO name(String name) {
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
    GoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO = (GoodsFeedbackCommentAuthorDTO) o;
    return Objects.equals(this.type, goodsFeedbackCommentAuthorDTO.type) &&
        Objects.equals(this.name, goodsFeedbackCommentAuthorDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


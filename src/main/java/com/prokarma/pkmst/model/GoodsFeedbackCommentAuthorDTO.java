package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.GoodsFeedbackCommentAuthorType;
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
public class GoodsFeedbackCommentAuthorDTO   {
  @JsonProperty("type")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "Имя автора или название кабинета.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


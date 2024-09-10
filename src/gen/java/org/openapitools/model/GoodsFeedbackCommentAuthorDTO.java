package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackCommentAuthorType;



/**
 * Информация об авторе комментария.
 **/

@ApiModel(description = "Информация об авторе комментария.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentAuthorDTO   {
  @JsonProperty("type")
  private GoodsFeedbackCommentAuthorType type;

  @JsonProperty("name")
  private String name;

  /**
   **/
  public GoodsFeedbackCommentAuthorDTO type(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public GoodsFeedbackCommentAuthorType getType() {
    return type;
  }
  public void setType(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
  }

  /**
   * Имя автора или название кабинета.
   **/
  public GoodsFeedbackCommentAuthorDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Имя автора или название кабинета.")
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
    GoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO = (GoodsFeedbackCommentAuthorDTO) o;
    return Objects.equals(type, goodsFeedbackCommentAuthorDTO.type) &&
        Objects.equals(name, goodsFeedbackCommentAuthorDTO.name);
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


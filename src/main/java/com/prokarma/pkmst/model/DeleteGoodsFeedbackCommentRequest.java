package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Фильтр запроса отзывов по бизнесу. 
 */
@ApiModel(description = "Фильтр запроса отзывов по бизнесу. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteGoodsFeedbackCommentRequest   {
  @JsonProperty("id")
  private Long id;

  public DeleteGoodsFeedbackCommentRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор комментария к отзыву. ")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = (DeleteGoodsFeedbackCommentRequest) o;
    return Objects.equals(this.id, deleteGoodsFeedbackCommentRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGoodsFeedbackCommentRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


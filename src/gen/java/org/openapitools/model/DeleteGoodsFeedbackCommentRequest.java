package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтр запроса отзывов по бизнесу. 
 **/
@ApiModel(description="Фильтр запроса отзывов по бизнесу. ")

public class DeleteGoodsFeedbackCommentRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор комментария к отзыву. ")
 /**
   * Идентификатор комментария к отзыву. 
  **/
  private Long id;
 /**
   * Идентификатор комментария к отзыву. 
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeleteGoodsFeedbackCommentRequest id(Long id) {
    this.id = id;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


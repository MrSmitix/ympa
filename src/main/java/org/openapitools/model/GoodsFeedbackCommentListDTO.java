/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackCommentDTO;



/**
 * Комментарии к отзыву.
 */

@ApiModel(description = "Комментарии к отзыву.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentListDTO   {
  
  private List<GoodsFeedbackCommentDTO> comments = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Список комментариев.
   */
  public GoodsFeedbackCommentListDTO comments(List<GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список комментариев.")
  @JsonProperty("comments")
  public List<GoodsFeedbackCommentDTO> getComments() {
    return comments;
  }
  public void setComments(List<GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  /**
   */
  public GoodsFeedbackCommentListDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO = (GoodsFeedbackCommentListDTO) o;
    return Objects.equals(comments, goodsFeedbackCommentListDTO.comments) &&
        Objects.equals(paging, goodsFeedbackCommentListDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackCommentListDTO {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


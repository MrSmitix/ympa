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



/**
 * Комментарий к отзыву или другому комментарию.
 */

@ApiModel(description = "Комментарий к отзыву или другому комментарию.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateGoodsFeedbackCommentDTO   {
  
  private Long id;
  private Long parentId;
  private String text;

  /**
   * Идентификатор комментария к отзыву. 
   */
  public UpdateGoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Идентификатор комментария к отзыву. 
   */
  public UpdateGoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   * Текст комментария.
   */
  public UpdateGoodsFeedbackCommentDTO text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Текст комментария.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO = (UpdateGoodsFeedbackCommentDTO) o;
    return Objects.equals(id, updateGoodsFeedbackCommentDTO.id) &&
        Objects.equals(parentId, updateGoodsFeedbackCommentDTO.parentId) &&
        Objects.equals(text, updateGoodsFeedbackCommentDTO.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGoodsFeedbackCommentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


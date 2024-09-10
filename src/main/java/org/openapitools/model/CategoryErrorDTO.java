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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CategoryErrorType;



/**
 * Текст ошибки.
 */

@ApiModel(description = "Текст ошибки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryErrorDTO   {
  
  private Long categoryId;
  private CategoryErrorType type;

  /**
   * Идентификатор категории.
   */
  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор категории.")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   */
  public CategoryErrorDTO type(CategoryErrorType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public CategoryErrorType getType() {
    return type;
  }
  public void setType(CategoryErrorType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryErrorDTO categoryErrorDTO = (CategoryErrorDTO) o;
    return Objects.equals(categoryId, categoryErrorDTO.categoryId) &&
        Objects.equals(type, categoryErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryErrorDTO {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


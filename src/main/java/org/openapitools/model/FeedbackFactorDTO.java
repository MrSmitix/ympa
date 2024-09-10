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
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 */

@ApiModel(description = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackFactorDTO   {
  
  private Long id;
  private String title;
  private String description;
  private Integer value;

  /**
   * Идентификатор параметра.
   */
  public FeedbackFactorDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор параметра.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название параметра. Например, `Скорость обработки заказа`.
   */
  public FeedbackFactorDTO title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Название параметра. Например, `Скорость обработки заказа`.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
   */
  public FeedbackFactorDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
   */
  public FeedbackFactorDTO value(Integer value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). ")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackFactorDTO feedbackFactorDTO = (FeedbackFactorDTO) o;
    return Objects.equals(id, feedbackFactorDTO.id) &&
        Objects.equals(title, feedbackFactorDTO.title) &&
        Objects.equals(description, feedbackFactorDTO.description) &&
        Objects.equals(value, feedbackFactorDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackFactorDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


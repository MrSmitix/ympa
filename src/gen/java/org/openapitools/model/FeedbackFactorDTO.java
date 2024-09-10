package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 */
@ApiModel(description="Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")

public class FeedbackFactorDTO  {
  
 /**
  * Идентификатор параметра.
  */
  @ApiModelProperty(value = "Идентификатор параметра.")
  private Long id;

 /**
  * Название параметра. Например, `Скорость обработки заказа`.
  */
  @ApiModelProperty(value = "Название параметра. Например, `Скорость обработки заказа`.")
  private String title;

 /**
  * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
  */
  @ApiModelProperty(value = "Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.")
  private String description;

 /**
  * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
  */
  @ApiModelProperty(value = "Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). ")
  private Integer value;
 /**
  * Идентификатор параметра.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FeedbackFactorDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название параметра. Например, &#x60;Скорость обработки заказа&#x60;.
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public FeedbackFactorDTO title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public FeedbackFactorDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка). 
  * @return value
  */
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public FeedbackFactorDTO value(Integer value) {
    this.value = value;
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
    FeedbackFactorDTO feedbackFactorDTO = (FeedbackFactorDTO) o;
    return Objects.equals(this.id, feedbackFactorDTO.id) &&
        Objects.equals(this.title, feedbackFactorDTO.title) &&
        Objects.equals(this.description, feedbackFactorDTO.description) &&
        Objects.equals(this.value, feedbackFactorDTO.value);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


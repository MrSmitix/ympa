package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */
@ApiModel(description = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackFactorDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("value")
  private Integer value;

  public FeedbackFactorDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор параметра.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор параметра.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedbackFactorDTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Название параметра. Например, `Скорость обработки заказа`.
   * @return title
  **/
  @ApiModelProperty(value = "Название параметра. Например, `Скорость обработки заказа`.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FeedbackFactorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
   * @return description
  **/
  @ApiModelProperty(value = "Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeedbackFactorDTO value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
   * @return value
  **/
  @ApiModelProperty(value = "Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


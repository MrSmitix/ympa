package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */

@Schema(name = "FeedbackFactorDTO", description = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackFactorDTO {

  private Long id;

  private String title;

  private String description;

  private Integer value;

  public FeedbackFactorDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор параметра.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор параметра.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  
  @Schema(name = "title", description = "Название параметра. Например, `Скорость обработки заказа`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
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
   */
  
  @Schema(name = "description", description = "Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
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
   */
  
  @Schema(name = "value", description = "Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


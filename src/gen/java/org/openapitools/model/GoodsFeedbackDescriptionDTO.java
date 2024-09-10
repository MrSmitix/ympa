package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Текстовая часть отзыва.
 **/

@ApiModel(description = "Текстовая часть отзыва.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDescriptionDTO   {
  @JsonProperty("advantages")
  private String advantages;

  @JsonProperty("disadvantages")
  private String disadvantages;

  @JsonProperty("comment")
  private String comment;

  /**
   * Описание плюсов товара в отзыве.
   **/
  public GoodsFeedbackDescriptionDTO advantages(String advantages) {
    this.advantages = advantages;
    return this;
  }

  
  @ApiModelProperty(value = "Описание плюсов товара в отзыве.")
  @JsonProperty("advantages")
  public String getAdvantages() {
    return advantages;
  }
  public void setAdvantages(String advantages) {
    this.advantages = advantages;
  }

  /**
   * Описание минусов товара в отзыве.
   **/
  public GoodsFeedbackDescriptionDTO disadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
    return this;
  }

  
  @ApiModelProperty(value = "Описание минусов товара в отзыве.")
  @JsonProperty("disadvantages")
  public String getDisadvantages() {
    return disadvantages;
  }
  public void setDisadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
  }

  /**
   * Комментарий в отзыве.
   **/
  public GoodsFeedbackDescriptionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий в отзыве.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO = (GoodsFeedbackDescriptionDTO) o;
    return Objects.equals(advantages, goodsFeedbackDescriptionDTO.advantages) &&
        Objects.equals(disadvantages, goodsFeedbackDescriptionDTO.disadvantages) &&
        Objects.equals(comment, goodsFeedbackDescriptionDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advantages, disadvantages, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackDescriptionDTO {\n");
    
    sb.append("    advantages: ").append(toIndentedString(advantages)).append("\n");
    sb.append("    disadvantages: ").append(toIndentedString(disadvantages)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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


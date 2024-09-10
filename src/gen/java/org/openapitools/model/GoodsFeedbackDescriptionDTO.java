package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Текстовая часть отзыва.
 */
@ApiModel(description="Текстовая часть отзыва.")

public class GoodsFeedbackDescriptionDTO  {
  
 /**
  * Описание плюсов товара в отзыве.
  */
  @ApiModelProperty(value = "Описание плюсов товара в отзыве.")
  private String advantages;

 /**
  * Описание минусов товара в отзыве.
  */
  @ApiModelProperty(value = "Описание минусов товара в отзыве.")
  private String disadvantages;

 /**
  * Комментарий в отзыве.
  */
  @ApiModelProperty(value = "Комментарий в отзыве.")
  private String comment;
 /**
  * Описание плюсов товара в отзыве.
  * @return advantages
  */
  @JsonProperty("advantages")
  public String getAdvantages() {
    return advantages;
  }

  /**
   * Sets the <code>advantages</code> property.
   */
 public void setAdvantages(String advantages) {
    this.advantages = advantages;
  }

  /**
   * Sets the <code>advantages</code> property.
   */
  public GoodsFeedbackDescriptionDTO advantages(String advantages) {
    this.advantages = advantages;
    return this;
  }

 /**
  * Описание минусов товара в отзыве.
  * @return disadvantages
  */
  @JsonProperty("disadvantages")
  public String getDisadvantages() {
    return disadvantages;
  }

  /**
   * Sets the <code>disadvantages</code> property.
   */
 public void setDisadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
  }

  /**
   * Sets the <code>disadvantages</code> property.
   */
  public GoodsFeedbackDescriptionDTO disadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
    return this;
  }

 /**
  * Комментарий в отзыве.
  * @return comment
  */
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  /**
   * Sets the <code>comment</code> property.
   */
 public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * Sets the <code>comment</code> property.
   */
  public GoodsFeedbackDescriptionDTO comment(String comment) {
    this.comment = comment;
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
    GoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO = (GoodsFeedbackDescriptionDTO) o;
    return Objects.equals(this.advantages, goodsFeedbackDescriptionDTO.advantages) &&
        Objects.equals(this.disadvantages, goodsFeedbackDescriptionDTO.disadvantages) &&
        Objects.equals(this.comment, goodsFeedbackDescriptionDTO.comment);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


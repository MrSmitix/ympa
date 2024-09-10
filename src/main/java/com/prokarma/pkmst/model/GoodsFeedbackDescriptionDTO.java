package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Текстовая часть отзыва.
 */
@ApiModel(description = "Текстовая часть отзыва.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDescriptionDTO   {
  @JsonProperty("advantages")
  private String advantages;

  @JsonProperty("disadvantages")
  private String disadvantages;

  @JsonProperty("comment")
  private String comment;

  public GoodsFeedbackDescriptionDTO advantages(String advantages) {
    this.advantages = advantages;
    return this;
  }

  /**
   * Описание плюсов товара в отзыве.
   * @return advantages
   */
  @ApiModelProperty(value = "Описание плюсов товара в отзыве.")
  public String getAdvantages() {
    return advantages;
  }

  public void setAdvantages(String advantages) {
    this.advantages = advantages;
  }

  public GoodsFeedbackDescriptionDTO disadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
    return this;
  }

  /**
   * Описание минусов товара в отзыве.
   * @return disadvantages
   */
  @ApiModelProperty(value = "Описание минусов товара в отзыве.")
  public String getDisadvantages() {
    return disadvantages;
  }

  public void setDisadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
  }

  public GoodsFeedbackDescriptionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий в отзыве.
   * @return comment
   */
  @ApiModelProperty(value = "Комментарий в отзыве.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


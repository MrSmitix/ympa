package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Текстовая часть отзыва.
 **/
@ApiModel(description = "Текстовая часть отзыва.")
@JsonTypeName("GoodsFeedbackDescriptionDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDescriptionDTO   {
  private String advantages;
  private String disadvantages;
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

  @JsonProperty("advantages")
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

  @JsonProperty("disadvantages")
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

  @JsonProperty("comment")
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


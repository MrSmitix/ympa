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
 * Текстовая часть отзыва.
 */

@Schema(name = "GoodsFeedbackDescriptionDTO", description = "Текстовая часть отзыва.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackDescriptionDTO {

  private String advantages;

  private String disadvantages;

  private String comment;

  public GoodsFeedbackDescriptionDTO advantages(String advantages) {
    this.advantages = advantages;
    return this;
  }

  /**
   * Описание плюсов товара в отзыве.
   * @return advantages
   */
  
  @Schema(name = "advantages", description = "Описание плюсов товара в отзыве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advantages")
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
  
  @Schema(name = "disadvantages", description = "Описание минусов товара в отзыве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disadvantages")
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
  
  @Schema(name = "comment", description = "Комментарий в отзыве.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Текстовая часть отзыва.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackDescriptionDTO   {
  
  private String advantages;
  private String disadvantages;
  private String comment;

  public GoodsFeedbackDescriptionDTO () {

  }

  public GoodsFeedbackDescriptionDTO (String advantages, String disadvantages, String comment) {
    this.advantages = advantages;
    this.disadvantages = disadvantages;
    this.comment = comment;
  }

    
  @JsonProperty("advantages")
  public String getAdvantages() {
    return advantages;
  }
  public void setAdvantages(String advantages) {
    this.advantages = advantages;
  }

    
  @JsonProperty("disadvantages")
  public String getDisadvantages() {
    return disadvantages;
  }
  public void setDisadvantages(String disadvantages) {
    this.disadvantages = disadvantages;
  }

    
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

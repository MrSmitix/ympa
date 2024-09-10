package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Сообщение об ошибке, связанной с размещением товара.
 **/

@ApiModel(description = "Сообщение об ошибке, связанной с размещением товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferErrorDTO   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("comment")
  private String comment;

  /**
   * Тип ошибки.
   **/
  public OfferErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Тип ошибки.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Пояснение.
   **/
  public OfferErrorDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(value = "Пояснение.")
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
    OfferErrorDTO offerErrorDTO = (OfferErrorDTO) o;
    return Objects.equals(message, offerErrorDTO.message) &&
        Objects.equals(comment, offerErrorDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferErrorDTO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


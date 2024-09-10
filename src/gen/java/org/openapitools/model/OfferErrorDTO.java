package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Сообщение об ошибке, связанной с размещением товара.
 **/
@ApiModel(description="Сообщение об ошибке, связанной с размещением товара.")

public class OfferErrorDTO  {
  
  @ApiModelProperty(value = "Тип ошибки.")
 /**
   * Тип ошибки.
  **/
  private String message;

  @ApiModelProperty(value = "Пояснение.")
 /**
   * Пояснение.
  **/
  private String comment;
 /**
   * Тип ошибки.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OfferErrorDTO message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Пояснение.
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public OfferErrorDTO comment(String comment) {
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
    OfferErrorDTO offerErrorDTO = (OfferErrorDTO) o;
    return Objects.equals(this.message, offerErrorDTO.message) &&
        Objects.equals(this.comment, offerErrorDTO.comment);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


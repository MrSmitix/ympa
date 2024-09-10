package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Сообщение об ошибке, связанной с размещением товара.
 */
@ApiModel(description="Сообщение об ошибке, связанной с размещением товара.")

public class OfferErrorDTO  {
  
 /**
  * Тип ошибки.
  */
  @ApiModelProperty(value = "Тип ошибки.")
  private String message;

 /**
  * Пояснение.
  */
  @ApiModelProperty(value = "Пояснение.")
  private String comment;
 /**
  * Тип ошибки.
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public OfferErrorDTO message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Пояснение.
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


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Инструкция по использованию товара. 
 */
@ApiModel(description="Инструкция по использованию товара. ")

public class OfferManualDTO  {
  
 /**
  * Ссылка на инструкцию.
  */
  @ApiModelProperty(required = true, value = "Ссылка на инструкцию.")
  private String url;

 /**
  * Название инструкции, которое будет отображаться на карточке товара. 
  */
  @ApiModelProperty(value = "Название инструкции, которое будет отображаться на карточке товара. ")
  private String title;
 /**
  * Ссылка на инструкцию.
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public OfferManualDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Название инструкции, которое будет отображаться на карточке товара. 
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public OfferManualDTO title(String title) {
    this.title = title;
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
    OfferManualDTO offerManualDTO = (OfferManualDTO) o;
    return Objects.equals(this.url, offerManualDTO.url) &&
        Objects.equals(this.title, offerManualDTO.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferManualDTO {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Инструкция по использованию товара. 
 **/
@ApiModel(description="Инструкция по использованию товара. ")

public class OfferManualDTO  {
  
  @ApiModelProperty(required = true, value = "Ссылка на инструкцию.")
 /**
   * Ссылка на инструкцию.
  **/
  private String url;

  @ApiModelProperty(value = "Название инструкции, которое будет отображаться на карточке товара. ")
 /**
   * Название инструкции, которое будет отображаться на карточке товара. 
  **/
  private String title;
 /**
   * Ссылка на инструкцию.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OfferManualDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Название инструкции, которое будет отображаться на карточке товара. 
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

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


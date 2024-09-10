package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Инструкция по использованию товара. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Инструкция по использованию товара. ")
public class OfferManualDTO   {
  
  private String url;

  private String title;

  /**
   * Ссылка на инструкцию.
   **/
  public OfferManualDTO url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ссылка на инструкцию.")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Название инструкции, которое будет отображаться на карточке товара. 
   **/
  public OfferManualDTO title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Название инструкции, которое будет отображаться на карточке товара. ")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


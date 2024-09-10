package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Инструкция по использованию товара. 
 */
@ApiModel(description = "Инструкция по использованию товара. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferManualDTO   {
  @JsonProperty("url")
  private String url;

  @JsonProperty("title")
  private String title;

  public OfferManualDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Ссылка на инструкцию.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Ссылка на инструкцию.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OfferManualDTO title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Название инструкции, которое будет отображаться на карточке товара. 
   * @return title
  **/
  @ApiModelProperty(value = "Название инструкции, которое будет отображаться на карточке товара. ")
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


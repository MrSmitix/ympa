package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Инструкция по использованию товара. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferManualDTO   {
  
  private String url;
  private String title;

  public OfferManualDTO () {

  }

  public OfferManualDTO (String url, String title) {
    this.url = url;
    this.title = title;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
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
    return Objects.equals(url, offerManualDTO.url) &&
        Objects.equals(title, offerManualDTO.title);
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

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
 * Инструкция по использованию товара. 
 */

@Schema(name = "OfferManualDTO", description = "Инструкция по использованию товара. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferManualDTO {

  private String url;

  private String title;

  public OfferManualDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferManualDTO(String url) {
    this.url = url;
  }

  public OfferManualDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на инструкцию.
   * @return url
   */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на инструкцию.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
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
   */
  
  @Schema(name = "title", description = "Название инструкции, которое будет отображаться на карточке товара. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


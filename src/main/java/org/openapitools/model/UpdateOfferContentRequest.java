package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferContentDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на установку новых значений для параметров.
 */

@Schema(name = "UpdateOfferContentRequest", description = "Запрос на установку новых значений для параметров.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentRequest {

  @Valid
  private List<@Valid OfferContentDTO> offersContent = new ArrayList<>();

  public UpdateOfferContentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferContentRequest(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }

  public UpdateOfferContentRequest offersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  public UpdateOfferContentRequest addOffersContentItem(OfferContentDTO offersContentItem) {
    if (this.offersContent == null) {
      this.offersContent = new ArrayList<>();
    }
    this.offersContent.add(offersContentItem);
    return this;
  }

  /**
   * Список товаров с указанными характеристиками.
   * @return offersContent
   */
  @NotNull @Valid @Size(min = 1, max = 100) 
  @Schema(name = "offersContent", description = "Список товаров с указанными характеристиками.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offersContent")
  public List<@Valid OfferContentDTO> getOffersContent() {
    return offersContent;
  }

  public void setOffersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentRequest updateOfferContentRequest = (UpdateOfferContentRequest) o;
    return Objects.equals(this.offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentRequest {\n");
    sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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


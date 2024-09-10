package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingEntryDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на обновление товаров.
 */

@Schema(name = "UpdateOfferMappingEntryRequest", description = "Запрос на обновление товаров.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingEntryRequest {

  @Valid
  private List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public UpdateOfferMappingEntryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferMappingEntryRequest(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  public UpdateOfferMappingEntryRequest offerMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    if (this.offerMappingEntries == null) {
      this.offerMappingEntries = new ArrayList<>();
    }
    this.offerMappingEntries.add(offerMappingEntriesItem);
    return this;
  }

  /**
   * Информация о товарах в каталоге.
   * @return offerMappingEntries
   */
  @NotNull @Valid @Size(min = 1, max = 500) 
  @Schema(name = "offerMappingEntries", description = "Информация о товарах в каталоге.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerMappingEntries")
  public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = (UpdateOfferMappingEntryRequest) o;
    return Objects.equals(this.offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryRequest {\n");
    sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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


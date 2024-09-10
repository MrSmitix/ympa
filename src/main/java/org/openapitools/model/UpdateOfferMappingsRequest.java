package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateOfferMappingsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingsRequest {

  @Valid
  private List<@Valid UpdateOfferMappingDTO> offerMappings = new ArrayList<>();

  private Boolean onlyPartnerMediaContent;

  public UpdateOfferMappingsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferMappingsRequest(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  public UpdateOfferMappingsRequest offerMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  public UpdateOfferMappingsRequest addOfferMappingsItem(UpdateOfferMappingDTO offerMappingsItem) {
    if (this.offerMappings == null) {
      this.offerMappings = new ArrayList<>();
    }
    this.offerMappings.add(offerMappingsItem);
    return this;
  }

  /**
   * Перечень товаров, которые нужно добавить или обновить.
   * @return offerMappings
   */
  @NotNull @Valid @Size(min = 1, max = 500) 
  @Schema(name = "offerMappings", description = "Перечень товаров, которые нужно добавить или обновить.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerMappings")
  public List<@Valid UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  public UpdateOfferMappingsRequest onlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
    return this;
  }

  /**
   * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
   * @return onlyPartnerMediaContent
   */
  
  @Schema(name = "onlyPartnerMediaContent", description = "Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlyPartnerMediaContent")
  public Boolean getOnlyPartnerMediaContent() {
    return onlyPartnerMediaContent;
  }

  public void setOnlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingsRequest updateOfferMappingsRequest = (UpdateOfferMappingsRequest) o;
    return Objects.equals(this.offerMappings, updateOfferMappingsRequest.offerMappings) &&
        Objects.equals(this.onlyPartnerMediaContent, updateOfferMappingsRequest.onlyPartnerMediaContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappings, onlyPartnerMediaContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingsRequest {\n");
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
    sb.append("    onlyPartnerMediaContent: ").append(toIndentedString(onlyPartnerMediaContent)).append("\n");
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


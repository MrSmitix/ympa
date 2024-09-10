package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferMappingDTO;
import org.openapitools.model.UpdateMappingsOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingEntryDTO   {
  
  private OfferMappingDTO mapping;
  private OfferMappingDTO awaitingModerationMapping;
  private OfferMappingDTO rejectedMapping;
  private UpdateMappingsOfferDTO offer;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  @Valid
  public OfferMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("awaitingModerationMapping")
  @Valid
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }
  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rejectedMapping")
  @Valid
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }
  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public UpdateMappingsOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(UpdateMappingsOfferDTO offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingEntryDTO updateOfferMappingEntryDTO = (UpdateOfferMappingEntryDTO) o;
    return Objects.equals(this.mapping, updateOfferMappingEntryDTO.mapping) &&
        Objects.equals(this.awaitingModerationMapping, updateOfferMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(this.rejectedMapping, updateOfferMappingEntryDTO.rejectedMapping) &&
        Objects.equals(this.offer, updateOfferMappingEntryDTO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryDTO {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

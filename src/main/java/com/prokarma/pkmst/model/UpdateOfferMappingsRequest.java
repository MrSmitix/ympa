package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateOfferMappingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UpdateOfferMappingsRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingsRequest   {
  @JsonProperty("offerMappings")
  
  private List<UpdateOfferMappingDTO> offerMappings = new ArrayList<>();

  @JsonProperty("onlyPartnerMediaContent")
  private Boolean onlyPartnerMediaContent;

  public UpdateOfferMappingsRequest offerMappings(List<UpdateOfferMappingDTO> offerMappings) {
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
  @ApiModelProperty(required = true, value = "Перечень товаров, которые нужно добавить или обновить.")
  public List<UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<UpdateOfferMappingDTO> offerMappings) {
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
  @ApiModelProperty(value = "Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. ")
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


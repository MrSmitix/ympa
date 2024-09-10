package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOfferMappingsRequest  {
  
 /**
  * Перечень товаров, которые нужно добавить или обновить.
  */
  @ApiModelProperty(required = true, value = "Перечень товаров, которые нужно добавить или обновить.")
  @Valid
  private List<@Valid UpdateOfferMappingDTO> offerMappings = new ArrayList<>();

 /**
  * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
  */
  @ApiModelProperty(value = "Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. ")
  private Boolean onlyPartnerMediaContent;
 /**
  * Перечень товаров, которые нужно добавить или обновить.
  * @return offerMappings
  */
  @JsonProperty("offerMappings")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  /**
   * Sets the <code>offerMappings</code> property.
   */
 public void setOfferMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  /**
   * Sets the <code>offerMappings</code> property.
   */
  public UpdateOfferMappingsRequest offerMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  /**
   * Adds a new item to the <code>offerMappings</code> list.
   */
  public UpdateOfferMappingsRequest addOfferMappingsItem(UpdateOfferMappingDTO offerMappingsItem) {
    this.offerMappings.add(offerMappingsItem);
    return this;
  }

 /**
  * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. 
  * @return onlyPartnerMediaContent
  */
  @JsonProperty("onlyPartnerMediaContent")
  public Boolean getOnlyPartnerMediaContent() {
    return onlyPartnerMediaContent;
  }

  /**
   * Sets the <code>onlyPartnerMediaContent</code> property.
   */
 public void setOnlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
  }

  /**
   * Sets the <code>onlyPartnerMediaContent</code> property.
   */
  public UpdateOfferMappingsRequest onlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


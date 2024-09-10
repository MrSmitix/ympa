package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOfferMappingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingsRequest   {
  
  private List<@Valid UpdateOfferMappingDTO> offerMappings = new ArrayList<>();
  private Boolean onlyPartnerMediaContent;

  /**
   * Перечень товаров, которые нужно добавить или обновить.
   **/
  
  @ApiModelProperty(required = true, value = "Перечень товаров, которые нужно добавить или обновить.")
  @JsonProperty("offerMappings")
  @NotNull
 @Size(min=1,max=500)  @Valid
  public List<@Valid UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }
  public void setOfferMappings(List<@Valid UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  /**
   * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. 
   **/
  
  @ApiModelProperty(value = "Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. ")
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


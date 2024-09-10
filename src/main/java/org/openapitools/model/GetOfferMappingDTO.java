/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.GetOfferDTO;



/**
 * Информация о товаре.
 */

@ApiModel(description = "Информация о товаре.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingDTO   {
  
  private GetOfferDTO offer;
  private GetMappingDTO mapping;

  /**
   */
  public GetOfferMappingDTO offer(GetOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  public GetOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(GetOfferDTO offer) {
    this.offer = offer;
  }

  /**
   */
  public GetOfferMappingDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferMappingDTO getOfferMappingDTO = (GetOfferMappingDTO) o;
    return Objects.equals(offer, getOfferMappingDTO.offer) &&
        Objects.equals(mapping, getOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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


/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.GetOfferDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о товаре.
 */
@ApiModel(description = "Информация о товаре.")
@JsonPropertyOrder({
  GetOfferMappingDTO.JSON_PROPERTY_OFFER,
  GetOfferMappingDTO.JSON_PROPERTY_MAPPING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingDTO   {
  public static final String JSON_PROPERTY_OFFER = "offer";
  @JsonProperty(JSON_PROPERTY_OFFER)
  private GetOfferDTO offer;

  public static final String JSON_PROPERTY_MAPPING = "mapping";
  @JsonProperty(JSON_PROPERTY_MAPPING)
  private GetMappingDTO mapping;

  public GetOfferMappingDTO offer(GetOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   **/
  @JsonProperty(value = "offer")
  @ApiModelProperty(value = "")
  @Valid 
  public GetOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(GetOfferDTO offer) {
    this.offer = offer;
  }

  public GetOfferMappingDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   **/
  @JsonProperty(value = "mapping")
  @ApiModelProperty(value = "")
  @Valid 
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
    return Objects.equals(this.offer, getOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, getOfferMappingDTO.mapping);
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


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
import org.openapitools.model.OfferMappingDTO;



/**
 * Информация о карточке товара.
 */

@ApiModel(description = "Информация о карточке товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingInfoDTO   {
  
  private OfferMappingDTO mapping;
  private OfferMappingDTO awaitingModerationMapping;
  private OfferMappingDTO rejectedMapping;

  /**
   */
  public OfferMappingInfoDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  public OfferMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   */
  public OfferMappingInfoDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("awaitingModerationMapping")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }
  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  /**
   */
  public OfferMappingInfoDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rejectedMapping")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }
  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingInfoDTO offerMappingInfoDTO = (OfferMappingInfoDTO) o;
    return Objects.equals(mapping, offerMappingInfoDTO.mapping) &&
        Objects.equals(awaitingModerationMapping, offerMappingInfoDTO.awaitingModerationMapping) &&
        Objects.equals(rejectedMapping, offerMappingInfoDTO.rejectedMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingInfoDTO {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
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


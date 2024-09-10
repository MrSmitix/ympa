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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferMappingEntryDTO;
import org.openapitools.model.ScrollingPagerDTO;



/**
 * Информация о товарах в каталоге.
 */

@ApiModel(description = "Информация о товарах в каталоге.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingEntriesDTO   {
  
  private ScrollingPagerDTO paging;
  private List<OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  /**
   */
  public OfferMappingEntriesDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Информация о товарах в каталоге.
   */
  public OfferMappingEntriesDTO offerMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о товарах в каталоге.")
  @JsonProperty("offerMappingEntries")
  public List<OfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }
  public void setOfferMappingEntries(List<OfferMappingEntryDTO> offerMappingEntries) {
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
    OfferMappingEntriesDTO offerMappingEntriesDTO = (OfferMappingEntriesDTO) o;
    return Objects.equals(paging, offerMappingEntriesDTO.paging) &&
        Objects.equals(offerMappingEntries, offerMappingEntriesDTO.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerMappingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingEntriesDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


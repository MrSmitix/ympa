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
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */

@ApiModel(description = "Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteCampaignOffersDTO   {
  
  private List<String> notDeletedOfferIds;

  /**
   * Список SKU.
   */
  public DeleteCampaignOffersDTO notDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список SKU.")
  @JsonProperty("notDeletedOfferIds")
  public List<String> getNotDeletedOfferIds() {
    return notDeletedOfferIds;
  }
  public void setNotDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCampaignOffersDTO deleteCampaignOffersDTO = (DeleteCampaignOffersDTO) o;
    return Objects.equals(notDeletedOfferIds, deleteCampaignOffersDTO.notDeletedOfferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notDeletedOfferIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCampaignOffersDTO {\n");
    
    sb.append("    notDeletedOfferIds: ").append(toIndentedString(notDeletedOfferIds)).append("\n");
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


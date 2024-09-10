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
import org.openapitools.model.RejectedPromoOfferDeleteDTO;



/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 */

@ApiModel(description = "Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeletePromoOffersResultDTO   {
  
  private List<RejectedPromoOfferDeleteDTO> rejectedOffers;

  /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
   */
  public DeletePromoOffersResultDTO rejectedOffers(List<RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. ")
  @JsonProperty("rejectedOffers")
  public List<RejectedPromoOfferDeleteDTO> getRejectedOffers() {
    return rejectedOffers;
  }
  public void setRejectedOffers(List<RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePromoOffersResultDTO deletePromoOffersResultDTO = (DeletePromoOffersResultDTO) o;
    return Objects.equals(rejectedOffers, deletePromoOffersResultDTO.rejectedOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePromoOffersResultDTO {\n");
    
    sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
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


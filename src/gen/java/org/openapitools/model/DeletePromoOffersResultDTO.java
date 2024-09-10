package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferDeleteDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 **/
@ApiModel(description="Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. ")

public class DeletePromoOffersResultDTO  {
  
  @ApiModelProperty(value = "Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. ")
  @Valid
 /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
  **/
  private List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers;
 /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
   * @return rejectedOffers
  **/
  @JsonProperty("rejectedOffers")
  public List<@Valid RejectedPromoOfferDeleteDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  public void setRejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public DeletePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  public DeletePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferDeleteDTO rejectedOffersItem) {
    this.rejectedOffers.add(rejectedOffersItem);
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
    DeletePromoOffersResultDTO deletePromoOffersResultDTO = (DeletePromoOffersResultDTO) o;
    return Objects.equals(this.rejectedOffers, deletePromoOffersResultDTO.rejectedOffers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


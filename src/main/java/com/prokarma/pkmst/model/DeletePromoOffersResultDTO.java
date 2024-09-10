package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.RejectedPromoOfferDeleteDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */
@ApiModel(description = "Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeletePromoOffersResultDTO   {
  @JsonProperty("rejectedOffers")
  
  private List<RejectedPromoOfferDeleteDTO> rejectedOffers = null;

  public DeletePromoOffersResultDTO rejectedOffers(List<RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  public DeletePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferDeleteDTO rejectedOffersItem) {
    if (this.rejectedOffers == null) {
      this.rejectedOffers = new ArrayList<>();
    }
    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

  /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
   * @return rejectedOffers
   */
  @ApiModelProperty(value = "Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferDeleteDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 **/
@ApiModel(description = "Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. ")
@JsonTypeName("DeletePromoOffersResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeletePromoOffersResultDTO   {
  private @Valid List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers;

  /**
   * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
   **/
  public DeletePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. ")
  @JsonProperty("rejectedOffers")
  @Valid public List<@Valid RejectedPromoOfferDeleteDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  @JsonProperty("rejectedOffers")
  public void setRejectedOffers(List<@Valid RejectedPromoOfferDeleteDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public DeletePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferDeleteDTO rejectedOffersItem) {
    if (this.rejectedOffers == null) {
      this.rejectedOffers = new ArrayList<>();
    }

    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

  public DeletePromoOffersResultDTO removeRejectedOffersItem(RejectedPromoOfferDeleteDTO rejectedOffersItem) {
    if (rejectedOffersItem != null && this.rejectedOffers != null) {
      this.rejectedOffers.remove(rejectedOffersItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.UpdatePromoOfferParamsDTO;

/**
 * Описание товаров, которые участвуют в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePromoOfferDTO   {
  
  private String offerId;
  private UpdatePromoOfferParamsDTO params;

  public UpdatePromoOfferDTO () {

  }

  public UpdatePromoOfferDTO (String offerId, UpdatePromoOfferParamsDTO params) {
    this.offerId = offerId;
    this.params = params;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("params")
  public UpdatePromoOfferParamsDTO getParams() {
    return params;
  }
  public void setParams(UpdatePromoOfferParamsDTO params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOfferDTO updatePromoOfferDTO = (UpdatePromoOfferDTO) o;
    return Objects.equals(offerId, updatePromoOfferDTO.offerId) &&
        Objects.equals(params, updatePromoOfferDTO.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

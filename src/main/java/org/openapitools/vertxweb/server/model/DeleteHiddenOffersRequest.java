package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.HiddenOfferDTO;

/**
 * Запрос на возобновление показа оферов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteHiddenOffersRequest   {
  
  private List<HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  public DeleteHiddenOffersRequest () {

  }

  public DeleteHiddenOffersRequest (List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

    
  @JsonProperty("hiddenOffers")
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }
  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHiddenOffersRequest deleteHiddenOffersRequest = (DeleteHiddenOffersRequest) o;
    return Objects.equals(hiddenOffers, deleteHiddenOffersRequest.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHiddenOffersRequest {\n");
    
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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

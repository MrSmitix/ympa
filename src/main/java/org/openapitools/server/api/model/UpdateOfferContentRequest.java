package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OfferContentDTO;

/**
 * Запрос на установку новых значений для параметров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferContentRequest   {
  
  private List<OfferContentDTO> offersContent = new ArrayList<>();

  public UpdateOfferContentRequest () {

  }

  public UpdateOfferContentRequest (List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }

    
  @JsonProperty("offersContent")
  public List<OfferContentDTO> getOffersContent() {
    return offersContent;
  }
  public void setOffersContent(List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentRequest updateOfferContentRequest = (UpdateOfferContentRequest) o;
    return Objects.equals(offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentRequest {\n");
    
    sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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

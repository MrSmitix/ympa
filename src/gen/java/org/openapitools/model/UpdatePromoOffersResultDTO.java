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
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;



/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 **/

@ApiModel(description = "Ошибки и предупреждения, которые появились при добавлении товаров в акцию.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersResultDTO   {
  @JsonProperty("rejectedOffers")
  private List<RejectedPromoOfferUpdateDTO> rejectedOffers = null;

  @JsonProperty("warningOffers")
  private List<WarningPromoOfferUpdateDTO> warningOffers = null;

  /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
   **/
  public UpdatePromoOffersResultDTO rejectedOffers(List<RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ")
  @JsonProperty("rejectedOffers")
  public List<RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }
  public void setRejectedOffers(List<RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
   **/
  public UpdatePromoOffersResultDTO warningOffers(List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ")
  @JsonProperty("warningOffers")
  public List<WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }
  public void setWarningOffers(List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOffersResultDTO updatePromoOffersResultDTO = (UpdatePromoOffersResultDTO) o;
    return Objects.equals(rejectedOffers, updatePromoOffersResultDTO.rejectedOffers) &&
        Objects.equals(warningOffers, updatePromoOffersResultDTO.warningOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedOffers, warningOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersResultDTO {\n");
    
    sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
    sb.append("    warningOffers: ").append(toIndentedString(warningOffers)).append("\n");
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


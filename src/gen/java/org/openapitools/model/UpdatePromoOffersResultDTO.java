package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 **/
@ApiModel(description="Ошибки и предупреждения, которые появились при добавлении товаров в акцию.")

public class UpdatePromoOffersResultDTO  {
  
  @ApiModelProperty(value = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ")
 /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  **/
  private List<RejectedPromoOfferUpdateDTO> rejectedOffers;

  @ApiModelProperty(value = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ")
 /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  **/
  private List<WarningPromoOfferUpdateDTO> warningOffers;
 /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
   * @return rejectedOffers
  **/
  @JsonProperty("rejectedOffers")
  public List<RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  public void setRejectedOffers(List<RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public UpdatePromoOffersResultDTO rejectedOffers(List<RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  public UpdatePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

 /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
   * @return warningOffers
  **/
  @JsonProperty("warningOffers")
  public List<WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }

  public void setWarningOffers(List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
  }

  public UpdatePromoOffersResultDTO warningOffers(List<WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
    return this;
  }

  public UpdatePromoOffersResultDTO addWarningOffersItem(WarningPromoOfferUpdateDTO warningOffersItem) {
    this.warningOffers.add(warningOffersItem);
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
    UpdatePromoOffersResultDTO updatePromoOffersResultDTO = (UpdatePromoOffersResultDTO) o;
    return Objects.equals(this.rejectedOffers, updatePromoOffersResultDTO.rejectedOffers) &&
        Objects.equals(this.warningOffers, updatePromoOffersResultDTO.warningOffers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


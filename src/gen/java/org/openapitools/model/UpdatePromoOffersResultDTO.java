package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */
@ApiModel(description="Ошибки и предупреждения, которые появились при добавлении товаров в акцию.")

public class UpdatePromoOffersResultDTO  {
  
 /**
  * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  */
  @ApiModelProperty(value = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ")
  @Valid
  private List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers;

 /**
  * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  */
  @ApiModelProperty(value = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ")
  @Valid
  private List<@Valid WarningPromoOfferUpdateDTO> warningOffers;
 /**
  * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  * @return rejectedOffers
  */
  @JsonProperty("rejectedOffers")
  public List<@Valid RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  /**
   * Sets the <code>rejectedOffers</code> property.
   */
 public void setRejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  /**
   * Sets the <code>rejectedOffers</code> property.
   */
  public UpdatePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  /**
   * Adds a new item to the <code>rejectedOffers</code> list.
   */
  public UpdatePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

 /**
  * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  * @return warningOffers
  */
  @JsonProperty("warningOffers")
  public List<@Valid WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }

  /**
   * Sets the <code>warningOffers</code> property.
   */
 public void setWarningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
  }

  /**
   * Sets the <code>warningOffers</code> property.
   */
  public UpdatePromoOffersResultDTO warningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
    return this;
  }

  /**
   * Adds a new item to the <code>warningOffers</code> list.
   */
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


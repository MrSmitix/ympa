package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 **/
@ApiModel(description = "Ошибки и предупреждения, которые появились при добавлении товаров в акцию.")
@JsonTypeName("UpdatePromoOffersResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersResultDTO   {
  private @Valid List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers;
  private @Valid List<@Valid WarningPromoOfferUpdateDTO> warningOffers;

  /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
   **/
  public UpdatePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ")
  @JsonProperty("rejectedOffers")
  @Valid public List<@Valid RejectedPromoOfferUpdateDTO> getRejectedOffers() {
    return rejectedOffers;
  }

  @JsonProperty("rejectedOffers")
  public void setRejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public UpdatePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    if (this.rejectedOffers == null) {
      this.rejectedOffers = new ArrayList<>();
    }

    this.rejectedOffers.add(rejectedOffersItem);
    return this;
  }

  public UpdatePromoOffersResultDTO removeRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    if (rejectedOffersItem != null && this.rejectedOffers != null) {
      this.rejectedOffers.remove(rejectedOffersItem);
    }

    return this;
  }
  /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
   **/
  public UpdatePromoOffersResultDTO warningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ")
  @JsonProperty("warningOffers")
  @Valid public List<@Valid WarningPromoOfferUpdateDTO> getWarningOffers() {
    return warningOffers;
  }

  @JsonProperty("warningOffers")
  public void setWarningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = warningOffers;
  }

  public UpdatePromoOffersResultDTO addWarningOffersItem(WarningPromoOfferUpdateDTO warningOffersItem) {
    if (this.warningOffers == null) {
      this.warningOffers = new ArrayList<>();
    }

    this.warningOffers.add(warningOffersItem);
    return this;
  }

  public UpdatePromoOffersResultDTO removeWarningOffersItem(WarningPromoOfferUpdateDTO warningOffersItem) {
    if (warningOffersItem != null && this.warningOffers != null) {
      this.warningOffers.remove(warningOffersItem);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


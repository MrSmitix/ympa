/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetPromoOfferDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 */
@ApiModel(description = "Список товаров, которые участвуют или могут участвовать в акции.")
@JsonPropertyOrder({
  GetPromoOffersResultDTO.JSON_PROPERTY_OFFERS,
  GetPromoOffersResultDTO.JSON_PROPERTY_PAGING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoOffersResultDTO   {
  public static final String JSON_PROPERTY_OFFERS = "offers";
  @JsonProperty(JSON_PROPERTY_OFFERS)
  private List<@Valid GetPromoOfferDTO> offers = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGING = "paging";
  @JsonProperty(JSON_PROPERTY_PAGING)
  private ForwardScrollingPagerDTO paging;

  public GetPromoOffersResultDTO offers(List<@Valid GetPromoOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetPromoOffersResultDTO addOffersItem(GetPromoOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Товары, которые участвуют или могут участвовать в акции.
   * @return offers
   **/
  @JsonProperty(value = "offers")
  @ApiModelProperty(required = true, value = "Товары, которые участвуют или могут участвовать в акции.")
  @NotNull @Valid 
  public List<@Valid GetPromoOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid GetPromoOfferDTO> offers) {
    this.offers = offers;
  }

  public GetPromoOffersResultDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   **/
  @JsonProperty(value = "paging")
  @ApiModelProperty(value = "")
  @Valid 
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoOffersResultDTO getPromoOffersResultDTO = (GetPromoOffersResultDTO) o;
    return Objects.equals(this.offers, getPromoOffersResultDTO.offers) &&
        Objects.equals(this.paging, getPromoOffersResultDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoOffersResultDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePromoOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersRequest   {
  
  private String promoId;
  private List<@Valid UpdatePromoOfferDTO> offers = new ArrayList<>();

  /**
   * Идентификатор акции.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор акции.")
  @JsonProperty("promoId")
  @NotNull
  public String getPromoId() {
    return promoId;
  }
  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  /**
   * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
   **/
  
  @ApiModelProperty(required = true, value = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdatePromoOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid UpdatePromoOfferDTO> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOffersRequest updatePromoOffersRequest = (UpdatePromoOffersRequest) o;
    return Objects.equals(this.promoId, updatePromoOffersRequest.promoId) &&
        Objects.equals(this.offers, updatePromoOffersRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOffersRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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


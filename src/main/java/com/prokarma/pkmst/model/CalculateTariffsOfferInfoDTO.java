package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CalculateTariffsOfferDTO;
import com.prokarma.pkmst.model.CalculatedTariffDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Стоимость услуг.
 */
@ApiModel(description = "Стоимость услуг.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferInfoDTO   {
  @JsonProperty("offer")
  private CalculateTariffsOfferDTO offer;

  @JsonProperty("tariffs")
  
  private List<CalculatedTariffDTO> tariffs = new ArrayList<>();

  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @ApiModelProperty(required = true, value = "")
  public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

  public CalculateTariffsOfferInfoDTO tariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  public CalculateTariffsOfferInfoDTO addTariffsItem(CalculatedTariffDTO tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<>();
    }
    this.tariffs.add(tariffsItem);
    return this;
  }

  /**
   * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   * @return tariffs
   */
  @ApiModelProperty(required = true, value = "Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  public List<CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }

  public void setTariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO = (CalculateTariffsOfferInfoDTO) o;
    return Objects.equals(this.offer, calculateTariffsOfferInfoDTO.offer) &&
        Objects.equals(this.tariffs, calculateTariffsOfferInfoDTO.tariffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, tariffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsOfferInfoDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
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


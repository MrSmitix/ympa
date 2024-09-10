package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculatedTariffDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Стоимость услуг.
 **/
@ApiModel(description = "Стоимость услуг.")
@JsonTypeName("CalculateTariffsOfferInfoDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferInfoDTO   {
  private CalculateTariffsOfferDTO offer;
  private @Valid List<@Valid CalculatedTariffDTO> tariffs = new ArrayList<>();

  /**
   **/
  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offer")
  @NotNull @Valid public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }

  @JsonProperty("offer")
  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

  /**
   * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
   **/
  public CalculateTariffsOfferInfoDTO tariffs(List<@Valid CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ")
  @JsonProperty("tariffs")
  @NotNull @Valid public List<@Valid CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }

  @JsonProperty("tariffs")
  public void setTariffs(List<@Valid CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

  public CalculateTariffsOfferInfoDTO addTariffsItem(CalculatedTariffDTO tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<>();
    }

    this.tariffs.add(tariffsItem);
    return this;
  }

  public CalculateTariffsOfferInfoDTO removeTariffsItem(CalculatedTariffDTO tariffsItem) {
    if (tariffsItem != null && this.tariffs != null) {
      this.tariffs.remove(tariffsItem);
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


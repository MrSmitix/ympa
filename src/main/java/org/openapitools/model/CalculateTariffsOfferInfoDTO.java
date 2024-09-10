package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculatedTariffDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Стоимость услуг.
 */

@Schema(name = "CalculateTariffsOfferInfoDTO", description = "Стоимость услуг.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferInfoDTO {

  private CalculateTariffsOfferDTO offer;

  @Valid
  private List<@Valid CalculatedTariffDTO> tariffs = new ArrayList<>();

  public CalculateTariffsOfferInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CalculateTariffsOfferInfoDTO(CalculateTariffsOfferDTO offer, List<@Valid CalculatedTariffDTO> tariffs) {
    this.offer = offer;
    this.tariffs = tariffs;
  }

  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @NotNull @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offer")
  public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

  public CalculateTariffsOfferInfoDTO tariffs(List<@Valid CalculatedTariffDTO> tariffs) {
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
  @NotNull @Valid 
  @Schema(name = "tariffs", description = "Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tariffs")
  public List<@Valid CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }

  public void setTariffs(List<@Valid CalculatedTariffDTO> tariffs) {
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


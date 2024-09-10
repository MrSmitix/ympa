package apimodels;

import apimodels.CalculateTariffsOfferDTO;
import apimodels.CalculatedTariffDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Стоимость услуг.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CalculateTariffsOfferInfoDTO   {
  @JsonProperty("offer")
  @NotNull
@Valid

  private CalculateTariffsOfferDTO offer;

  @JsonProperty("tariffs")
  @NotNull
@Valid

  private List<@Valid CalculatedTariffDTO> tariffs = new ArrayList<>();

  public CalculateTariffsOfferInfoDTO offer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
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
  **/
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
    return Objects.equals(offer, calculateTariffsOfferInfoDTO.offer) &&
        Objects.equals(tariffs, calculateTariffsOfferInfoDTO.tariffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, tariffs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CalculateTariffsOfferDTO;
import org.openapitools.server.model.CalculatedTariffDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Стоимость услуг.
 */
public class CalculateTariffsOfferInfoDTO   {

    private CalculateTariffsOfferDTO offer;
    private List<@Valid CalculatedTariffDTO> tariffs = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CalculateTariffsOfferInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsOfferInfoDTO.
     *
     * @param offer offer
     * @param tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     */
    public CalculateTariffsOfferInfoDTO(
        CalculateTariffsOfferDTO offer, 
        List<@Valid CalculatedTariffDTO> tariffs
    ) {
        this.offer = offer;
        this.tariffs = tariffs;
    }



    /**
     * Get offer
     * @return offer
     */
    public CalculateTariffsOfferDTO getOffer() {
        return offer;
    }

    public void setOffer(CalculateTariffsOfferDTO offer) {
        this.offer = offer;
    }

    /**
     * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
     * @return tariffs
     */
    public List<@Valid CalculatedTariffDTO> getTariffs() {
        return tariffs;
    }

    public void setTariffs(List<@Valid CalculatedTariffDTO> tariffs) {
        this.tariffs = tariffs;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


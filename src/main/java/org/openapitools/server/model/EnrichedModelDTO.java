package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ModelOfferDTO;
import org.openapitools.server.model.ModelPriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Модель товара.
 */
public class EnrichedModelDTO   {

    private Long id;
    private String name;
    private ModelPriceDTO prices;
    private List<@Valid ModelOfferDTO> offers;
    private Integer offlineOffers;
    private Integer onlineOffers;

    /**
     * Default constructor.
     */
    public EnrichedModelDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create EnrichedModelDTO.
     *
     * @param id Идентификатор модели товара.
     * @param name Название модели товара.
     * @param prices prices
     * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
     * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
     * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
     */
    public EnrichedModelDTO(
        Long id, 
        String name, 
        ModelPriceDTO prices, 
        List<@Valid ModelOfferDTO> offers, 
        Integer offlineOffers, 
        Integer onlineOffers
    ) {
        this.id = id;
        this.name = name;
        this.prices = prices;
        this.offers = offers;
        this.offlineOffers = offlineOffers;
        this.onlineOffers = onlineOffers;
    }



    /**
     * Идентификатор модели товара.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название модели товара.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get prices
     * @return prices
     */
    public ModelPriceDTO getPrices() {
        return prices;
    }

    public void setPrices(ModelPriceDTO prices) {
        this.prices = prices;
    }

    /**
     * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
     * @return offers
     */
    public List<@Valid ModelOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid ModelOfferDTO> offers) {
        this.offers = offers;
    }

    /**
     * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
     * @return offlineOffers
     */
    public Integer getOfflineOffers() {
        return offlineOffers;
    }

    public void setOfflineOffers(Integer offlineOffers) {
        this.offlineOffers = offlineOffers;
    }

    /**
     * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
     * @return onlineOffers
     */
    public Integer getOnlineOffers() {
        return onlineOffers;
    }

    public void setOnlineOffers(Integer onlineOffers) {
        this.onlineOffers = onlineOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnrichedModelDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
        sb.append("    offlineOffers: ").append(toIndentedString(offlineOffers)).append("\n");
        sb.append("    onlineOffers: ").append(toIndentedString(onlineOffers)).append("\n");
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


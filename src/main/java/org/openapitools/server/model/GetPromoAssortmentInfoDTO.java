package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товарах в акции.
 */
public class GetPromoAssortmentInfoDTO   {

    private Integer activeOffers;
    private Integer potentialOffers;
    private Boolean processing;

    /**
     * Default constructor.
     */
    public GetPromoAssortmentInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoAssortmentInfoDTO.
     *
     * @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
     * @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
     * @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
     */
    public GetPromoAssortmentInfoDTO(
        Integer activeOffers, 
        Integer potentialOffers, 
        Boolean processing
    ) {
        this.activeOffers = activeOffers;
        this.potentialOffers = potentialOffers;
        this.processing = processing;
    }



    /**
     * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
     * @return activeOffers
     */
    public Integer getActiveOffers() {
        return activeOffers;
    }

    public void setActiveOffers(Integer activeOffers) {
        this.activeOffers = activeOffers;
    }

    /**
     * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
     * @return potentialOffers
     */
    public Integer getPotentialOffers() {
        return potentialOffers;
    }

    public void setPotentialOffers(Integer potentialOffers) {
        this.potentialOffers = potentialOffers;
    }

    /**
     * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
     * @return processing
     */
    public Boolean getProcessing() {
        return processing;
    }

    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoAssortmentInfoDTO {\n");
        
        sb.append("    activeOffers: ").append(toIndentedString(activeOffers)).append("\n");
        sb.append("    potentialOffers: ").append(toIndentedString(potentialOffers)).append("\n");
        sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
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


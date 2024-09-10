package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.WarehouseOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об остатках товаров на складе.
 */
public class WarehouseOffersDTO   {

    private Long warehouseId;
    private List<@Valid WarehouseOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public WarehouseOffersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseOffersDTO.
     *
     * @param warehouseId Идентификатор склада.
     * @param offers Информация об остатках.
     */
    public WarehouseOffersDTO(
        Long warehouseId, 
        List<@Valid WarehouseOfferDTO> offers
    ) {
        this.warehouseId = warehouseId;
        this.offers = offers;
    }



    /**
     * Идентификатор склада.
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * Информация об остатках.
     * @return offers
     */
    public List<@Valid WarehouseOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid WarehouseOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehouseOffersDTO {\n");
        
        sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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


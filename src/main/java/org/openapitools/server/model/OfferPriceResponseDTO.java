package org.openapitools.server.model;

import java.time.OffsetDateTime;
import org.openapitools.server.model.PriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об установленной цене на товар.
 */
public class OfferPriceResponseDTO   {

    private String id;
    private PriceDTO price;
    private Long marketSku;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public OfferPriceResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferPriceResponseDTO.
     *
     * @param id Идентификатор предложения из прайс-листа.
     * @param price price
     * @param marketSku SKU на Маркете.
     * @param updatedAt Дата и время последнего обновления цены на товар.
     */
    public OfferPriceResponseDTO(
        String id, 
        PriceDTO price, 
        Long marketSku, 
        OffsetDateTime updatedAt
    ) {
        this.id = id;
        this.price = price;
        this.marketSku = marketSku;
        this.updatedAt = updatedAt;
    }



    /**
     * Идентификатор предложения из прайс-листа.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get price
     * @return price
     */
    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    /**
     * SKU на Маркете.
     * @return marketSku
     */
    public Long getMarketSku() {
        return marketSku;
    }

    public void setMarketSku(Long marketSku) {
        this.marketSku = marketSku;
    }

    /**
     * Дата и время последнего обновления цены на товар.
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPriceResponseDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedPublicationFullDTO;
import org.openapitools.server.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.server.model.FeedStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */
public class FeedPublicationDTO   {

    private FeedStatusType status;
    private FeedPublicationFullDTO full;
    private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

    /**
     * Default constructor.
     */
    public FeedPublicationDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedPublicationDTO.
     *
     * @param status status
     * @param full full
     * @param priceAndStockUpdate priceAndStockUpdate
     */
    public FeedPublicationDTO(
        FeedStatusType status, 
        FeedPublicationFullDTO full, 
        FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate
    ) {
        this.status = status;
        this.full = full;
        this.priceAndStockUpdate = priceAndStockUpdate;
    }



    /**
     * Get status
     * @return status
     */
    public FeedStatusType getStatus() {
        return status;
    }

    public void setStatus(FeedStatusType status) {
        this.status = status;
    }

    /**
     * Get full
     * @return full
     */
    public FeedPublicationFullDTO getFull() {
        return full;
    }

    public void setFull(FeedPublicationFullDTO full) {
        this.full = full;
    }

    /**
     * Get priceAndStockUpdate
     * @return priceAndStockUpdate
     */
    public FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate() {
        return priceAndStockUpdate;
    }

    public void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
        this.priceAndStockUpdate = priceAndStockUpdate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedPublicationDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    full: ").append(toIndentedString(full)).append("\n");
        sb.append("    priceAndStockUpdate: ").append(toIndentedString(priceAndStockUpdate)).append("\n");
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


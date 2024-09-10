package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ReturnInstanceStatusType;
import org.openapitools.server.model.ReturnInstanceStockType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Логистическая информация по возврату.
 */
public class ReturnInstanceDTO   {

    private ReturnInstanceStockType stockType;
    private ReturnInstanceStatusType status;
    private String cis;
    private String imei;

    /**
     * Default constructor.
     */
    public ReturnInstanceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ReturnInstanceDTO.
     *
     * @param stockType stockType
     * @param status status
     * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @param imei Международный идентификатор мобильного оборудования.
     */
    public ReturnInstanceDTO(
        ReturnInstanceStockType stockType, 
        ReturnInstanceStatusType status, 
        String cis, 
        String imei
    ) {
        this.stockType = stockType;
        this.status = status;
        this.cis = cis;
        this.imei = imei;
    }



    /**
     * Get stockType
     * @return stockType
     */
    public ReturnInstanceStockType getStockType() {
        return stockType;
    }

    public void setStockType(ReturnInstanceStockType stockType) {
        this.stockType = stockType;
    }

    /**
     * Get status
     * @return status
     */
    public ReturnInstanceStatusType getStatus() {
        return status;
    }

    public void setStatus(ReturnInstanceStatusType status) {
        this.status = status;
    }

    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @return cis
     */
    public String getCis() {
        return cis;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    /**
     * Международный идентификатор мобильного оборудования.
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnInstanceDTO {\n");
        
        sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
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


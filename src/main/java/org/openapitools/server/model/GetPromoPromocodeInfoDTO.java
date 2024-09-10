package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 */
public class GetPromoPromocodeInfoDTO   {

    private String promocode;
    private Integer discount;

    /**
     * Default constructor.
     */
    public GetPromoPromocodeInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoPromocodeInfoDTO.
     *
     * @param promocode Промокод.
     * @param discount Процент скидки по промокоду.
     */
    public GetPromoPromocodeInfoDTO(
        String promocode, 
        Integer discount
    ) {
        this.promocode = promocode;
        this.discount = discount;
    }



    /**
     * Промокод.
     * @return promocode
     */
    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    /**
     * Процент скидки по промокоду.
     * @return discount
     */
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoPromocodeInfoDTO {\n");
        
        sb.append("    promocode: ").append(toIndentedString(promocode)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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


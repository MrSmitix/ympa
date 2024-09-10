package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */
public class GoodsStatsWeightDimensionsDTO   {

    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal weight;

    /**
     * Default constructor.
     */
    public GoodsStatsWeightDimensionsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsStatsWeightDimensionsDTO.
     *
     * @param length Длина товара в сантиметрах.
     * @param width Ширина товара в сантиметрах.
     * @param height Высота товара в сантиметрах.
     * @param weight Вес товара в килограммах.
     */
    public GoodsStatsWeightDimensionsDTO(
        BigDecimal length, 
        BigDecimal width, 
        BigDecimal height, 
        BigDecimal weight
    ) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }



    /**
     * Длина товара в сантиметрах.
     * @return length
     */
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Ширина товара в сантиметрах.
     * @return width
     */
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Высота товара в сантиметрах.
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Вес товара в килограммах.
     * @return weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsStatsWeightDimensionsDTO {\n");
        
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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


package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */
public class OfferWeightDimensionsDTO   {

    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal weight;

    /**
     * Default constructor.
     */
    public OfferWeightDimensionsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferWeightDimensionsDTO.
     *
     * @param length Длина упаковки в см. 
     * @param width Ширина упаковки в см. 
     * @param height Высота упаковки в см. 
     * @param weight Вес товара в кг с учетом упаковки (брутто). 
     */
    public OfferWeightDimensionsDTO(
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
     * Длина упаковки в см. 
     * @return length
     */
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Ширина упаковки в см. 
     * @return width
     */
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Высота упаковки в см. 
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Вес товара в кг с учетом упаковки (брутто). 
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
        sb.append("class OfferWeightDimensionsDTO {\n");
        
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


package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о ценах на модель товара.
 */
public class ModelPriceDTO   {

    private BigDecimal avg;
    private BigDecimal max;
    private BigDecimal min;

    /**
     * Default constructor.
     */
    public ModelPriceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ModelPriceDTO.
     *
     * @param avg Средняя цена предложения для модели в регионе.
     * @param max Максимальная цена предложения для модели в регионе.
     * @param min Минимальная цена предложения для модели в регионе.
     */
    public ModelPriceDTO(
        BigDecimal avg, 
        BigDecimal max, 
        BigDecimal min
    ) {
        this.avg = avg;
        this.max = max;
        this.min = min;
    }



    /**
     * Средняя цена предложения для модели в регионе.
     * @return avg
     */
    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    /**
     * Максимальная цена предложения для модели в регионе.
     * @return max
     */
    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    /**
     * Минимальная цена предложения для модели в регионе.
     * @return min
     */
    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelPriceDTO {\n");
        
        sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
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


package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} 
 */
public class QuantumDTO   {

    private Integer minQuantity;
    private Integer stepQuantity;

    /**
     * Default constructor.
     */
    public QuantumDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QuantumDTO.
     *
     * @param minQuantity Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
     * @param stepQuantity На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
     */
    public QuantumDTO(
        Integer minQuantity, 
        Integer stepQuantity
    ) {
        this.minQuantity = minQuantity;
        this.stepQuantity = stepQuantity;
    }



    /**
     * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
     * minimum: 1
     * @return minQuantity
     */
    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    /**
     * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
     * minimum: 1
     * maximum: 100
     * @return stepQuantity
     */
    public Integer getStepQuantity() {
        return stepQuantity;
    }

    public void setStepQuantity(Integer stepQuantity) {
        this.stepQuantity = stepQuantity;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuantumDTO {\n");
        
        sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
        sb.append("    stepQuantity: ").append(toIndentedString(stepQuantity)).append("\n");
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


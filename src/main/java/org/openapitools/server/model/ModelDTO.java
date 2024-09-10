package org.openapitools.server.model;

import org.openapitools.server.model.ModelPriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Модель товара.
 */
public class ModelDTO   {

    private Long id;
    private String name;
    private ModelPriceDTO prices;

    /**
     * Default constructor.
     */
    public ModelDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ModelDTO.
     *
     * @param id Идентификатор модели товара.
     * @param name Название модели товара.
     * @param prices prices
     */
    public ModelDTO(
        Long id, 
        String name, 
        ModelPriceDTO prices
    ) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }



    /**
     * Идентификатор модели товара.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название модели товара.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get prices
     * @return prices
     */
    public ModelPriceDTO getPrices() {
        return prices;
    }

    public void setPrices(ModelPriceDTO prices) {
        this.prices = prices;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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


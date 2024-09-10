package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */
public class MaxSaleQuantumDTO   {

    private Long id;
    private String name;
    private Integer maxSaleQuantum;

    /**
     * Default constructor.
     */
    public MaxSaleQuantumDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create MaxSaleQuantumDTO.
     *
     * @param id Идентификатор категории.
     * @param name Название категории.
     * @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров.
     */
    public MaxSaleQuantumDTO(
        Long id, 
        String name, 
        Integer maxSaleQuantum
    ) {
        this.id = id;
        this.name = name;
        this.maxSaleQuantum = maxSaleQuantum;
    }



    /**
     * Идентификатор категории.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название категории.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Лимит на установку кванта и минимального количества товаров.
     * @return maxSaleQuantum
     */
    public Integer getMaxSaleQuantum() {
        return maxSaleQuantum;
    }

    public void setMaxSaleQuantum(Integer maxSaleQuantum) {
        this.maxSaleQuantum = maxSaleQuantum;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaxSaleQuantumDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    maxSaleQuantum: ").append(toIndentedString(maxSaleQuantum)).append("\n");
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


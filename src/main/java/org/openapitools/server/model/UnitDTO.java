package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Единица измерения.
 */
public class UnitDTO   {

    private Long id;
    private String name;
    private String fullName;

    /**
     * Default constructor.
     */
    public UnitDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UnitDTO.
     *
     * @param id Идентификатор единицы измерения.
     * @param name Сокращенное название единицы измерения.
     * @param fullName Полное название единицы измерения.
     */
    public UnitDTO(
        Long id, 
        String name, 
        String fullName
    ) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
    }



    /**
     * Идентификатор единицы измерения.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Сокращенное название единицы измерения.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Полное название единицы измерения.
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnitDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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


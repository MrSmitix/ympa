package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */
public class CategoryDTO   {

    private Long id;
    private String name;
    private List<@Valid CategoryDTO> children;

    /**
     * Default constructor.
     */
    public CategoryDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CategoryDTO.
     *
     * @param id Идентификатор категории.
     * @param name Название категории.
     * @param children Дочерние категории.
     */
    public CategoryDTO(
        Long id, 
        String name, 
        List<@Valid CategoryDTO> children
    ) {
        this.id = id;
        this.name = name;
        this.children = children;
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
     * Дочерние категории.
     * @return children
     */
    public List<@Valid CategoryDTO> getChildren() {
        return children;
    }

    public void setChildren(List<@Valid CategoryDTO> children) {
        this.children = children;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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


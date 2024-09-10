package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.RegionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Регион доставки.
 */
public class RegionDTO   {

    private Long id;
    private String name;
    private RegionType type;
    private RegionDTO parent;
    private List<@Valid RegionDTO> children;

    /**
     * Default constructor.
     */
    public RegionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create RegionDTO.
     *
     * @param id Идентификатор региона.
     * @param name Название региона.
     * @param type type
     * @param parent parent
     * @param children Дочерние регионы.
     */
    public RegionDTO(
        Long id, 
        String name, 
        RegionType type, 
        RegionDTO parent, 
        List<@Valid RegionDTO> children
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.parent = parent;
        this.children = children;
    }



    /**
     * Идентификатор региона.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название региона.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get type
     * @return type
     */
    public RegionType getType() {
        return type;
    }

    public void setType(RegionType type) {
        this.type = type;
    }

    /**
     * Get parent
     * @return parent
     */
    public RegionDTO getParent() {
        return parent;
    }

    public void setParent(RegionDTO parent) {
        this.parent = parent;
    }

    /**
     * Дочерние регионы.
     * @return children
     */
    public List<@Valid RegionDTO> getChildren() {
        return children;
    }

    public void setChildren(List<@Valid RegionDTO> children) {
        this.children = children;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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


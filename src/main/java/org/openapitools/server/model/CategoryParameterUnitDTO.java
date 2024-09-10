package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UnitDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Единицы измерения характеристики товара.
 */
public class CategoryParameterUnitDTO   {

    private Long defaultUnitId;
    private List<@Valid UnitDTO> units = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CategoryParameterUnitDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CategoryParameterUnitDTO.
     *
     * @param defaultUnitId Единица измерения по умолчанию.
     * @param units Допустимые единицы измерения.
     */
    public CategoryParameterUnitDTO(
        Long defaultUnitId, 
        List<@Valid UnitDTO> units
    ) {
        this.defaultUnitId = defaultUnitId;
        this.units = units;
    }



    /**
     * Единица измерения по умолчанию.
     * @return defaultUnitId
     */
    public Long getDefaultUnitId() {
        return defaultUnitId;
    }

    public void setDefaultUnitId(Long defaultUnitId) {
        this.defaultUnitId = defaultUnitId;
    }

    /**
     * Допустимые единицы измерения.
     * @return units
     */
    public List<@Valid UnitDTO> getUnits() {
        return units;
    }

    public void setUnits(List<@Valid UnitDTO> units) {
        this.units = units;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryParameterUnitDTO {\n");
        
        sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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


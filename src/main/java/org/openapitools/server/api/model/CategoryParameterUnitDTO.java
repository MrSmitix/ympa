package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.UnitDTO;

/**
 * Единицы измерения характеристики товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryParameterUnitDTO   {
  
  private Long defaultUnitId;
  private List<UnitDTO> units = new ArrayList<>();

  public CategoryParameterUnitDTO () {

  }

  public CategoryParameterUnitDTO (Long defaultUnitId, List<UnitDTO> units) {
    this.defaultUnitId = defaultUnitId;
    this.units = units;
  }

    
  @JsonProperty("defaultUnitId")
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

    
  @JsonProperty("units")
  public List<UnitDTO> getUnits() {
    return units;
  }
  public void setUnits(List<UnitDTO> units) {
    this.units = units;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryParameterUnitDTO categoryParameterUnitDTO = (CategoryParameterUnitDTO) o;
    return Objects.equals(defaultUnitId, categoryParameterUnitDTO.defaultUnitId) &&
        Objects.equals(units, categoryParameterUnitDTO.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnitId, units);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

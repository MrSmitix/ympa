package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Единицы измерения характеристики товара.
 **/
@ApiModel(description="Единицы измерения характеристики товара.")

public class CategoryParameterUnitDTO  {
  
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
 /**
   * Единица измерения по умолчанию.
  **/
  private Long defaultUnitId;

  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
 /**
   * Допустимые единицы измерения.
  **/
  private List<UnitDTO> units = new ArrayList<>();
 /**
   * Единица измерения по умолчанию.
   * @return defaultUnitId
  **/
  @JsonProperty("defaultUnitId")
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }

  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

 /**
   * Допустимые единицы измерения.
   * @return units
  **/
  @JsonProperty("units")
  public List<UnitDTO> getUnits() {
    return units;
  }

  public void setUnits(List<UnitDTO> units) {
    this.units = units;
  }

  public CategoryParameterUnitDTO units(List<UnitDTO> units) {
    this.units = units;
    return this;
  }

  public CategoryParameterUnitDTO addUnitsItem(UnitDTO unitsItem) {
    this.units.add(unitsItem);
    return this;
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
    return Objects.equals(this.defaultUnitId, categoryParameterUnitDTO.defaultUnitId) &&
        Objects.equals(this.units, categoryParameterUnitDTO.units);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


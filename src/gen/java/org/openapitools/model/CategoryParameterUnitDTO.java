package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Единицы измерения характеристики товара.
 */
@ApiModel(description="Единицы измерения характеристики товара.")

public class CategoryParameterUnitDTO  {
  
 /**
  * Единица измерения по умолчанию.
  */
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
  private Long defaultUnitId;

 /**
  * Допустимые единицы измерения.
  */
  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
  @Valid
  private List<@Valid UnitDTO> units = new ArrayList<>();
 /**
  * Единица измерения по умолчанию.
  * @return defaultUnitId
  */
  @JsonProperty("defaultUnitId")
  @NotNull
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }

  /**
   * Sets the <code>defaultUnitId</code> property.
   */
 public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  /**
   * Sets the <code>defaultUnitId</code> property.
   */
  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

 /**
  * Допустимые единицы измерения.
  * @return units
  */
  @JsonProperty("units")
  @NotNull
  public List<@Valid UnitDTO> getUnits() {
    return units;
  }

  /**
   * Sets the <code>units</code> property.
   */
 public void setUnits(List<@Valid UnitDTO> units) {
    this.units = units;
  }

  /**
   * Sets the <code>units</code> property.
   */
  public CategoryParameterUnitDTO units(List<@Valid UnitDTO> units) {
    this.units = units;
    return this;
  }

  /**
   * Adds a new item to the <code>units</code> list.
   */
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


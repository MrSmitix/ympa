package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UnitDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Единицы измерения характеристики товара.
 */
@ApiModel(description = "Единицы измерения характеристики товара.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterUnitDTO   {
  @JsonProperty("defaultUnitId")
  private Long defaultUnitId;

  @JsonProperty("units")
  
  private List<UnitDTO> units = new ArrayList<>();

  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

  /**
   * Единица измерения по умолчанию.
   * @return defaultUnitId
   */
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }

  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  public CategoryParameterUnitDTO units(List<UnitDTO> units) {
    this.units = units;
    return this;
  }

  public CategoryParameterUnitDTO addUnitsItem(UnitDTO unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

  /**
   * Допустимые единицы измерения.
   * @return units
   */
  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


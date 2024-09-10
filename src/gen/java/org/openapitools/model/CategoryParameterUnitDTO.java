package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Единицы измерения характеристики товара.
 **/
@ApiModel(description = "Единицы измерения характеристики товара.")
@JsonTypeName("CategoryParameterUnitDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterUnitDTO   {
  private Long defaultUnitId;
  private @Valid List<@Valid UnitDTO> units = new ArrayList<>();

  /**
   * Единица измерения по умолчанию.
   **/
  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
  @JsonProperty("defaultUnitId")
  @NotNull public Long getDefaultUnitId() {
    return defaultUnitId;
  }

  @JsonProperty("defaultUnitId")
  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  /**
   * Допустимые единицы измерения.
   **/
  public CategoryParameterUnitDTO units(List<@Valid UnitDTO> units) {
    this.units = units;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
  @JsonProperty("units")
  @NotNull @Valid public List<@Valid UnitDTO> getUnits() {
    return units;
  }

  @JsonProperty("units")
  public void setUnits(List<@Valid UnitDTO> units) {
    this.units = units;
  }

  public CategoryParameterUnitDTO addUnitsItem(UnitDTO unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<>();
    }

    this.units.add(unitsItem);
    return this;
  }

  public CategoryParameterUnitDTO removeUnitsItem(UnitDTO unitsItem) {
    if (unitsItem != null && this.units != null) {
      this.units.remove(unitsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


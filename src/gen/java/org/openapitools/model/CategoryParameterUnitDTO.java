package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;



/**
 * Единицы измерения характеристики товара.
 **/

@ApiModel(description = "Единицы измерения характеристики товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterUnitDTO   {
  @JsonProperty("defaultUnitId")
  private Long defaultUnitId;

  @JsonProperty("units")
  private List<UnitDTO> units = new ArrayList<>();

  /**
   * Единица измерения по умолчанию.
   **/
  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
  @JsonProperty("defaultUnitId")
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  /**
   * Допустимые единицы измерения.
   **/
  public CategoryParameterUnitDTO units(List<UnitDTO> units) {
    this.units = units;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
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


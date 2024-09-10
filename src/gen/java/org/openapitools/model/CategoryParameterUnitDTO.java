package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Единицы измерения характеристики товара.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterUnitDTO   {
  
  private Long defaultUnitId;
  private List<@Valid UnitDTO> units = new ArrayList<>();

  /**
   * Единица измерения по умолчанию.
   **/
  
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
  @JsonProperty("defaultUnitId")
  @NotNull
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  /**
   * Допустимые единицы измерения.
   **/
  
  @ApiModelProperty(required = true, value = "Допустимые единицы измерения.")
  @JsonProperty("units")
  @NotNull
  @Valid
  public List<@Valid UnitDTO> getUnits() {
    return units;
  }
  public void setUnits(List<@Valid UnitDTO> units) {
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


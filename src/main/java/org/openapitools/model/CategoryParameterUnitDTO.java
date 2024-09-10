package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UnitDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Единицы измерения характеристики товара.
 */

@Schema(name = "CategoryParameterUnitDTO", description = "Единицы измерения характеристики товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterUnitDTO {

  private Long defaultUnitId;

  @Valid
  private List<@Valid UnitDTO> units = new ArrayList<>();

  public CategoryParameterUnitDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryParameterUnitDTO(Long defaultUnitId, List<@Valid UnitDTO> units) {
    this.defaultUnitId = defaultUnitId;
    this.units = units;
  }

  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

  /**
   * Единица измерения по умолчанию.
   * @return defaultUnitId
   */
  @NotNull 
  @Schema(name = "defaultUnitId", description = "Единица измерения по умолчанию.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("defaultUnitId")
  public Long getDefaultUnitId() {
    return defaultUnitId;
  }

  public void setDefaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  public CategoryParameterUnitDTO units(List<@Valid UnitDTO> units) {
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
  @NotNull @Valid 
  @Schema(name = "units", description = "Допустимые единицы измерения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("units")
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


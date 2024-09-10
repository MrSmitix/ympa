package apimodels;

import apimodels.UnitDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Единицы измерения характеристики товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CategoryParameterUnitDTO   {
  @JsonProperty("defaultUnitId")
  @NotNull

  private Long defaultUnitId;

  @JsonProperty("units")
  @NotNull
@Valid

  private List<@Valid UnitDTO> units = new ArrayList<>();

  public CategoryParameterUnitDTO defaultUnitId(Long defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

   /**
   * Единица измерения по умолчанию.
   * @return defaultUnitId
  **/
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
  **/
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
    return Objects.equals(defaultUnitId, categoryParameterUnitDTO.defaultUnitId) &&
        Objects.equals(units, categoryParameterUnitDTO.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnitId, units);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


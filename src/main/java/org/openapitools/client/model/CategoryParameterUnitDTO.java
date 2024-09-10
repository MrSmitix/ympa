/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.UnitDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Единицы измерения характеристики товара.
 **/
@ApiModel(description = "Единицы измерения характеристики товара.")
public class CategoryParameterUnitDTO {
  
  @SerializedName("defaultUnitId")
  private Long defaultUnitId = null;
  @SerializedName("units")
  private List<UnitDTO> units = null;

  /**
   * Единица измерения по умолчанию.
   **/
  @ApiModelProperty(required = true, value = "Единица измерения по умолчанию.")
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
    return (this.defaultUnitId == null ? categoryParameterUnitDTO.defaultUnitId == null : this.defaultUnitId.equals(categoryParameterUnitDTO.defaultUnitId)) &&
        (this.units == null ? categoryParameterUnitDTO.units == null : this.units.equals(categoryParameterUnitDTO.units));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.defaultUnitId == null ? 0: this.defaultUnitId.hashCode());
    result = 31 * result + (this.units == null ? 0: this.units.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryParameterUnitDTO {\n");
    
    sb.append("  defaultUnitId: ").append(defaultUnitId).append("\n");
    sb.append("  units: ").append(units).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;



/**
 * Информация о складах и группах складов.
 */

@ApiModel(description = "Информация о складах и группах складов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehousesDTO   {
  
  private List<WarehouseDTO> warehouses = new ArrayList<>();
  private List<WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  /**
   * Список складов, не входящих в группы.
   */
  public WarehousesDTO warehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов, не входящих в группы.")
  @JsonProperty("warehouses")
  public List<WarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Список групп складов.
   */
  public WarehousesDTO warehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список групп складов.")
  @JsonProperty("warehouseGroups")
  public List<WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }
  public void setWarehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehousesDTO warehousesDTO = (WarehousesDTO) o;
    return Objects.equals(warehouses, warehousesDTO.warehouses) &&
        Objects.equals(warehouseGroups, warehousesDTO.warehouseGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses, warehouseGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehousesDTO {\n");
    
    sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
    sb.append("    warehouseGroups: ").append(toIndentedString(warehouseGroups)).append("\n");
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


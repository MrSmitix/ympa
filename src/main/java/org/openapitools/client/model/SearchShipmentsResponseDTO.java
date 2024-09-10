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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ForwardScrollingPagerDTO;
import org.openapitools.client.model.ShipmentInfoDTO;



/**
  * Информация об отгрузках.
 **/

public class SearchShipmentsResponseDTO  {
  
 /**
   * Список с информацией об отгрузках.
  **/
  private List<ShipmentInfoDTO> shipments = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

 /**
   * Список с информацией об отгрузках.
   * @return shipments
  **/
  public List<ShipmentInfoDTO> getShipments() {
    return shipments;
  }

  /**
    * Set shipments
  **/
  public void setShipments(List<ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
  }

  public SearchShipmentsResponseDTO shipments(List<ShipmentInfoDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  public SearchShipmentsResponseDTO addShipmentsItem(ShipmentInfoDTO shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
    * Set paging
  **/
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public SearchShipmentsResponseDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShipmentsResponseDTO {\n");
    
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


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
import org.openapitools.model.OrderBoxLayoutItemDTO;



/**
 * Информация о коробке.
 */

@ApiModel(description = "Информация о коробке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedOrderBoxLayoutDTO   {
  
  private List<OrderBoxLayoutItemDTO> items = new ArrayList<>();
  private Long boxId;

  /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   */
  public EnrichedOrderBoxLayoutDTO items(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
  @JsonProperty("items")
  public List<OrderBoxLayoutItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  /**
   * Идентификатор коробки.
   */
  public EnrichedOrderBoxLayoutDTO boxId(Long boxId) {
    this.boxId = boxId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор коробки.")
  @JsonProperty("boxId")
  public Long getBoxId() {
    return boxId;
  }
  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO = (EnrichedOrderBoxLayoutDTO) o;
    return Objects.equals(items, enrichedOrderBoxLayoutDTO.items) &&
        Objects.equals(boxId, enrichedOrderBoxLayoutDTO.boxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, boxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedOrderBoxLayoutDTO {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
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


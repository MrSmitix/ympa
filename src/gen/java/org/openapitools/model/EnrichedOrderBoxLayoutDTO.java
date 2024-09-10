package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о коробке.
 **/
@ApiModel(description="Информация о коробке.")

public class EnrichedOrderBoxLayoutDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
  @Valid
 /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  **/
  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "Идентификатор коробки.")
 /**
   * Идентификатор коробки.
  **/
  private Long boxId;
 /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
 @Size(min=1)  public List<@Valid OrderBoxLayoutItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  public EnrichedOrderBoxLayoutDTO items(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  public EnrichedOrderBoxLayoutDTO addItemsItem(OrderBoxLayoutItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Идентификатор коробки.
   * @return boxId
  **/
  @JsonProperty("boxId")
  public Long getBoxId() {
    return boxId;
  }

  public void setBoxId(Long boxId) {
    this.boxId = boxId;
  }

  public EnrichedOrderBoxLayoutDTO boxId(Long boxId) {
    this.boxId = boxId;
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
    EnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO = (EnrichedOrderBoxLayoutDTO) o;
    return Objects.equals(this.items, enrichedOrderBoxLayoutDTO.items) &&
        Objects.equals(this.boxId, enrichedOrderBoxLayoutDTO.boxId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package apimodels;

import apimodels.OrderBoxLayoutItemDTO;
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
 * Информация о коробке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnrichedOrderBoxLayoutDTO   {
  @JsonProperty("items")
  @NotNull
@Size(min=1)
@Valid

  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

  @JsonProperty("boxId")
  
  private Long boxId;

  public EnrichedOrderBoxLayoutDTO items(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  public EnrichedOrderBoxLayoutDTO addItemsItem(OrderBoxLayoutItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   * @return items
  **/
  public List<@Valid OrderBoxLayoutItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  public EnrichedOrderBoxLayoutDTO boxId(Long boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * Идентификатор коробки.
   * @return boxId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


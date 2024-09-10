package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.OrderBoxLayoutItemDTO;

/**
 * Информация о коробке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnrichedOrderBoxLayoutDTO   {
  
  private List<OrderBoxLayoutItemDTO> items = new ArrayList<>();
  private Long boxId;

  public EnrichedOrderBoxLayoutDTO () {

  }

  public EnrichedOrderBoxLayoutDTO (List<OrderBoxLayoutItemDTO> items, Long boxId) {
    this.items = items;
    this.boxId = boxId;
  }

    
  @JsonProperty("items")
  public List<OrderBoxLayoutItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

    
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

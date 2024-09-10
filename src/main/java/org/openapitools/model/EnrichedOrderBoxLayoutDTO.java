package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о коробке.
 */

@Schema(name = "EnrichedOrderBoxLayoutDTO", description = "Информация о коробке.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedOrderBoxLayoutDTO {

  @Valid
  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

  private Long boxId;

  public EnrichedOrderBoxLayoutDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnrichedOrderBoxLayoutDTO(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

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
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "items", description = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
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
   */
  
  @Schema(name = "boxId", description = "Идентификатор коробки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


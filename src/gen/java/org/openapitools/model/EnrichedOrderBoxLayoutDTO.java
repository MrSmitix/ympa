package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о коробке.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EnrichedOrderBoxLayoutDTO   {
  
  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();
  private Long boxId;

  /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   **/
  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
  @JsonProperty("items")
  @NotNull
 @Size(min=1)  @Valid
  public List<@Valid OrderBoxLayoutItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  /**
   * Идентификатор коробки.
   **/
  
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

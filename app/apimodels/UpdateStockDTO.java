package apimodels;

import apimodels.UpdateStockItemDTO;
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
 * Информация об остатках одного товара на одном из складов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateStockDTO   {
  @JsonProperty("sku")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String sku;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=1)
@Valid

  private List<@Valid UpdateStockItemDTO> items = new ArrayList<>();

  public UpdateStockDTO sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return sku
  **/
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public UpdateStockDTO items(List<@Valid UpdateStockItemDTO> items) {
    this.items = items;
    return this;
  }

  public UpdateStockDTO addItemsItem(UpdateStockItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Информация об остатках товара. 
   * @return items
  **/
  public List<@Valid UpdateStockItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid UpdateStockItemDTO> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStockDTO updateStockDTO = (UpdateStockDTO) o;
    return Objects.equals(sku, updateStockDTO.sku) &&
        Objects.equals(items, updateStockDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStockDTO {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


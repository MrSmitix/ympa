package apimodels;

import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фильтры для запроса остатков. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetWarehouseStocksRequest   {
  @JsonProperty("withTurnover")
  
  private Boolean withTurnover = false;

  @JsonProperty("archived")
  
  private Boolean archived;

  @JsonProperty("offerIds")
  @Size(max=500)

  private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  public GetWarehouseStocksRequest withTurnover(Boolean withTurnover) {
    this.withTurnover = withTurnover;
    return this;
  }

   /**
   * **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
   * @return withTurnover
  **/
  public Boolean getWithTurnover() {
    return withTurnover;
  }

  public void setWithTurnover(Boolean withTurnover) {
    this.withTurnover = withTurnover;
  }

  public GetWarehouseStocksRequest archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
   * @return archived
  **/
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public GetWarehouseStocksRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetWarehouseStocksRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new LinkedHashSet<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
   * @return offerIds
  **/
  public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarehouseStocksRequest getWarehouseStocksRequest = (GetWarehouseStocksRequest) o;
    return Objects.equals(withTurnover, getWarehouseStocksRequest.withTurnover) &&
        Objects.equals(archived, getWarehouseStocksRequest.archived) &&
        Objects.equals(offerIds, getWarehouseStocksRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withTurnover, archived, offerIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarehouseStocksRequest {\n");
    
    sb.append("    withTurnover: ").append(toIndentedString(withTurnover)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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


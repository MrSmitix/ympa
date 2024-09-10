package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Фильтры для запроса остатков. 
 */

@Schema(name = "GetWarehouseStocksRequest", description = "Фильтры для запроса остатков. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetWarehouseStocksRequest {

  private Boolean withTurnover = false;

  private Boolean archived;

  @Valid
  private JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds = JsonNullable.<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>>undefined();

  public GetWarehouseStocksRequest withTurnover(Boolean withTurnover) {
    this.withTurnover = withTurnover;
    return this;
  }

  /**
   * **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
   * @return withTurnover
   */
  
  @Schema(name = "withTurnover", description = "**Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withTurnover")
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
   */
  
  @Schema(name = "archived", description = "Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public GetWarehouseStocksRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = JsonNullable.of(offerIds);
    return this;
  }

  public GetWarehouseStocksRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null || !this.offerIds.isPresent()) {
      this.offerIds = JsonNullable.of(new LinkedHashSet<>());
    }
    this.offerIds.get().add(offerIdsItem);
    return this;
  }

  /**
   * Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
   * @return offerIds
   */
  @Size(max = 500) 
  @Schema(name = "offerIds", description = "Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerIds")
  public JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds) {
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
    return Objects.equals(this.withTurnover, getWarehouseStocksRequest.withTurnover) &&
        Objects.equals(this.archived, getWarehouseStocksRequest.archived) &&
        equalsNullable(this.offerIds, getWarehouseStocksRequest.offerIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(withTurnover, archived, hashCodeNullable(offerIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionDTO;
import org.openapitools.model.ReturnInstanceDTO;
import org.openapitools.model.TrackDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров в возврате.
 */

@Schema(name = "ReturnItemDTO", description = "Список товаров в возврате.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnItemDTO {

  private Long marketSku;

  private String shopSku;

  private Long count;

  @Valid
  private JsonNullable<List<@Valid ReturnDecisionDTO>> decisions = JsonNullable.<List<@Valid ReturnDecisionDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid ReturnInstanceDTO>> instances = JsonNullable.<List<@Valid ReturnInstanceDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid TrackDTO>> tracks = JsonNullable.<List<@Valid TrackDTO>>undefined();

  public ReturnItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReturnItemDTO(String shopSku, Long count) {
    this.shopSku = shopSku;
    this.count = count;
  }

  public ReturnItemDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   */
  
  @Schema(name = "marketSku", description = "SKU на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public ReturnItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public ReturnItemDTO count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Количество единиц товара.
   * @return count
   */
  @NotNull 
  @Schema(name = "count", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ReturnItemDTO decisions(List<@Valid ReturnDecisionDTO> decisions) {
    this.decisions = JsonNullable.of(decisions);
    return this;
  }

  public ReturnItemDTO addDecisionsItem(ReturnDecisionDTO decisionsItem) {
    if (this.decisions == null || !this.decisions.isPresent()) {
      this.decisions = JsonNullable.of(new ArrayList<>());
    }
    this.decisions.get().add(decisionsItem);
    return this;
  }

  /**
   * Список решений по возврату.
   * @return decisions
   */
  @Valid 
  @Schema(name = "decisions", description = "Список решений по возврату.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisions")
  public JsonNullable<List<@Valid ReturnDecisionDTO>> getDecisions() {
    return decisions;
  }

  public void setDecisions(JsonNullable<List<@Valid ReturnDecisionDTO>> decisions) {
    this.decisions = decisions;
  }

  public ReturnItemDTO instances(List<@Valid ReturnInstanceDTO> instances) {
    this.instances = JsonNullable.of(instances);
    return this;
  }

  public ReturnItemDTO addInstancesItem(ReturnInstanceDTO instancesItem) {
    if (this.instances == null || !this.instances.isPresent()) {
      this.instances = JsonNullable.of(new ArrayList<>());
    }
    this.instances.get().add(instancesItem);
    return this;
  }

  /**
   * Список логистических позиций возврата.
   * @return instances
   */
  @Valid 
  @Schema(name = "instances", description = "Список логистических позиций возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public JsonNullable<List<@Valid ReturnInstanceDTO>> getInstances() {
    return instances;
  }

  public void setInstances(JsonNullable<List<@Valid ReturnInstanceDTO>> instances) {
    this.instances = instances;
  }

  public ReturnItemDTO tracks(List<@Valid TrackDTO> tracks) {
    this.tracks = JsonNullable.of(tracks);
    return this;
  }

  public ReturnItemDTO addTracksItem(TrackDTO tracksItem) {
    if (this.tracks == null || !this.tracks.isPresent()) {
      this.tracks = JsonNullable.of(new ArrayList<>());
    }
    this.tracks.get().add(tracksItem);
    return this;
  }

  /**
   * Список трек-кодов для почтовых отправлений.
   * @return tracks
   */
  @Valid 
  @Schema(name = "tracks", description = "Список трек-кодов для почтовых отправлений.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracks")
  public JsonNullable<List<@Valid TrackDTO>> getTracks() {
    return tracks;
  }

  public void setTracks(JsonNullable<List<@Valid TrackDTO>> tracks) {
    this.tracks = tracks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnItemDTO returnItemDTO = (ReturnItemDTO) o;
    return Objects.equals(this.marketSku, returnItemDTO.marketSku) &&
        Objects.equals(this.shopSku, returnItemDTO.shopSku) &&
        Objects.equals(this.count, returnItemDTO.count) &&
        equalsNullable(this.decisions, returnItemDTO.decisions) &&
        equalsNullable(this.instances, returnItemDTO.instances) &&
        equalsNullable(this.tracks, returnItemDTO.tracks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, shopSku, count, hashCodeNullable(decisions), hashCodeNullable(instances), hashCodeNullable(tracks));
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
    sb.append("class ReturnItemDTO {\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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


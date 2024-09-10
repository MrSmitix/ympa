/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionDTO;
import org.openapitools.model.ReturnInstanceDTO;
import org.openapitools.model.TrackDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Список товаров в возврате.
 */
@Schema(name = "ReturnItemDTO", description = "Список товаров в возврате.")
@JsonPropertyOrder({
  ReturnItemDTO.JSON_PROPERTY_MARKET_SKU,
  ReturnItemDTO.JSON_PROPERTY_SHOP_SKU,
  ReturnItemDTO.JSON_PROPERTY_COUNT,
  ReturnItemDTO.JSON_PROPERTY_DECISIONS,
  ReturnItemDTO.JSON_PROPERTY_INSTANCES,
  ReturnItemDTO.JSON_PROPERTY_TRACKS
})
@JsonTypeName("ReturnItemDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class ReturnItemDTO {
    public static final String JSON_PROPERTY_MARKET_SKU = "marketSku";
    private Long marketSku;

    public static final String JSON_PROPERTY_SHOP_SKU = "shopSku";
    private String shopSku;

    public static final String JSON_PROPERTY_COUNT = "count";
    private Long count;

    public static final String JSON_PROPERTY_DECISIONS = "decisions";
    private List<@Valid ReturnDecisionDTO> decisions = null;

    public static final String JSON_PROPERTY_INSTANCES = "instances";
    private List<@Valid ReturnInstanceDTO> instances = null;

    public static final String JSON_PROPERTY_TRACKS = "tracks";
    private List<@Valid TrackDTO> tracks = null;

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
    @Nullable
    @Schema(name = "marketSku", description = "SKU на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MARKET_SKU)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getMarketSku() {
        return marketSku;
    }

    @JsonProperty(JSON_PROPERTY_MARKET_SKU)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @NotNull
    @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @Size(min=1, max=255)
    @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHOP_SKU)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getShopSku() {
        return shopSku;
    }

    @JsonProperty(JSON_PROPERTY_SHOP_SKU)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getCount() {
        return count;
    }

    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCount(Long count) {
        this.count = count;
    }

    public ReturnItemDTO decisions(List<@Valid ReturnDecisionDTO> decisions) {
        this.decisions = decisions;
        return this;
    }

    public ReturnItemDTO addDecisionsItem(ReturnDecisionDTO decisionsItem) {
        if (this.decisions == null) {
            this.decisions = new ArrayList<>();
        }
        this.decisions.add(decisionsItem);
        return this;
    }

    /**
     * Список решений по возврату.
     * @return decisions
     */
    @Nullable
    @Schema(name = "decisions", description = "Список решений по возврату.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DECISIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid ReturnDecisionDTO> getDecisions() {
        return decisions;
    }

    @JsonProperty(JSON_PROPERTY_DECISIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDecisions(List<@Valid ReturnDecisionDTO> decisions) {
        this.decisions = decisions;
    }

    public ReturnItemDTO instances(List<@Valid ReturnInstanceDTO> instances) {
        this.instances = instances;
        return this;
    }

    public ReturnItemDTO addInstancesItem(ReturnInstanceDTO instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Список логистических позиций возврата.
     * @return instances
     */
    @Nullable
    @Schema(name = "instances", description = "Список логистических позиций возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid ReturnInstanceDTO> getInstances() {
        return instances;
    }

    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstances(List<@Valid ReturnInstanceDTO> instances) {
        this.instances = instances;
    }

    public ReturnItemDTO tracks(List<@Valid TrackDTO> tracks) {
        this.tracks = tracks;
        return this;
    }

    public ReturnItemDTO addTracksItem(TrackDTO tracksItem) {
        if (this.tracks == null) {
            this.tracks = new ArrayList<>();
        }
        this.tracks.add(tracksItem);
        return this;
    }

    /**
     * Список трек-кодов для почтовых отправлений.
     * @return tracks
     */
    @Nullable
    @Schema(name = "tracks", description = "Список трек-кодов для почтовых отправлений.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TRACKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid TrackDTO> getTracks() {
        return tracks;
    }

    @JsonProperty(JSON_PROPERTY_TRACKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTracks(List<@Valid TrackDTO> tracks) {
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
            Objects.equals(this.decisions, returnItemDTO.decisions) &&
            Objects.equals(this.instances, returnItemDTO.instances) &&
            Objects.equals(this.tracks, returnItemDTO.tracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketSku, shopSku, count, decisions, instances, tracks);
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


package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ReturnDecisionDTO;
import org.openapitools.server.model.ReturnInstanceDTO;
import org.openapitools.server.model.TrackDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров в возврате.
 */
public class ReturnItemDTO   {

    private Long marketSku;
    private String shopSku;
    private Long count;
    private List<@Valid ReturnDecisionDTO> decisions;
    private List<@Valid ReturnInstanceDTO> instances;
    private List<@Valid TrackDTO> tracks;

    /**
     * Default constructor.
     */
    public ReturnItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ReturnItemDTO.
     *
     * @param marketSku SKU на Маркете.
     * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param count Количество единиц товара.
     * @param decisions Список решений по возврату.
     * @param instances Список логистических позиций возврата.
     * @param tracks Список трек-кодов для почтовых отправлений.
     */
    public ReturnItemDTO(
        Long marketSku, 
        String shopSku, 
        Long count, 
        List<@Valid ReturnDecisionDTO> decisions, 
        List<@Valid ReturnInstanceDTO> instances, 
        List<@Valid TrackDTO> tracks
    ) {
        this.marketSku = marketSku;
        this.shopSku = shopSku;
        this.count = count;
        this.decisions = decisions;
        this.instances = instances;
        this.tracks = tracks;
    }



    /**
     * SKU на Маркете.
     * @return marketSku
     */
    public Long getMarketSku() {
        return marketSku;
    }

    public void setMarketSku(Long marketSku) {
        this.marketSku = marketSku;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return shopSku
     */
    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    /**
     * Количество единиц товара.
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * Список решений по возврату.
     * @return decisions
     */
    public List<@Valid ReturnDecisionDTO> getDecisions() {
        return decisions;
    }

    public void setDecisions(List<@Valid ReturnDecisionDTO> decisions) {
        this.decisions = decisions;
    }

    /**
     * Список логистических позиций возврата.
     * @return instances
     */
    public List<@Valid ReturnInstanceDTO> getInstances() {
        return instances;
    }

    public void setInstances(List<@Valid ReturnInstanceDTO> instances) {
        this.instances = instances;
    }

    /**
     * Список трек-кодов для почтовых отправлений.
     * @return tracks
     */
    public List<@Valid TrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<@Valid TrackDTO> tracks) {
        this.tracks = tracks;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


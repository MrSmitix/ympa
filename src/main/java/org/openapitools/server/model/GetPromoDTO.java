package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ChannelType;
import org.openapitools.server.model.GetPromoAssortmentInfoDTO;
import org.openapitools.server.model.GetPromoBestsellerInfoDTO;
import org.openapitools.server.model.GetPromoConstraintsDTO;
import org.openapitools.server.model.GetPromoMechanicsInfoDTO;
import org.openapitools.server.model.PromoPeriodDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об акции.
 */
public class GetPromoDTO   {

    private String id;
    private String name;
    private PromoPeriodDTO period;
    private Boolean participating;
    private GetPromoAssortmentInfoDTO assortmentInfo;
    private GetPromoMechanicsInfoDTO mechanicsInfo;
    private GetPromoBestsellerInfoDTO bestsellerInfo;
    private List<@Valid ChannelType> channels;
    private GetPromoConstraintsDTO constraints;

    /**
     * Default constructor.
     */
    public GetPromoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoDTO.
     *
     * @param id Идентификатор акции.
     * @param name Название акции.
     * @param period period
     * @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
     * @param assortmentInfo assortmentInfo
     * @param mechanicsInfo mechanicsInfo
     * @param bestsellerInfo bestsellerInfo
     * @param channels Список каналов продвижения товаров.
     * @param constraints constraints
     */
    public GetPromoDTO(
        String id, 
        String name, 
        PromoPeriodDTO period, 
        Boolean participating, 
        GetPromoAssortmentInfoDTO assortmentInfo, 
        GetPromoMechanicsInfoDTO mechanicsInfo, 
        GetPromoBestsellerInfoDTO bestsellerInfo, 
        List<@Valid ChannelType> channels, 
        GetPromoConstraintsDTO constraints
    ) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.participating = participating;
        this.assortmentInfo = assortmentInfo;
        this.mechanicsInfo = mechanicsInfo;
        this.bestsellerInfo = bestsellerInfo;
        this.channels = channels;
        this.constraints = constraints;
    }



    /**
     * Идентификатор акции.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Название акции.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get period
     * @return period
     */
    public PromoPeriodDTO getPeriod() {
        return period;
    }

    public void setPeriod(PromoPeriodDTO period) {
        this.period = period;
    }

    /**
     * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
     * @return participating
     */
    public Boolean getParticipating() {
        return participating;
    }

    public void setParticipating(Boolean participating) {
        this.participating = participating;
    }

    /**
     * Get assortmentInfo
     * @return assortmentInfo
     */
    public GetPromoAssortmentInfoDTO getAssortmentInfo() {
        return assortmentInfo;
    }

    public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
        this.assortmentInfo = assortmentInfo;
    }

    /**
     * Get mechanicsInfo
     * @return mechanicsInfo
     */
    public GetPromoMechanicsInfoDTO getMechanicsInfo() {
        return mechanicsInfo;
    }

    public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
        this.mechanicsInfo = mechanicsInfo;
    }

    /**
     * Get bestsellerInfo
     * @return bestsellerInfo
     */
    public GetPromoBestsellerInfoDTO getBestsellerInfo() {
        return bestsellerInfo;
    }

    public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
        this.bestsellerInfo = bestsellerInfo;
    }

    /**
     * Список каналов продвижения товаров.
     * @return channels
     */
    public List<@Valid ChannelType> getChannels() {
        return channels;
    }

    public void setChannels(List<@Valid ChannelType> channels) {
        this.channels = channels;
    }

    /**
     * Get constraints
     * @return constraints
     */
    public GetPromoConstraintsDTO getConstraints() {
        return constraints;
    }

    public void setConstraints(GetPromoConstraintsDTO constraints) {
        this.constraints = constraints;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    participating: ").append(toIndentedString(participating)).append("\n");
        sb.append("    assortmentInfo: ").append(toIndentedString(assortmentInfo)).append("\n");
        sb.append("    mechanicsInfo: ").append(toIndentedString(mechanicsInfo)).append("\n");
        sb.append("    bestsellerInfo: ").append(toIndentedString(bestsellerInfo)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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


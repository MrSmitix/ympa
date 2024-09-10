package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
@ApiModel(description="Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")

public class PromoOfferAutoParticipatingDetailsDTO  {
  
 /**
  * Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
  */
  @ApiModelProperty(value = "Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. ")
  private List<Long> campaignIds;
 /**
  * Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;. 
  * @return campaignIds
  */
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public PromoOfferAutoParticipatingDetailsDTO campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
  public PromoOfferAutoParticipatingDetailsDTO addCampaignIdsItem(Long campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferAutoParticipatingDetailsDTO promoOfferAutoParticipatingDetailsDTO = (PromoOfferAutoParticipatingDetailsDTO) o;
    return Objects.equals(this.campaignIds, promoOfferAutoParticipatingDetailsDTO.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferAutoParticipatingDetailsDTO {\n");
    
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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


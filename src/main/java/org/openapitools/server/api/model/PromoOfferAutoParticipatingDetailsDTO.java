package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOfferAutoParticipatingDetailsDTO   {
  
  private List<Long> campaignIds;

  public PromoOfferAutoParticipatingDetailsDTO () {

  }

  public PromoOfferAutoParticipatingDetailsDTO (List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
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
    return Objects.equals(campaignIds, promoOfferAutoParticipatingDetailsDTO.campaignIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

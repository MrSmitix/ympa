package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

@Schema(name = "PromoOfferAutoParticipatingDetailsDTO", description = "Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferAutoParticipatingDetailsDTO {

  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.<List<Long>>undefined();

  public PromoOfferAutoParticipatingDetailsDTO campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public PromoOfferAutoParticipatingDetailsDTO addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
   * @return campaignIds
   */
  
  @Schema(name = "campaignIds", description = "Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaignIds")
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
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
    return equalsNullable(this.campaignIds, promoOfferAutoParticipatingDetailsDTO.campaignIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(campaignIds));
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


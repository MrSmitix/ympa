package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.CurrencyType;

/**
 * Предложение.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferDTO   {
  
  private BigDecimal price;
  private Long feedId;
  private String id;
  private String shopCategoryId;
  private Integer marketCategoryId;
  private BigDecimal preDiscountPrice;
  private Integer discount;
  private Boolean cutPrice;
  private String url;
  private Long modelId;
  private String name;
  private CurrencyType currency;
  private BigDecimal bid;
  private BigDecimal cbid;
  private BigDecimal fee;
  private Boolean blocked;

  public OfferDTO () {

  }

  public OfferDTO (BigDecimal price, Long feedId, String id, String shopCategoryId, Integer marketCategoryId, BigDecimal preDiscountPrice, Integer discount, Boolean cutPrice, String url, Long modelId, String name, CurrencyType currency, BigDecimal bid, BigDecimal cbid, BigDecimal fee, Boolean blocked) {
    this.price = price;
    this.feedId = feedId;
    this.id = id;
    this.shopCategoryId = shopCategoryId;
    this.marketCategoryId = marketCategoryId;
    this.preDiscountPrice = preDiscountPrice;
    this.discount = discount;
    this.cutPrice = cutPrice;
    this.url = url;
    this.modelId = modelId;
    this.name = name;
    this.currency = currency;
    this.bid = bid;
    this.cbid = cbid;
    this.fee = fee;
    this.blocked = blocked;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("shopCategoryId")
  public String getShopCategoryId() {
    return shopCategoryId;
  }
  public void setShopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }

    
  @JsonProperty("marketCategoryId")
  public Integer getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

    
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }
  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

    
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

    
  @JsonProperty("cutPrice")
  public Boolean getCutPrice() {
    return cutPrice;
  }
  public void setCutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }
  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

    
  @JsonProperty("bid")
  public BigDecimal getBid() {
    return bid;
  }
  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

    
  @JsonProperty("cbid")
  public BigDecimal getCbid() {
    return cbid;
  }
  public void setCbid(BigDecimal cbid) {
    this.cbid = cbid;
  }

    
  @JsonProperty("fee")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

    
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDTO offerDTO = (OfferDTO) o;
    return Objects.equals(price, offerDTO.price) &&
        Objects.equals(feedId, offerDTO.feedId) &&
        Objects.equals(id, offerDTO.id) &&
        Objects.equals(shopCategoryId, offerDTO.shopCategoryId) &&
        Objects.equals(marketCategoryId, offerDTO.marketCategoryId) &&
        Objects.equals(preDiscountPrice, offerDTO.preDiscountPrice) &&
        Objects.equals(discount, offerDTO.discount) &&
        Objects.equals(cutPrice, offerDTO.cutPrice) &&
        Objects.equals(url, offerDTO.url) &&
        Objects.equals(modelId, offerDTO.modelId) &&
        Objects.equals(name, offerDTO.name) &&
        Objects.equals(currency, offerDTO.currency) &&
        Objects.equals(bid, offerDTO.bid) &&
        Objects.equals(cbid, offerDTO.cbid) &&
        Objects.equals(fee, offerDTO.fee) &&
        Objects.equals(blocked, offerDTO.blocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, feedId, id, shopCategoryId, marketCategoryId, preDiscountPrice, discount, cutPrice, url, modelId, name, currency, bid, cbid, fee, blocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shopCategoryId: ").append(toIndentedString(shopCategoryId)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    cutPrice: ").append(toIndentedString(cutPrice)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    cbid: ").append(toIndentedString(cbid)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
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

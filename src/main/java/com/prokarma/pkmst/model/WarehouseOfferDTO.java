package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.TurnoverDTO;
import com.prokarma.pkmst.model.WarehouseStockDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об остатках товара.
 */
@ApiModel(description = "Информация об остатках товара.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseOfferDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("turnoverSummary")
  private TurnoverDTO turnoverSummary;

  @JsonProperty("stocks")
  
  private List<WarehouseStockDTO> stocks = new ArrayList<>();

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt;

  public WarehouseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public WarehouseOfferDTO turnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
    return this;
  }

  /**
   * Get turnoverSummary
   * @return turnoverSummary
   */
  @ApiModelProperty(value = "")
  public TurnoverDTO getTurnoverSummary() {
    return turnoverSummary;
  }

  public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
  }

  public WarehouseOfferDTO stocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  public WarehouseOfferDTO addStocksItem(WarehouseStockDTO stocksItem) {
    if (this.stocks == null) {
      this.stocks = new ArrayList<>();
    }
    this.stocks.add(stocksItem);
    return this;
  }

  /**
   * Информация об остатках.
   * @return stocks
   */
  @ApiModelProperty(required = true, value = "Информация об остатках.")
  public List<WarehouseStockDTO> getStocks() {
    return stocks;
  }

  public void setStocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  public WarehouseOfferDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
   * @return updatedAt
   */
  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. ")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseOfferDTO warehouseOfferDTO = (WarehouseOfferDTO) o;
    return Objects.equals(this.offerId, warehouseOfferDTO.offerId) &&
        Objects.equals(this.turnoverSummary, warehouseOfferDTO.turnoverSummary) &&
        Objects.equals(this.stocks, warehouseOfferDTO.stocks) &&
        Objects.equals(this.updatedAt, warehouseOfferDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, turnoverSummary, stocks, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    turnoverSummary: ").append(toIndentedString(turnoverSummary)).append("\n");
    sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


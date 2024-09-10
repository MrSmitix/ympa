package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.TurnoverDTO;
import org.openapitools.model.WarehouseStockDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об остатках товара.
 **/
@ApiModel(description="Информация об остатках товара.")

public class WarehouseOfferDTO  {
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

  @ApiModelProperty(value = "")
  private TurnoverDTO turnoverSummary;

  @ApiModelProperty(required = true, value = "Информация об остатках.")
 /**
   * Информация об остатках.
  **/
  private List<WarehouseStockDTO> stocks = new ArrayList<>();

  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. ")
 /**
   * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
  **/
  private Date updatedAt;
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public WarehouseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Get turnoverSummary
   * @return turnoverSummary
  **/
  @JsonProperty("turnoverSummary")
  public TurnoverDTO getTurnoverSummary() {
    return turnoverSummary;
  }

  public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
  }

  public WarehouseOfferDTO turnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
    return this;
  }

 /**
   * Информация об остатках.
   * @return stocks
  **/
  @JsonProperty("stocks")
  public List<WarehouseStockDTO> getStocks() {
    return stocks;
  }

  public void setStocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  public WarehouseOfferDTO stocks(List<WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  public WarehouseOfferDTO addStocksItem(WarehouseStockDTO stocksItem) {
    this.stocks.add(stocksItem);
    return this;
  }

 /**
   * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;. 
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public WarehouseOfferDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


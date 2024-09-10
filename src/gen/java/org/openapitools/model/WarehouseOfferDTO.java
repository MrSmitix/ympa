package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.TurnoverDTO;
import org.openapitools.model.WarehouseStockDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об остатках товара.
 */
@ApiModel(description="Информация об остатках товара.")

public class WarehouseOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private TurnoverDTO turnoverSummary;

 /**
  * Информация об остатках.
  */
  @ApiModelProperty(required = true, value = "Информация об остатках.")
  @Valid
  private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();

 /**
  * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public WarehouseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get turnoverSummary
  * @return turnoverSummary
  */
  @JsonProperty("turnoverSummary")
  public TurnoverDTO getTurnoverSummary() {
    return turnoverSummary;
  }

  /**
   * Sets the <code>turnoverSummary</code> property.
   */
 public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
  }

  /**
   * Sets the <code>turnoverSummary</code> property.
   */
  public WarehouseOfferDTO turnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
    return this;
  }

 /**
  * Информация об остатках.
  * @return stocks
  */
  @JsonProperty("stocks")
  @NotNull
  public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  /**
   * Sets the <code>stocks</code> property.
   */
 public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  /**
   * Sets the <code>stocks</code> property.
   */
  public WarehouseOfferDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
    return this;
  }

  /**
   * Adds a new item to the <code>stocks</code> list.
   */
  public WarehouseOfferDTO addStocksItem(WarehouseStockDTO stocksItem) {
    this.stocks.add(stocksItem);
    return this;
  }

 /**
  * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;. 
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
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


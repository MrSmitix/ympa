package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.TurnoverDTO;
import org.openapitools.model.WarehouseStockDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об остатках товара.
 */

@Schema(name = "WarehouseOfferDTO", description = "Информация об остатках товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseOfferDTO {

  private String offerId;

  private TurnoverDTO turnoverSummary;

  @Valid
  private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  public WarehouseOfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseOfferDTO(String offerId, List<@Valid WarehouseStockDTO> stocks) {
    this.offerId = offerId;
    this.stocks = stocks;
  }

  public WarehouseOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerId")
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
  @Valid 
  @Schema(name = "turnoverSummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("turnoverSummary")
  public TurnoverDTO getTurnoverSummary() {
    return turnoverSummary;
  }

  public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
    this.turnoverSummary = turnoverSummary;
  }

  public WarehouseOfferDTO stocks(List<@Valid WarehouseStockDTO> stocks) {
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
  @NotNull @Valid 
  @Schema(name = "stocks", description = "Информация об остатках.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stocks")
  public List<@Valid WarehouseStockDTO> getStocks() {
    return stocks;
  }

  public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
    this.stocks = stocks;
  }

  public WarehouseOfferDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", description = "Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
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


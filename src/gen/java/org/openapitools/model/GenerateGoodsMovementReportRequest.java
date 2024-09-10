package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные, необходимые для генерации отчета.
 **/
@ApiModel(description="Данные, необходимые для генерации отчета.")

public class GenerateGoodsMovementReportRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор кампании.")
 /**
   * Идентификатор кампании.
  **/
  private Long campaignId;

  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
 /**
   * Конец периода, включительно.
  **/
  private LocalDate dateTo;

  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String shopSku;
 /**
   * Идентификатор кампании.
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsMovementReportRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  @JsonProperty("dateFrom")
  @NotNull
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateGoodsMovementReportRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно.
   * @return dateTo
  **/
  @JsonProperty("dateTo")
  @NotNull
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateGoodsMovementReportRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public GenerateGoodsMovementReportRequest shopSku(String shopSku) {
    this.shopSku = shopSku;
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
    GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = (GenerateGoodsMovementReportRequest) o;
    return Objects.equals(this.campaignId, generateGoodsMovementReportRequest.campaignId) &&
        Objects.equals(this.dateFrom, generateGoodsMovementReportRequest.dateFrom) &&
        Objects.equals(this.dateTo, generateGoodsMovementReportRequest.dateTo) &&
        Objects.equals(this.shopSku, generateGoodsMovementReportRequest.shopSku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, dateFrom, dateTo, shopSku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsMovementReportRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
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


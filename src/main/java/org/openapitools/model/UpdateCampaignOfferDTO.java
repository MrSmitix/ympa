/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.QuantumDTO;



/**
 * Параметры размещения товара в магазине.
 */

@ApiModel(description = "Параметры размещения товара в магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateCampaignOfferDTO   {
  
  private String offerId;
  private QuantumDTO quantum;
  private Boolean available;
  private Integer vat;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   */
  public UpdateCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   */
  public UpdateCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }
  public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  /**
   * Есть ли товар в продаже. 
   */
  public UpdateCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

  
  @ApiModelProperty(value = "Есть ли товар в продаже. ")
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   * Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
   */
  public UpdateCampaignOfferDTO vat(Integer vat) {
    this.vat = vat;
    return this;
  }

  
  @ApiModelProperty(value = "Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. ")
  @JsonProperty("vat")
  public Integer getVat() {
    return vat;
  }
  public void setVat(Integer vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignOfferDTO updateCampaignOfferDTO = (UpdateCampaignOfferDTO) o;
    return Objects.equals(offerId, updateCampaignOfferDTO.offerId) &&
        Objects.equals(quantum, updateCampaignOfferDTO.quantum) &&
        Objects.equals(available, updateCampaignOfferDTO.available) &&
        Objects.equals(vat, updateCampaignOfferDTO.vat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available, vat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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


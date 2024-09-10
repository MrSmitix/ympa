package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.QuantumDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры размещения товара в магазине.
 */
@ApiModel(description="Параметры размещения товара в магазине.")

public class UpdateCampaignOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private QuantumDTO quantum;

 /**
  * Есть ли товар в продаже. 
  */
  @ApiModelProperty(value = "Есть ли товар в продаже. ")
  private Boolean available;

 /**
  * Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
  */
  @ApiModelProperty(value = "Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. ")
  private Integer vat;
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
  public UpdateCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get quantum
  * @return quantum
  */
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }

  /**
   * Sets the <code>quantum</code> property.
   */
 public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  /**
   * Sets the <code>quantum</code> property.
   */
  public UpdateCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

 /**
  * Есть ли товар в продаже. 
  * @return available
  */
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }

  /**
   * Sets the <code>available</code> property.
   */
 public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   * Sets the <code>available</code> property.
   */
  public UpdateCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

 /**
  * Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
  * @return vat
  */
  @JsonProperty("vat")
  public Integer getVat() {
    return vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
 public void setVat(Integer vat) {
    this.vat = vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
  public UpdateCampaignOfferDTO vat(Integer vat) {
    this.vat = vat;
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
    UpdateCampaignOfferDTO updateCampaignOfferDTO = (UpdateCampaignOfferDTO) o;
    return Objects.equals(this.offerId, updateCampaignOfferDTO.offerId) &&
        Objects.equals(this.quantum, updateCampaignOfferDTO.quantum) &&
        Objects.equals(this.available, updateCampaignOfferDTO.available) &&
        Objects.equals(this.vat, updateCampaignOfferDTO.vat);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


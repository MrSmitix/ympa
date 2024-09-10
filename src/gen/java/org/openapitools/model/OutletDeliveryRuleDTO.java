package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация об условиях доставки для данной точки продаж.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletDeliveryRuleDTO   {
  
  private Integer minDeliveryDays;
  private Integer maxDeliveryDays;
  private Long deliveryServiceId;
  private Integer orderBefore;
  private BigDecimal priceFreePickup;
  private Boolean unspecifiedDeliveryInterval;

  /**
   * Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. 
   **/
  
  @ApiModelProperty(value = "Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. ")
  @JsonProperty("minDeliveryDays")
  public Integer getMinDeliveryDays() {
    return minDeliveryDays;
  }
  public void setMinDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
  }

  /**
   * Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. 
   **/
  
  @ApiModelProperty(value = "Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. ")
  @JsonProperty("maxDeliveryDays")
  public Integer getMaxDeliveryDays() {
    return maxDeliveryDays;
  }
  public void setMaxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
  }

  /**
   * Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). 
   **/
  
  @ApiModelProperty(value = "Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). ")
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от &#x60;minDeliveryDays&#x60; до &#x60;maxDeliveryDays&#x60;.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от &#x60;minDeliveryDays&#x60; + 1 рабочий день до &#x60;maxDeliveryDays&#x60; + 1 рабочий день.  Значение по умолчанию: &#x60;24&#x60;. 
   * minimum: 0
   * maximum: 24
   **/
  
  @ApiModelProperty(value = "Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`. ")
  @JsonProperty("orderBefore")
 @Min(0) @Max(24)  public Integer getOrderBefore() {
    return orderBefore;
  }
  public void setOrderBefore(Integer orderBefore) {
    this.orderBefore = orderBefore;
  }

  /**
   * Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
   **/
  
  @ApiModelProperty(value = "Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.")
  @JsonProperty("priceFreePickup")
  @Valid
  public BigDecimal getPriceFreePickup() {
    return priceFreePickup;
  }
  public void setPriceFreePickup(BigDecimal priceFreePickup) {
    this.priceFreePickup = priceFreePickup;
  }

  /**
   * Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * &#x60;true&#x60; — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением &#x60;true&#x60;.  Взаимоисключающий с параметрами &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;. 
   **/
  
  @ApiModelProperty(value = "Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`. ")
  @JsonProperty("unspecifiedDeliveryInterval")
  public Boolean getUnspecifiedDeliveryInterval() {
    return unspecifiedDeliveryInterval;
  }
  public void setUnspecifiedDeliveryInterval(Boolean unspecifiedDeliveryInterval) {
    this.unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletDeliveryRuleDTO outletDeliveryRuleDTO = (OutletDeliveryRuleDTO) o;
    return Objects.equals(this.minDeliveryDays, outletDeliveryRuleDTO.minDeliveryDays) &&
        Objects.equals(this.maxDeliveryDays, outletDeliveryRuleDTO.maxDeliveryDays) &&
        Objects.equals(this.deliveryServiceId, outletDeliveryRuleDTO.deliveryServiceId) &&
        Objects.equals(this.orderBefore, outletDeliveryRuleDTO.orderBefore) &&
        Objects.equals(this.priceFreePickup, outletDeliveryRuleDTO.priceFreePickup) &&
        Objects.equals(this.unspecifiedDeliveryInterval, outletDeliveryRuleDTO.unspecifiedDeliveryInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDeliveryDays, maxDeliveryDays, deliveryServiceId, orderBefore, priceFreePickup, unspecifiedDeliveryInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletDeliveryRuleDTO {\n");
    
    sb.append("    minDeliveryDays: ").append(toIndentedString(minDeliveryDays)).append("\n");
    sb.append("    maxDeliveryDays: ").append(toIndentedString(maxDeliveryDays)).append("\n");
    sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
    sb.append("    orderBefore: ").append(toIndentedString(orderBefore)).append("\n");
    sb.append("    priceFreePickup: ").append(toIndentedString(priceFreePickup)).append("\n");
    sb.append("    unspecifiedDeliveryInterval: ").append(toIndentedString(unspecifiedDeliveryInterval)).append("\n");
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


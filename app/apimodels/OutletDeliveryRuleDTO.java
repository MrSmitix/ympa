package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об условиях доставки для данной точки продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletDeliveryRuleDTO   {
  @JsonProperty("minDeliveryDays")
  
  private Integer minDeliveryDays;

  @JsonProperty("maxDeliveryDays")
  
  private Integer maxDeliveryDays;

  @JsonProperty("deliveryServiceId")
  
  private Long deliveryServiceId;

  @JsonProperty("orderBefore")
  @Min(0)
@Max(24)

  private Integer orderBefore;

  @JsonProperty("priceFreePickup")
  @Valid

  private BigDecimal priceFreePickup;

  @JsonProperty("unspecifiedDeliveryInterval")
  
  private Boolean unspecifiedDeliveryInterval;

  public OutletDeliveryRuleDTO minDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
    return this;
  }

   /**
   * Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
   * @return minDeliveryDays
  **/
  public Integer getMinDeliveryDays() {
    return minDeliveryDays;
  }

  public void setMinDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
  }

  public OutletDeliveryRuleDTO maxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
    return this;
  }

   /**
   * Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
   * @return maxDeliveryDays
  **/
  public Integer getMaxDeliveryDays() {
    return maxDeliveryDays;
  }

  public void setMaxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
  }

  public OutletDeliveryRuleDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

   /**
   * Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). 
   * @return deliveryServiceId
  **/
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  public OutletDeliveryRuleDTO orderBefore(Integer orderBefore) {
    this.orderBefore = orderBefore;
    return this;
  }

   /**
   * Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`. 
   * minimum: 0
   * maximum: 24
   * @return orderBefore
  **/
  public Integer getOrderBefore() {
    return orderBefore;
  }

  public void setOrderBefore(Integer orderBefore) {
    this.orderBefore = orderBefore;
  }

  public OutletDeliveryRuleDTO priceFreePickup(BigDecimal priceFreePickup) {
    this.priceFreePickup = priceFreePickup;
    return this;
  }

   /**
   * Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
   * @return priceFreePickup
  **/
  public BigDecimal getPriceFreePickup() {
    return priceFreePickup;
  }

  public void setPriceFreePickup(BigDecimal priceFreePickup) {
    this.priceFreePickup = priceFreePickup;
  }

  public OutletDeliveryRuleDTO unspecifiedDeliveryInterval(Boolean unspecifiedDeliveryInterval) {
    this.unspecifiedDeliveryInterval = unspecifiedDeliveryInterval;
    return this;
  }

   /**
   * Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`. 
   * @return unspecifiedDeliveryInterval
  **/
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
    return Objects.equals(minDeliveryDays, outletDeliveryRuleDTO.minDeliveryDays) &&
        Objects.equals(maxDeliveryDays, outletDeliveryRuleDTO.maxDeliveryDays) &&
        Objects.equals(deliveryServiceId, outletDeliveryRuleDTO.deliveryServiceId) &&
        Objects.equals(orderBefore, outletDeliveryRuleDTO.orderBefore) &&
        Objects.equals(priceFreePickup, outletDeliveryRuleDTO.priceFreePickup) &&
        Objects.equals(unspecifiedDeliveryInterval, outletDeliveryRuleDTO.unspecifiedDeliveryInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDeliveryDays, maxDeliveryDays, deliveryServiceId, orderBefore, priceFreePickup, unspecifiedDeliveryInterval);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


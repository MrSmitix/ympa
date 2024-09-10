package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromoOfferUpdateWarningDTO;

/**
 * Описание предупреждения, которое появилось при добавлении товара.
 */
@ApiModel(description = "Описание предупреждения, которое появилось при добавлении товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarningPromoOfferUpdateDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("warnings")
  private List<@Valid PromoOfferUpdateWarningDTO> warnings = new ArrayList<>();

  public WarningPromoOfferUpdateDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public WarningPromoOfferUpdateDTO warnings(List<@Valid PromoOfferUpdateWarningDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public WarningPromoOfferUpdateDTO addWarningsItem(PromoOfferUpdateWarningDTO warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.")
  public List<@Valid PromoOfferUpdateWarningDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid PromoOfferUpdateWarningDTO> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO = (WarningPromoOfferUpdateDTO) o;
    return Objects.equals(this.offerId, warningPromoOfferUpdateDTO.offerId) &&
        Objects.equals(this.warnings, warningPromoOfferUpdateDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningPromoOfferUpdateDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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


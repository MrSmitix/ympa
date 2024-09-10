package apimodels;

import apimodels.ParameterValueDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Товар с указанными характеристиками.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferContentDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("categoryId")
  @NotNull

  private Integer categoryId;

  @JsonProperty("parameterValues")
  @NotNull
@Size(min=1,max=300)
@Valid

  private List<@Valid ParameterValueDTO> parameterValues = new ArrayList<>();

  public OfferContentDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferContentDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   * @return categoryId
  **/
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public OfferContentDTO parameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  public OfferContentDTO addParameterValuesItem(ParameterValueDTO parameterValuesItem) {
    if (this.parameterValues == null) {
      this.parameterValues = new ArrayList<>();
    }
    this.parameterValues.add(parameterValuesItem);
    return this;
  }

   /**
   * Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
   * @return parameterValues
  **/
  public List<@Valid ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContentDTO offerContentDTO = (OfferContentDTO) o;
    return Objects.equals(offerId, offerContentDTO.offerId) &&
        Objects.equals(categoryId, offerContentDTO.categoryId) &&
        Objects.equals(parameterValues, offerContentDTO.parameterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, categoryId, parameterValues);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContentDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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


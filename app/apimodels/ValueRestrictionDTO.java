package apimodels;

import apimodels.OptionValuesLimitedDTO;
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
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ValueRestrictionDTO   {
  @JsonProperty("limitingParameterId")
  @NotNull

  private Long limitingParameterId;

  @JsonProperty("limitedValues")
  @NotNull
@Valid

  private List<@Valid OptionValuesLimitedDTO> limitedValues = new ArrayList<>();

  public ValueRestrictionDTO limitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
    return this;
  }

   /**
   * Идентификатор ограничивающей характеристики.
   * @return limitingParameterId
  **/
  public Long getLimitingParameterId() {
    return limitingParameterId;
  }

  public void setLimitingParameterId(Long limitingParameterId) {
    this.limitingParameterId = limitingParameterId;
  }

  public ValueRestrictionDTO limitedValues(List<@Valid OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
    return this;
  }

  public ValueRestrictionDTO addLimitedValuesItem(OptionValuesLimitedDTO limitedValuesItem) {
    if (this.limitedValues == null) {
      this.limitedValues = new ArrayList<>();
    }
    this.limitedValues.add(limitedValuesItem);
    return this;
  }

   /**
   * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
   * @return limitedValues
  **/
  public List<@Valid OptionValuesLimitedDTO> getLimitedValues() {
    return limitedValues;
  }

  public void setLimitedValues(List<@Valid OptionValuesLimitedDTO> limitedValues) {
    this.limitedValues = limitedValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueRestrictionDTO valueRestrictionDTO = (ValueRestrictionDTO) o;
    return Objects.equals(limitingParameterId, valueRestrictionDTO.limitingParameterId) &&
        Objects.equals(limitedValues, valueRestrictionDTO.limitedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitingParameterId, limitedValues);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueRestrictionDTO {\n");
    
    sb.append("    limitingParameterId: ").append(toIndentedString(limitingParameterId)).append("\n");
    sb.append("    limitedValues: ").append(toIndentedString(limitedValues)).append("\n");
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


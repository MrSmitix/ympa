package apimodels;

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
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OptionValuesLimitedDTO   {
  @JsonProperty("limitingOptionValueId")
  @NotNull

  private Long limitingOptionValueId;

  @JsonProperty("optionValueIds")
  @NotNull

  private List<Long> optionValueIds = new ArrayList<>();

  public OptionValuesLimitedDTO limitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
    return this;
  }

   /**
   * Идентификатор значения ограничивающей характеристики.
   * @return limitingOptionValueId
  **/
  public Long getLimitingOptionValueId() {
    return limitingOptionValueId;
  }

  public void setLimitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
  }

  public OptionValuesLimitedDTO optionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
    return this;
  }

  public OptionValuesLimitedDTO addOptionValueIdsItem(Long optionValueIdsItem) {
    if (this.optionValueIds == null) {
      this.optionValueIds = new ArrayList<>();
    }
    this.optionValueIds.add(optionValueIdsItem);
    return this;
  }

   /**
   * Идентификаторы допустимых значений ограничиваемой характеристики. 
   * @return optionValueIds
  **/
  public List<Long> getOptionValueIds() {
    return optionValueIds;
  }

  public void setOptionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionValuesLimitedDTO optionValuesLimitedDTO = (OptionValuesLimitedDTO) o;
    return Objects.equals(limitingOptionValueId, optionValuesLimitedDTO.limitingOptionValueId) &&
        Objects.equals(optionValueIds, optionValuesLimitedDTO.optionValueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitingOptionValueId, optionValueIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionValuesLimitedDTO {\n");
    
    sb.append("    limitingOptionValueId: ").append(toIndentedString(limitingOptionValueId)).append("\n");
    sb.append("    optionValueIds: ").append(toIndentedString(optionValueIds)).append("\n");
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


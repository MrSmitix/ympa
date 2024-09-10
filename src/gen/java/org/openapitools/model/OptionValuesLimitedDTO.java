package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 **/
@ApiModel(description="Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.")

public class OptionValuesLimitedDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор значения ограничивающей характеристики.")
 /**
   * Идентификатор значения ограничивающей характеристики.
  **/
  private Long limitingOptionValueId;

  @ApiModelProperty(required = true, value = "Идентификаторы допустимых значений ограничиваемой характеристики. ")
 /**
   * Идентификаторы допустимых значений ограничиваемой характеристики. 
  **/
  private List<Long> optionValueIds = new ArrayList<>();
 /**
   * Идентификатор значения ограничивающей характеристики.
   * @return limitingOptionValueId
  **/
  @JsonProperty("limitingOptionValueId")
  @NotNull
  public Long getLimitingOptionValueId() {
    return limitingOptionValueId;
  }

  public void setLimitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
  }

  public OptionValuesLimitedDTO limitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
    return this;
  }

 /**
   * Идентификаторы допустимых значений ограничиваемой характеристики. 
   * @return optionValueIds
  **/
  @JsonProperty("optionValueIds")
  @NotNull
  public List<Long> getOptionValueIds() {
    return optionValueIds;
  }

  public void setOptionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
  }

  public OptionValuesLimitedDTO optionValueIds(List<Long> optionValueIds) {
    this.optionValueIds = optionValueIds;
    return this;
  }

  public OptionValuesLimitedDTO addOptionValueIdsItem(Long optionValueIdsItem) {
    this.optionValueIds.add(optionValueIdsItem);
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
    OptionValuesLimitedDTO optionValuesLimitedDTO = (OptionValuesLimitedDTO) o;
    return Objects.equals(this.limitingOptionValueId, optionValuesLimitedDTO.limitingOptionValueId) &&
        Objects.equals(this.optionValueIds, optionValuesLimitedDTO.optionValueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitingOptionValueId, optionValueIds);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


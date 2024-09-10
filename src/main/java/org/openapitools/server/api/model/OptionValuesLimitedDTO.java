package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptionValuesLimitedDTO   {
  
  private Long limitingOptionValueId;
  private List<Long> optionValueIds = new ArrayList<>();

  public OptionValuesLimitedDTO () {

  }

  public OptionValuesLimitedDTO (Long limitingOptionValueId, List<Long> optionValueIds) {
    this.limitingOptionValueId = limitingOptionValueId;
    this.optionValueIds = optionValueIds;
  }

    
  @JsonProperty("limitingOptionValueId")
  public Long getLimitingOptionValueId() {
    return limitingOptionValueId;
  }
  public void setLimitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
  }

    
  @JsonProperty("optionValueIds")
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

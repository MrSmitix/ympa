package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */

@Schema(name = "OptionValuesLimitedDTO", description = "Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OptionValuesLimitedDTO {

  private Long limitingOptionValueId;

  @Valid
  private List<Long> optionValueIds = new ArrayList<>();

  public OptionValuesLimitedDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OptionValuesLimitedDTO(Long limitingOptionValueId, List<Long> optionValueIds) {
    this.limitingOptionValueId = limitingOptionValueId;
    this.optionValueIds = optionValueIds;
  }

  public OptionValuesLimitedDTO limitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
    return this;
  }

  /**
   * Идентификатор значения ограничивающей характеристики.
   * @return limitingOptionValueId
   */
  @NotNull 
  @Schema(name = "limitingOptionValueId", description = "Идентификатор значения ограничивающей характеристики.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limitingOptionValueId")
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
   */
  @NotNull 
  @Schema(name = "optionValueIds", description = "Идентификаторы допустимых значений ограничиваемой характеристики. ", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


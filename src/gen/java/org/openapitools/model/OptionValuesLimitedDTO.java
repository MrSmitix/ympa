/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */
@ApiModel(description = "Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.")
@JsonPropertyOrder({
  OptionValuesLimitedDTO.JSON_PROPERTY_LIMITING_OPTION_VALUE_ID,
  OptionValuesLimitedDTO.JSON_PROPERTY_OPTION_VALUE_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OptionValuesLimitedDTO   {
  public static final String JSON_PROPERTY_LIMITING_OPTION_VALUE_ID = "limitingOptionValueId";
  @JsonProperty(JSON_PROPERTY_LIMITING_OPTION_VALUE_ID)
  private Long limitingOptionValueId;

  public static final String JSON_PROPERTY_OPTION_VALUE_IDS = "optionValueIds";
  @JsonProperty(JSON_PROPERTY_OPTION_VALUE_IDS)
  private List<Long> optionValueIds = new ArrayList<>();

  public OptionValuesLimitedDTO limitingOptionValueId(Long limitingOptionValueId) {
    this.limitingOptionValueId = limitingOptionValueId;
    return this;
  }

  /**
   * Идентификатор значения ограничивающей характеристики.
   * @return limitingOptionValueId
   **/
  @JsonProperty(value = "limitingOptionValueId")
  @ApiModelProperty(required = true, value = "Идентификатор значения ограничивающей характеристики.")
  @NotNull 
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
  @JsonProperty(value = "optionValueIds")
  @ApiModelProperty(required = true, value = "Идентификаторы допустимых значений ограничиваемой характеристики. ")
  @NotNull 
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


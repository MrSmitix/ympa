package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Региональная информация.
 **/
@ApiModel(description="Региональная информация.")

public class RegionalModelInfoDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CurrencyType currency;

  @ApiModelProperty(value = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ")
 /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  **/
  private Long regionId;
 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public RegionalModelInfoDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
   * @return regionId
  **/
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public RegionalModelInfoDTO regionId(Long regionId) {
    this.regionId = regionId;
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
    RegionalModelInfoDTO regionalModelInfoDTO = (RegionalModelInfoDTO) o;
    return Objects.equals(this.currency, regionalModelInfoDTO.currency) &&
        Objects.equals(this.regionId, regionalModelInfoDTO.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, regionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionalModelInfoDTO {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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


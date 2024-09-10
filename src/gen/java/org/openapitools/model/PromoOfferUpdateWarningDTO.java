package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PromoOfferUpdateWarningCodeType;



/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 **/

@ApiModel(description = "Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferUpdateWarningDTO   {
  @JsonProperty("code")
  private PromoOfferUpdateWarningCodeType code;

  @JsonProperty("campaignIds")
  private List<Long> campaignIds = null;

  /**
   **/
  public PromoOfferUpdateWarningDTO code(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public PromoOfferUpdateWarningCodeType getCode() {
    return code;
  }
  public void setCode(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

  /**
   * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
   **/
  public PromoOfferUpdateWarningDTO campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. ")
  @JsonProperty("campaignIds")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO = (PromoOfferUpdateWarningDTO) o;
    return Objects.equals(code, promoOfferUpdateWarningDTO.code) &&
        Objects.equals(campaignIds, promoOfferUpdateWarningDTO.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferUpdateWarningDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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


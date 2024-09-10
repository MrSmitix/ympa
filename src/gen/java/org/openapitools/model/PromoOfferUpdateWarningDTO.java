package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferUpdateWarningDTO   {
  
  private PromoOfferUpdateWarningCodeType code;
  private List<Long> campaignIds;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
  @Valid
  public PromoOfferUpdateWarningCodeType getCode() {
    return code;
  }
  public void setCode(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

  /**
   * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
   **/
  
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
    return Objects.equals(this.code, promoOfferUpdateWarningDTO.code) &&
        Objects.equals(this.campaignIds, promoOfferUpdateWarningDTO.campaignIds);
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


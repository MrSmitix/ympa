package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.PromoOfferUpdateWarningCodeType;

/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOfferUpdateWarningDTO   {
  
  private PromoOfferUpdateWarningCodeType code;
  private List<Long> campaignIds;

  public PromoOfferUpdateWarningDTO () {

  }

  public PromoOfferUpdateWarningDTO (PromoOfferUpdateWarningCodeType code, List<Long> campaignIds) {
    this.code = code;
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("code")
  public PromoOfferUpdateWarningCodeType getCode() {
    return code;
  }
  public void setCode(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

    
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

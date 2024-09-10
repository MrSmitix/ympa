package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CampaignSettingsDTO;

/**
 * Ответ на запрос настроек магазина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCampaignSettingsResponse   {
  
  private CampaignSettingsDTO settings;

  public GetCampaignSettingsResponse () {

  }

  public GetCampaignSettingsResponse (CampaignSettingsDTO settings) {
    this.settings = settings;
  }

    
  @JsonProperty("settings")
  public CampaignSettingsDTO getSettings() {
    return settings;
  }
  public void setSettings(CampaignSettingsDTO settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignSettingsResponse getCampaignSettingsResponse = (GetCampaignSettingsResponse) o;
    return Objects.equals(settings, getCampaignSettingsResponse.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignSettingsResponse {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

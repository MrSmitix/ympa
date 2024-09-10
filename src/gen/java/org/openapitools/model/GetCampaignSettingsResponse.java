package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CampaignSettingsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос настроек магазина.
 */
@ApiModel(description="Ответ на запрос настроек магазина.")

public class GetCampaignSettingsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsDTO settings;
 /**
  * Get settings
  * @return settings
  */
  @JsonProperty("settings")
  public CampaignSettingsDTO getSettings() {
    return settings;
  }

  /**
   * Sets the <code>settings</code> property.
   */
 public void setSettings(CampaignSettingsDTO settings) {
    this.settings = settings;
  }

  /**
   * Sets the <code>settings</code> property.
   */
  public GetCampaignSettingsResponse settings(CampaignSettingsDTO settings) {
    this.settings = settings;
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
    GetCampaignSettingsResponse getCampaignSettingsResponse = (GetCampaignSettingsResponse) o;
    return Objects.equals(this.settings, getCampaignSettingsResponse.settings);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSettingsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ответ на запрос настроек магазина.
 **/
@ApiModel(description = "Ответ на запрос настроек магазина.")
@JsonTypeName("GetCampaignSettingsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignSettingsResponse   {
  private CampaignSettingsDTO settings;

  /**
   **/
  public GetCampaignSettingsResponse settings(CampaignSettingsDTO settings) {
    this.settings = settings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("settings")
  @Valid public CampaignSettingsDTO getSettings() {
    return settings;
  }

  @JsonProperty("settings")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


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
import org.openapitools.model.CampaignSettingsDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос настроек магазина.
 */
@ApiModel(description = "Ответ на запрос настроек магазина.")
@JsonPropertyOrder({
  GetCampaignSettingsResponse.JSON_PROPERTY_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignSettingsResponse   {
  public static final String JSON_PROPERTY_SETTINGS = "settings";
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  private CampaignSettingsDTO settings;

  public GetCampaignSettingsResponse settings(CampaignSettingsDTO settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   **/
  @JsonProperty(value = "settings")
  @ApiModelProperty(value = "")
  @Valid 
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


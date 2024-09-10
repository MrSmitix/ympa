package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BusinessDTO;
import org.openapitools.vertxweb.server.model.BusinessSettingsDTO;

/**
 * Информация о кабинете и его настройках.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBusinessSettingsInfoDTO   {
  
  private BusinessDTO info;
  private BusinessSettingsDTO settings;

  public GetBusinessSettingsInfoDTO () {

  }

  public GetBusinessSettingsInfoDTO (BusinessDTO info, BusinessSettingsDTO settings) {
    this.info = info;
    this.settings = settings;
  }

    
  @JsonProperty("info")
  public BusinessDTO getInfo() {
    return info;
  }
  public void setInfo(BusinessDTO info) {
    this.info = info;
  }

    
  @JsonProperty("settings")
  public BusinessSettingsDTO getSettings() {
    return settings;
  }
  public void setSettings(BusinessSettingsDTO settings) {
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
    GetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO = (GetBusinessSettingsInfoDTO) o;
    return Objects.equals(info, getBusinessSettingsInfoDTO.info) &&
        Objects.equals(settings, getBusinessSettingsInfoDTO.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessSettingsInfoDTO {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

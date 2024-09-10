package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BusinessDTO;
import com.prokarma.pkmst.model.BusinessSettingsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о кабинете и его настройках.
 */
@ApiModel(description = "Информация о кабинете и его настройках.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBusinessSettingsInfoDTO   {
  @JsonProperty("info")
  private BusinessDTO info;

  @JsonProperty("settings")
  private BusinessSettingsDTO settings;

  public GetBusinessSettingsInfoDTO info(BusinessDTO info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @ApiModelProperty(value = "")
  public BusinessDTO getInfo() {
    return info;
  }

  public void setInfo(BusinessDTO info) {
    this.info = info;
  }

  public GetBusinessSettingsInfoDTO settings(BusinessSettingsDTO settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.info, getBusinessSettingsInfoDTO.info) &&
        Objects.equals(this.settings, getBusinessSettingsInfoDTO.settings);
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


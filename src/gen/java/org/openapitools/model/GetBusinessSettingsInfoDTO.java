package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.BusinessSettingsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о кабинете и его настройках.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о кабинете и его настройках.")
public class GetBusinessSettingsInfoDTO   {
  
  private BusinessDTO info;

  private BusinessSettingsDTO settings;

  /**
   **/
  public GetBusinessSettingsInfoDTO info(BusinessDTO info) {
    this.info = info;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("info")
  public BusinessDTO getInfo() {
    return info;
  }
  public void setInfo(BusinessDTO info) {
    this.info = info;
  }


  /**
   **/
  public GetBusinessSettingsInfoDTO settings(BusinessSettingsDTO settings) {
    this.settings = settings;
    return this;
  }

  
  @ApiModelProperty(value = "")
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


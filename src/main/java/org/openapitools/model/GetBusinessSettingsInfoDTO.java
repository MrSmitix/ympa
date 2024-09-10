package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.BusinessSettingsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о кабинете и его настройках.
 */

@Schema(name = "GetBusinessSettingsInfoDTO", description = "Информация о кабинете и его настройках.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBusinessSettingsInfoDTO {

  private BusinessDTO info;

  private BusinessSettingsDTO settings;

  public GetBusinessSettingsInfoDTO info(BusinessDTO info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @Valid 
  @Schema(name = "info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("info")
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
  @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


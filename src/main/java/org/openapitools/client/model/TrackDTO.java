/**
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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация о трек-номерах.
 **/
@ApiModel(description = "Информация о трек-номерах.")
public class TrackDTO {
  
  @SerializedName("trackCode")
  private String trackCode = null;

  /**
   * Трек-код почтового отправления.
   **/
  @ApiModelProperty(value = "Трек-код почтового отправления.")
  public String getTrackCode() {
    return trackCode;
  }
  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackDTO trackDTO = (TrackDTO) o;
    return (this.trackCode == null ? trackDTO.trackCode == null : this.trackCode.equals(trackDTO.trackCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.trackCode == null ? 0: this.trackCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackDTO {\n");
    
    sb.append("  trackCode: ").append(trackCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import org.openapitools.client.model.FeedDownloadErrorType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 **/
@ApiModel(description = "Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. ")
public class FeedDownloadErrorDTO {
  
  @SerializedName("httpStatusCode")
  private Integer httpStatusCode = null;
  @SerializedName("type")
  private FeedDownloadErrorType type = null;
  @SerializedName("description")
  private String description = null;

  /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
   **/
  @ApiModelProperty(value = "HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }
  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FeedDownloadErrorType getType() {
    return type;
  }
  public void setType(FeedDownloadErrorType type) {
    this.type = type;
  }

  /**
   * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
   **/
  @ApiModelProperty(value = "Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. ")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDownloadErrorDTO feedDownloadErrorDTO = (FeedDownloadErrorDTO) o;
    return (this.httpStatusCode == null ? feedDownloadErrorDTO.httpStatusCode == null : this.httpStatusCode.equals(feedDownloadErrorDTO.httpStatusCode)) &&
        (this.type == null ? feedDownloadErrorDTO.type == null : this.type.equals(feedDownloadErrorDTO.type)) &&
        (this.description == null ? feedDownloadErrorDTO.description == null : this.description.equals(feedDownloadErrorDTO.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.httpStatusCode == null ? 0: this.httpStatusCode.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDownloadErrorDTO {\n");
    
    sb.append("  httpStatusCode: ").append(httpStatusCode).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Параметр прайс-листа.
 **/
@ApiModel(description = "Параметр прайс-листа.")
public class FeedParameterDTO {
  
  @SerializedName("deleted")
  private Boolean deleted = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("values")
  private List<Integer> values = null;

  /**
   * Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
   **/
  @ApiModelProperty(value = "Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. ")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   * Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
   **/
  @ApiModelProperty(required = true, value = "Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Значения параметра.  Используется вместе с параметром `name`. 
   **/
  @ApiModelProperty(value = "Значения параметра.  Используется вместе с параметром `name`. ")
  public List<Integer> getValues() {
    return values;
  }
  public void setValues(List<Integer> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedParameterDTO feedParameterDTO = (FeedParameterDTO) o;
    return (this.deleted == null ? feedParameterDTO.deleted == null : this.deleted.equals(feedParameterDTO.deleted)) &&
        (this.name == null ? feedParameterDTO.name == null : this.name.equals(feedParameterDTO.name)) &&
        (this.values == null ? feedParameterDTO.values == null : this.values.equals(feedParameterDTO.values));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.deleted == null ? 0: this.deleted.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.values == null ? 0: this.values.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedParameterDTO {\n");
    
    sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

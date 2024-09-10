package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметр прайс-листа.
 **/
@ApiModel(description="Параметр прайс-листа.")

public class FeedParameterDTO  {
  
  @ApiModelProperty(value = "Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. ")
 /**
   * Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
  **/
  private Boolean deleted;

  @ApiModelProperty(required = true, value = "Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. ")
 /**
   * Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
  **/
  private String name;

  @ApiModelProperty(value = "Значения параметра.  Используется вместе с параметром `name`. ")
 /**
   * Значения параметра.  Используется вместе с параметром `name`. 
  **/
  private List<Integer> values;
 /**
   * Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;. 
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public FeedParameterDTO deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

 /**
   * Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeedParameterDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Значения параметра.  Используется вместе с параметром &#x60;name&#x60;. 
   * @return values
  **/
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }

  public FeedParameterDTO values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public FeedParameterDTO addValuesItem(Integer valuesItem) {
    this.values.add(valuesItem);
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
    FeedParameterDTO feedParameterDTO = (FeedParameterDTO) o;
    return Objects.equals(this.deleted, feedParameterDTO.deleted) &&
        Objects.equals(this.name, feedParameterDTO.name) &&
        Objects.equals(this.values, feedParameterDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedParameterDTO {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


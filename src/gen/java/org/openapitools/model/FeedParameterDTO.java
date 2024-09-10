package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Параметр прайс-листа.
 */
@ApiModel(description = "Параметр прайс-листа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedParameterDTO   {
  @JsonProperty("deleted")
  private Boolean deleted;

  @JsonProperty("name")
  private String name;

  @JsonProperty("values")
  private List<Integer> values = null;

  public FeedParameterDTO deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
   * @return deleted
  **/
  @ApiModelProperty(value = "Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. ")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public FeedParameterDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeedParameterDTO values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public FeedParameterDTO addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = ;
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Значения параметра.  Используется вместе с параметром `name`. 
   * @return values
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


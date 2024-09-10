package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
 */
@ApiModel(description = "Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferParamDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public OfferParamDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
   * @return name
   */
  @ApiModelProperty(example = "Wi-Fi", required = true, value = "Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferParamDTO value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение. 
   * @return value
   */
  @ApiModelProperty(example = "есть", required = true, value = "Значение. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferParamDTO offerParamDTO = (OfferParamDTO) o;
    return Objects.equals(this.name, offerParamDTO.name) &&
        Objects.equals(this.value, offerParamDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferParamDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


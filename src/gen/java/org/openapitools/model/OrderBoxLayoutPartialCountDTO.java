package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о части товара в коробке.
 **/

@ApiModel(description = "Информация о части товара в коробке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxLayoutPartialCountDTO   {
  @JsonProperty("current")
  private Integer current;

  @JsonProperty("total")
  private Integer total;

  /**
   * Номер части, начиная с 1.
   * minimum: 1
   **/
  public OrderBoxLayoutPartialCountDTO current(Integer current) {
    this.current = current;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Номер части, начиная с 1.")
  @JsonProperty("current")
  public Integer getCurrent() {
    return current;
  }
  public void setCurrent(Integer current) {
    this.current = current;
  }

  /**
   * На сколько всего частей разделен товар.
   * minimum: 2
   **/
  public OrderBoxLayoutPartialCountDTO total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "На сколько всего частей разделен товар.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO = (OrderBoxLayoutPartialCountDTO) o;
    return Objects.equals(current, orderBoxLayoutPartialCountDTO.current) &&
        Objects.equals(total, orderBoxLayoutPartialCountDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxLayoutPartialCountDTO {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


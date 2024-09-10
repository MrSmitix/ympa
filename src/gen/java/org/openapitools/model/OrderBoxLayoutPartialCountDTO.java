package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о части товара в коробке.
 **/
@ApiModel(description="Информация о части товара в коробке.")

public class OrderBoxLayoutPartialCountDTO  {
  
  @ApiModelProperty(required = true, value = "Номер части, начиная с 1.")
 /**
   * Номер части, начиная с 1.
  **/
  private Integer current;

  @ApiModelProperty(required = true, value = "На сколько всего частей разделен товар.")
 /**
   * На сколько всего частей разделен товар.
  **/
  private Integer total;
 /**
   * Номер части, начиная с 1.
   * minimum: 1
   * @return current
  **/
  @JsonProperty("current")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public OrderBoxLayoutPartialCountDTO current(Integer current) {
    this.current = current;
    return this;
  }

 /**
   * На сколько всего частей разделен товар.
   * minimum: 2
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public OrderBoxLayoutPartialCountDTO total(Integer total) {
    this.total = total;
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
    OrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO = (OrderBoxLayoutPartialCountDTO) o;
    return Objects.equals(this.current, orderBoxLayoutPartialCountDTO.current) &&
        Objects.equals(this.total, orderBoxLayoutPartialCountDTO.total);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


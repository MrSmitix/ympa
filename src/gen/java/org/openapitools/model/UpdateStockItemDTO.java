package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об остатках товара. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об остатках товара. ")
public class UpdateStockItemDTO   {
  
  private Long count;

  private java.util.Date updatedAt;

  /**
   * Количество доступного товара. 
   * minimum: 0
   * maximum: 2000000000
   **/
  public UpdateStockItemDTO count(Long count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество доступного товара. ")
  @JsonProperty("count")
  @NotNull
 @Min(0L) @Max(2000000000L)  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  /**
   * Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public UpdateStockItemDTO updatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("updatedAt")
  public java.util.Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStockItemDTO updateStockItemDTO = (UpdateStockItemDTO) o;
    return Objects.equals(this.count, updateStockItemDTO.count) &&
        Objects.equals(this.updatedAt, updateStockItemDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStockItemDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


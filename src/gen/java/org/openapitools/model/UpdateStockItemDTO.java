package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об остатках товара. 
 **/
@ApiModel(description="Информация об остатках товара. ")

public class UpdateStockItemDTO  {
  
  @ApiModelProperty(required = true, value = "Количество доступного товара. ")
 /**
   * Количество доступного товара. 
  **/
  private Long count;

  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
 /**
   * Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  **/
  private Date updatedAt;
 /**
   * Количество доступного товара. 
   * minimum: 0
   * maximum: 2000000000
   * @return count
  **/
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public UpdateStockItemDTO count(Long count) {
    this.count = count;
    return this;
  }

 /**
   * Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UpdateStockItemDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


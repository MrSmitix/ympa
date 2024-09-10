package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Информация об остатках товара. 
 **/

@ApiModel(description = "Информация об остатках товара. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateStockItemDTO   {
  @JsonProperty("count")
  private Long count;

  @JsonProperty("updatedAt")
  private Date updatedAt;

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
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   * Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   **/
  public UpdateStockItemDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
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
    return Objects.equals(count, updateStockItemDTO.count) &&
        Objects.equals(updatedAt, updateStockItemDTO.updatedAt);
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


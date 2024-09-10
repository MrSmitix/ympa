package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация об акции «Бестселлеры Маркета».")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoBestsellerInfoDTO   {
  
  private Boolean bestseller;
  private Date entryDeadline;

  /**
   * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
   **/
  
  @ApiModelProperty(required = true, value = "Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).")
  @JsonProperty("bestseller")
  @NotNull
  public Boolean getBestseller() {
    return bestseller;
  }
  public void setBestseller(Boolean bestseller) {
    this.bestseller = bestseller;
  }

  /**
   * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
   **/
  
  @ApiModelProperty(value = "До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». ")
  @JsonProperty("entryDeadline")
  public Date getEntryDeadline() {
    return entryDeadline;
  }
  public void setEntryDeadline(Date entryDeadline) {
    this.entryDeadline = entryDeadline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO = (GetPromoBestsellerInfoDTO) o;
    return Objects.equals(this.bestseller, getPromoBestsellerInfoDTO.bestseller) &&
        Objects.equals(this.entryDeadline, getPromoBestsellerInfoDTO.entryDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestseller, entryDeadline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoBestsellerInfoDTO {\n");
    
    sb.append("    bestseller: ").append(toIndentedString(bestseller)).append("\n");
    sb.append("    entryDeadline: ").append(toIndentedString(entryDeadline)).append("\n");
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

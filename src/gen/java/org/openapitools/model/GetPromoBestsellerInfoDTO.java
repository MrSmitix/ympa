package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об акции «Бестселлеры Маркета».
 */
@ApiModel(description="Информация об акции «Бестселлеры Маркета».")

public class GetPromoBestsellerInfoDTO  {
  
 /**
  * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
  */
  @ApiModelProperty(required = true, value = "Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).")
  private Boolean bestseller;

 /**
  * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
  */
  @ApiModelProperty(value = "До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date entryDeadline;
 /**
  * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
  * @return bestseller
  */
  @JsonProperty("bestseller")
  @NotNull
  public Boolean getBestseller() {
    return bestseller;
  }

  /**
   * Sets the <code>bestseller</code> property.
   */
 public void setBestseller(Boolean bestseller) {
    this.bestseller = bestseller;
  }

  /**
   * Sets the <code>bestseller</code> property.
   */
  public GetPromoBestsellerInfoDTO bestseller(Boolean bestseller) {
    this.bestseller = bestseller;
    return this;
  }

 /**
  * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
  * @return entryDeadline
  */
  @JsonProperty("entryDeadline")
  public Date getEntryDeadline() {
    return entryDeadline;
  }

  /**
   * Sets the <code>entryDeadline</code> property.
   */
 public void setEntryDeadline(Date entryDeadline) {
    this.entryDeadline = entryDeadline;
  }

  /**
   * Sets the <code>entryDeadline</code> property.
   */
  public GetPromoBestsellerInfoDTO entryDeadline(Date entryDeadline) {
    this.entryDeadline = entryDeadline;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


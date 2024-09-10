package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об акции «Бестселлеры Маркета».
 */

@Schema(name = "GetPromoBestsellerInfoDTO", description = "Информация об акции «Бестселлеры Маркета».")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoBestsellerInfoDTO {

  private Boolean bestseller;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date entryDeadline;

  public GetPromoBestsellerInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromoBestsellerInfoDTO(Boolean bestseller) {
    this.bestseller = bestseller;
  }

  public GetPromoBestsellerInfoDTO bestseller(Boolean bestseller) {
    this.bestseller = bestseller;
    return this;
  }

  /**
   * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
   * @return bestseller
   */
  @NotNull 
  @Schema(name = "bestseller", description = "Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bestseller")
  public Boolean getBestseller() {
    return bestseller;
  }

  public void setBestseller(Boolean bestseller) {
    this.bestseller = bestseller;
  }

  public GetPromoBestsellerInfoDTO entryDeadline(Date entryDeadline) {
    this.entryDeadline = entryDeadline;
    return this;
  }

  /**
   * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
   * @return entryDeadline
   */
  @Valid 
  @Schema(name = "entryDeadline", description = "До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


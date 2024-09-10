package apimodels;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об акции «Бестселлеры Маркета».
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromoBestsellerInfoDTO   {
  @JsonProperty("bestseller")
  @NotNull

  private Boolean bestseller;

  @JsonProperty("entryDeadline")
  @Valid

  private OffsetDateTime entryDeadline;

  public GetPromoBestsellerInfoDTO bestseller(Boolean bestseller) {
    this.bestseller = bestseller;
    return this;
  }

   /**
   * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
   * @return bestseller
  **/
  public Boolean getBestseller() {
    return bestseller;
  }

  public void setBestseller(Boolean bestseller) {
    this.bestseller = bestseller;
  }

  public GetPromoBestsellerInfoDTO entryDeadline(OffsetDateTime entryDeadline) {
    this.entryDeadline = entryDeadline;
    return this;
  }

   /**
   * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
   * @return entryDeadline
  **/
  public OffsetDateTime getEntryDeadline() {
    return entryDeadline;
  }

  public void setEntryDeadline(OffsetDateTime entryDeadline) {
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
    return Objects.equals(bestseller, getPromoBestsellerInfoDTO.bestseller) &&
        Objects.equals(entryDeadline, getPromoBestsellerInfoDTO.entryDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestseller, entryDeadline);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


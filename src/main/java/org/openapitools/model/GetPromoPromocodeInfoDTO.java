package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */

@Schema(name = "GetPromoPromocodeInfoDTO", description = "Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoPromocodeInfoDTO {

  private String promocode;

  private Integer discount;

  public GetPromoPromocodeInfoDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromoPromocodeInfoDTO(String promocode, Integer discount) {
    this.promocode = promocode;
    this.discount = discount;
  }

  public GetPromoPromocodeInfoDTO promocode(String promocode) {
    this.promocode = promocode;
    return this;
  }

  /**
   * Промокод.
   * @return promocode
   */
  @NotNull 
  @Schema(name = "promocode", description = "Промокод.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("promocode")
  public String getPromocode() {
    return promocode;
  }

  public void setPromocode(String promocode) {
    this.promocode = promocode;
  }

  public GetPromoPromocodeInfoDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Процент скидки по промокоду.
   * @return discount
   */
  @NotNull 
  @Schema(name = "discount", description = "Процент скидки по промокоду.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO = (GetPromoPromocodeInfoDTO) o;
    return Objects.equals(this.promocode, getPromoPromocodeInfoDTO.promocode) &&
        Objects.equals(this.discount, getPromoPromocodeInfoDTO.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promocode, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoPromocodeInfoDTO {\n");
    sb.append("    promocode: ").append(toIndentedString(promocode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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


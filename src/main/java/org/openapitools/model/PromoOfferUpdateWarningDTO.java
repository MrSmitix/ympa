package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PromoOfferUpdateWarningCodeType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */

@Schema(name = "PromoOfferUpdateWarningDTO", description = "Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferUpdateWarningDTO {

  private PromoOfferUpdateWarningCodeType code;

  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.<List<Long>>undefined();

  public PromoOfferUpdateWarningDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PromoOfferUpdateWarningDTO(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

  public PromoOfferUpdateWarningDTO code(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @NotNull @Valid 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public PromoOfferUpdateWarningCodeType getCode() {
    return code;
  }

  public void setCode(PromoOfferUpdateWarningCodeType code) {
    this.code = code;
  }

  public PromoOfferUpdateWarningDTO campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public PromoOfferUpdateWarningDTO addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
   * @return campaignIds
   */
  
  @Schema(name = "campaignIds", description = "Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaignIds")
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO = (PromoOfferUpdateWarningDTO) o;
    return Objects.equals(this.code, promoOfferUpdateWarningDTO.code) &&
        equalsNullable(this.campaignIds, promoOfferUpdateWarningDTO.campaignIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, hashCodeNullable(campaignIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferUpdateWarningDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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


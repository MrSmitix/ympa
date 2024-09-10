package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RejectedPromoOfferUpdateDTO;
import org.openapitools.model.WarningPromoOfferUpdateDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

@Schema(name = "UpdatePromoOffersResultDTO", description = "Ошибки и предупреждения, которые появились при добавлении товаров в акцию.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOffersResultDTO {

  @Valid
  private JsonNullable<List<@Valid RejectedPromoOfferUpdateDTO>> rejectedOffers = JsonNullable.<List<@Valid RejectedPromoOfferUpdateDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid WarningPromoOfferUpdateDTO>> warningOffers = JsonNullable.<List<@Valid WarningPromoOfferUpdateDTO>>undefined();

  public UpdatePromoOffersResultDTO rejectedOffers(List<@Valid RejectedPromoOfferUpdateDTO> rejectedOffers) {
    this.rejectedOffers = JsonNullable.of(rejectedOffers);
    return this;
  }

  public UpdatePromoOffersResultDTO addRejectedOffersItem(RejectedPromoOfferUpdateDTO rejectedOffersItem) {
    if (this.rejectedOffers == null || !this.rejectedOffers.isPresent()) {
      this.rejectedOffers = JsonNullable.of(new ArrayList<>());
    }
    this.rejectedOffers.get().add(rejectedOffersItem);
    return this;
  }

  /**
   * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
   * @return rejectedOffers
   */
  @Valid 
  @Schema(name = "rejectedOffers", description = "Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectedOffers")
  public JsonNullable<List<@Valid RejectedPromoOfferUpdateDTO>> getRejectedOffers() {
    return rejectedOffers;
  }

  public void setRejectedOffers(JsonNullable<List<@Valid RejectedPromoOfferUpdateDTO>> rejectedOffers) {
    this.rejectedOffers = rejectedOffers;
  }

  public UpdatePromoOffersResultDTO warningOffers(List<@Valid WarningPromoOfferUpdateDTO> warningOffers) {
    this.warningOffers = JsonNullable.of(warningOffers);
    return this;
  }

  public UpdatePromoOffersResultDTO addWarningOffersItem(WarningPromoOfferUpdateDTO warningOffersItem) {
    if (this.warningOffers == null || !this.warningOffers.isPresent()) {
      this.warningOffers = JsonNullable.of(new ArrayList<>());
    }
    this.warningOffers.get().add(warningOffersItem);
    return this;
  }

  /**
   * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
   * @return warningOffers
   */
  @Valid 
  @Schema(name = "warningOffers", description = "Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningOffers")
  public JsonNullable<List<@Valid WarningPromoOfferUpdateDTO>> getWarningOffers() {
    return warningOffers;
  }

  public void setWarningOffers(JsonNullable<List<@Valid WarningPromoOfferUpdateDTO>> warningOffers) {
    this.warningOffers = warningOffers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOffersResultDTO updatePromoOffersResultDTO = (UpdatePromoOffersResultDTO) o;
    return equalsNullable(this.rejectedOffers, updatePromoOffersResultDTO.rejectedOffers) &&
        equalsNullable(this.warningOffers, updatePromoOffersResultDTO.warningOffers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(rejectedOffers), hashCodeNullable(warningOffers));
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
    sb.append("class UpdatePromoOffersResultDTO {\n");
    sb.append("    rejectedOffers: ").append(toIndentedString(rejectedOffers)).append("\n");
    sb.append("    warningOffers: ").append(toIndentedString(warningOffers)).append("\n");
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


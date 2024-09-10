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
import org.openapitools.model.ReturnDecisionReasonType;
import org.openapitools.model.ReturnDecisionSubreasonType;
import org.openapitools.model.ReturnDecisionType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Решения по возвратам.
 */

@Schema(name = "ReturnDecisionDTO", description = "Решения по возвратам.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDecisionDTO {

  private Long returnItemId;

  private Integer count;

  private String comment;

  private ReturnDecisionReasonType reasonType;

  private ReturnDecisionSubreasonType subreasonType;

  private ReturnDecisionType decisionType;

  private Long refundAmount;

  private Long partnerCompensation;

  @Valid
  private JsonNullable<List<String>> images = JsonNullable.<List<String>>undefined();

  public ReturnDecisionDTO returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

  /**
   * Идентификатор товара в возврате.
   * @return returnItemId
   */
  
  @Schema(name = "returnItemId", description = "Идентификатор товара в возврате.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnItemId")
  public Long getReturnItemId() {
    return returnItemId;
  }

  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

  public ReturnDecisionDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Количество единиц товара.
   * @return count
   */
  
  @Schema(name = "count", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ReturnDecisionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий.
   * @return comment
   */
  
  @Schema(name = "comment", description = "Комментарий.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ReturnDecisionDTO reasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
    return this;
  }

  /**
   * Get reasonType
   * @return reasonType
   */
  @Valid 
  @Schema(name = "reasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasonType")
  public ReturnDecisionReasonType getReasonType() {
    return reasonType;
  }

  public void setReasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
  }

  public ReturnDecisionDTO subreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
    return this;
  }

  /**
   * Get subreasonType
   * @return subreasonType
   */
  @Valid 
  @Schema(name = "subreasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subreasonType")
  public ReturnDecisionSubreasonType getSubreasonType() {
    return subreasonType;
  }

  public void setSubreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
  }

  public ReturnDecisionDTO decisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  /**
   * Get decisionType
   * @return decisionType
   */
  @Valid 
  @Schema(name = "decisionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionType")
  public ReturnDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public ReturnDecisionDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Сумма возврата.
   * @return refundAmount
   */
  
  @Schema(name = "refundAmount", description = "Сумма возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ReturnDecisionDTO partnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
    return this;
  }

  /**
   * Компенсация за обратную доставку.
   * @return partnerCompensation
   */
  
  @Schema(name = "partnerCompensation", description = "Компенсация за обратную доставку.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerCompensation")
  public Long getPartnerCompensation() {
    return partnerCompensation;
  }

  public void setPartnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
  }

  public ReturnDecisionDTO images(List<String> images) {
    this.images = JsonNullable.of(images);
    return this;
  }

  public ReturnDecisionDTO addImagesItem(String imagesItem) {
    if (this.images == null || !this.images.isPresent()) {
      this.images = JsonNullable.of(new ArrayList<>());
    }
    this.images.get().add(imagesItem);
    return this;
  }

  /**
   * Список хеш-кодов фотографий товара от покупателя.
   * @return images
   */
  
  @Schema(name = "images", description = "Список хеш-кодов фотографий товара от покупателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public JsonNullable<List<String>> getImages() {
    return images;
  }

  public void setImages(JsonNullable<List<String>> images) {
    this.images = images;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnDecisionDTO returnDecisionDTO = (ReturnDecisionDTO) o;
    return Objects.equals(this.returnItemId, returnDecisionDTO.returnItemId) &&
        Objects.equals(this.count, returnDecisionDTO.count) &&
        Objects.equals(this.comment, returnDecisionDTO.comment) &&
        Objects.equals(this.reasonType, returnDecisionDTO.reasonType) &&
        Objects.equals(this.subreasonType, returnDecisionDTO.subreasonType) &&
        Objects.equals(this.decisionType, returnDecisionDTO.decisionType) &&
        Objects.equals(this.refundAmount, returnDecisionDTO.refundAmount) &&
        Objects.equals(this.partnerCompensation, returnDecisionDTO.partnerCompensation) &&
        equalsNullable(this.images, returnDecisionDTO.images);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItemId, count, comment, reasonType, subreasonType, decisionType, refundAmount, partnerCompensation, hashCodeNullable(images));
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
    sb.append("class ReturnDecisionDTO {\n");
    sb.append("    returnItemId: ").append(toIndentedString(returnItemId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    reasonType: ").append(toIndentedString(reasonType)).append("\n");
    sb.append("    subreasonType: ").append(toIndentedString(subreasonType)).append("\n");
    sb.append("    decisionType: ").append(toIndentedString(decisionType)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    partnerCompensation: ").append(toIndentedString(partnerCompensation)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ReturnDecisionReasonType;
import com.prokarma.pkmst.model.ReturnDecisionSubreasonType;
import com.prokarma.pkmst.model.ReturnDecisionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Решения по возвратам.
 */
@ApiModel(description = "Решения по возвратам.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDecisionDTO   {
  @JsonProperty("returnItemId")
  private Long returnItemId;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("reasonType")
  private ReturnDecisionReasonType reasonType;

  @JsonProperty("subreasonType")
  private ReturnDecisionSubreasonType subreasonType;

  @JsonProperty("decisionType")
  private ReturnDecisionType decisionType;

  @JsonProperty("refundAmount")
  private Long refundAmount;

  @JsonProperty("partnerCompensation")
  private Long partnerCompensation;

  @JsonProperty("images")
  
  private List<String> images = null;

  public ReturnDecisionDTO returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

  /**
   * Идентификатор товара в возврате.
   * @return returnItemId
   */
  @ApiModelProperty(value = "Идентификатор товара в возврате.")
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
  @ApiModelProperty(value = "Количество единиц товара.")
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
  @ApiModelProperty(value = "Комментарий.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Сумма возврата.")
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
  @ApiModelProperty(value = "Компенсация за обратную доставку.")
  public Long getPartnerCompensation() {
    return partnerCompensation;
  }

  public void setPartnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
  }

  public ReturnDecisionDTO images(List<String> images) {
    this.images = images;
    return this;
  }

  public ReturnDecisionDTO addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Список хеш-кодов фотографий товара от покупателя.
   * @return images
   */
  @ApiModelProperty(value = "Список хеш-кодов фотографий товара от покупателя.")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
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
        Objects.equals(this.images, returnDecisionDTO.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItemId, count, comment, reasonType, subreasonType, decisionType, refundAmount, partnerCompensation, images);
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


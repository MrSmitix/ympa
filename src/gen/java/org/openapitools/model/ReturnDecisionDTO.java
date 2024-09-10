package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionReasonType;
import org.openapitools.model.ReturnDecisionSubreasonType;
import org.openapitools.model.ReturnDecisionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Решения по возвратам.
 **/
@ApiModel(description="Решения по возвратам.")

public class ReturnDecisionDTO  {
  
  @ApiModelProperty(value = "Идентификатор товара в возврате.")
 /**
   * Идентификатор товара в возврате.
  **/
  private Long returnItemId;

  @ApiModelProperty(value = "Количество единиц товара.")
 /**
   * Количество единиц товара.
  **/
  private Integer count;

  @ApiModelProperty(value = "Комментарий.")
 /**
   * Комментарий.
  **/
  private String comment;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnDecisionReasonType reasonType;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnDecisionSubreasonType subreasonType;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnDecisionType decisionType;

  @ApiModelProperty(value = "Сумма возврата.")
 /**
   * Сумма возврата.
  **/
  private Long refundAmount;

  @ApiModelProperty(value = "Компенсация за обратную доставку.")
 /**
   * Компенсация за обратную доставку.
  **/
  private Long partnerCompensation;

  @ApiModelProperty(value = "Список хеш-кодов фотографий товара от покупателя.")
 /**
   * Список хеш-кодов фотографий товара от покупателя.
  **/
  private List<String> images;
 /**
   * Идентификатор товара в возврате.
   * @return returnItemId
  **/
  @JsonProperty("returnItemId")
  public Long getReturnItemId() {
    return returnItemId;
  }

  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

  public ReturnDecisionDTO returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

 /**
   * Количество единиц товара.
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ReturnDecisionDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Комментарий.
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ReturnDecisionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

 /**
   * Get reasonType
   * @return reasonType
  **/
  @JsonProperty("reasonType")
  public ReturnDecisionReasonType getReasonType() {
    return reasonType;
  }

  public void setReasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
  }

  public ReturnDecisionDTO reasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
    return this;
  }

 /**
   * Get subreasonType
   * @return subreasonType
  **/
  @JsonProperty("subreasonType")
  public ReturnDecisionSubreasonType getSubreasonType() {
    return subreasonType;
  }

  public void setSubreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
  }

  public ReturnDecisionDTO subreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
    return this;
  }

 /**
   * Get decisionType
   * @return decisionType
  **/
  @JsonProperty("decisionType")
  public ReturnDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public ReturnDecisionDTO decisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

 /**
   * Сумма возврата.
   * @return refundAmount
  **/
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ReturnDecisionDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

 /**
   * Компенсация за обратную доставку.
   * @return partnerCompensation
  **/
  @JsonProperty("partnerCompensation")
  public Long getPartnerCompensation() {
    return partnerCompensation;
  }

  public void setPartnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
  }

  public ReturnDecisionDTO partnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
    return this;
  }

 /**
   * Список хеш-кодов фотографий товара от покупателя.
   * @return images
  **/
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public ReturnDecisionDTO images(List<String> images) {
    this.images = images;
    return this;
  }

  public ReturnDecisionDTO addImagesItem(String imagesItem) {
    this.images.add(imagesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


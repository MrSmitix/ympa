package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionReasonType;
import org.openapitools.model.ReturnDecisionSubreasonType;
import org.openapitools.model.ReturnDecisionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Решения по возвратам.
 **/
@ApiModel(description = "Решения по возвратам.")
@JsonTypeName("ReturnDecisionDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDecisionDTO   {
  private Long returnItemId;
  private Integer count;
  private String comment;
  private ReturnDecisionReasonType reasonType;
  private ReturnDecisionSubreasonType subreasonType;
  private ReturnDecisionType decisionType;
  private Long refundAmount;
  private Long partnerCompensation;
  private @Valid List<String> images;

  /**
   * Идентификатор товара в возврате.
   **/
  public ReturnDecisionDTO returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор товара в возврате.")
  @JsonProperty("returnItemId")
  public Long getReturnItemId() {
    return returnItemId;
  }

  @JsonProperty("returnItemId")
  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

  /**
   * Количество единиц товара.
   **/
  public ReturnDecisionDTO count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Комментарий.
   **/
  public ReturnDecisionDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  @JsonProperty("comment")
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   **/
  public ReturnDecisionDTO reasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reasonType")
  public ReturnDecisionReasonType getReasonType() {
    return reasonType;
  }

  @JsonProperty("reasonType")
  public void setReasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
  }

  /**
   **/
  public ReturnDecisionDTO subreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subreasonType")
  public ReturnDecisionSubreasonType getSubreasonType() {
    return subreasonType;
  }

  @JsonProperty("subreasonType")
  public void setSubreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
  }

  /**
   **/
  public ReturnDecisionDTO decisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("decisionType")
  public ReturnDecisionType getDecisionType() {
    return decisionType;
  }

  @JsonProperty("decisionType")
  public void setDecisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  /**
   * Сумма возврата.
   **/
  public ReturnDecisionDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  
  @ApiModelProperty(value = "Сумма возврата.")
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }

  @JsonProperty("refundAmount")
  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  /**
   * Компенсация за обратную доставку.
   **/
  public ReturnDecisionDTO partnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
    return this;
  }

  
  @ApiModelProperty(value = "Компенсация за обратную доставку.")
  @JsonProperty("partnerCompensation")
  public Long getPartnerCompensation() {
    return partnerCompensation;
  }

  @JsonProperty("partnerCompensation")
  public void setPartnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
  }

  /**
   * Список хеш-кодов фотографий товара от покупателя.
   **/
  public ReturnDecisionDTO images(List<String> images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(value = "Список хеш-кодов фотографий товара от покупателя.")
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(List<String> images) {
    this.images = images;
  }

  public ReturnDecisionDTO addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }

    this.images.add(imagesItem);
    return this;
  }

  public ReturnDecisionDTO removeImagesItem(String imagesItem) {
    if (imagesItem != null && this.images != null) {
      this.images.remove(imagesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


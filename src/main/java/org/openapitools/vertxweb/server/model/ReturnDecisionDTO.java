package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ReturnDecisionReasonType;
import org.openapitools.vertxweb.server.model.ReturnDecisionSubreasonType;
import org.openapitools.vertxweb.server.model.ReturnDecisionType;

/**
 * Решения по возвратам.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnDecisionDTO   {
  
  private Long returnItemId;
  private Integer count;
  private String comment;
  private ReturnDecisionReasonType reasonType;
  private ReturnDecisionSubreasonType subreasonType;
  private ReturnDecisionType decisionType;
  private Long refundAmount;
  private Long partnerCompensation;
  private List<String> images;

  public ReturnDecisionDTO () {

  }

  public ReturnDecisionDTO (Long returnItemId, Integer count, String comment, ReturnDecisionReasonType reasonType, ReturnDecisionSubreasonType subreasonType, ReturnDecisionType decisionType, Long refundAmount, Long partnerCompensation, List<String> images) {
    this.returnItemId = returnItemId;
    this.count = count;
    this.comment = comment;
    this.reasonType = reasonType;
    this.subreasonType = subreasonType;
    this.decisionType = decisionType;
    this.refundAmount = refundAmount;
    this.partnerCompensation = partnerCompensation;
    this.images = images;
  }

    
  @JsonProperty("returnItemId")
  public Long getReturnItemId() {
    return returnItemId;
  }
  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

    
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

    
  @JsonProperty("reasonType")
  public ReturnDecisionReasonType getReasonType() {
    return reasonType;
  }
  public void setReasonType(ReturnDecisionReasonType reasonType) {
    this.reasonType = reasonType;
  }

    
  @JsonProperty("subreasonType")
  public ReturnDecisionSubreasonType getSubreasonType() {
    return subreasonType;
  }
  public void setSubreasonType(ReturnDecisionSubreasonType subreasonType) {
    this.subreasonType = subreasonType;
  }

    
  @JsonProperty("decisionType")
  public ReturnDecisionType getDecisionType() {
    return decisionType;
  }
  public void setDecisionType(ReturnDecisionType decisionType) {
    this.decisionType = decisionType;
  }

    
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }
  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

    
  @JsonProperty("partnerCompensation")
  public Long getPartnerCompensation() {
    return partnerCompensation;
  }
  public void setPartnerCompensation(Long partnerCompensation) {
    this.partnerCompensation = partnerCompensation;
  }

    
  @JsonProperty("images")
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
    return Objects.equals(returnItemId, returnDecisionDTO.returnItemId) &&
        Objects.equals(count, returnDecisionDTO.count) &&
        Objects.equals(comment, returnDecisionDTO.comment) &&
        Objects.equals(reasonType, returnDecisionDTO.reasonType) &&
        Objects.equals(subreasonType, returnDecisionDTO.subreasonType) &&
        Objects.equals(decisionType, returnDecisionDTO.decisionType) &&
        Objects.equals(refundAmount, returnDecisionDTO.refundAmount) &&
        Objects.equals(partnerCompensation, returnDecisionDTO.partnerCompensation) &&
        Objects.equals(images, returnDecisionDTO.images);
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

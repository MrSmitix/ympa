/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ReturnDecisionReasonType;
import org.openapitools.model.ReturnDecisionSubreasonType;
import org.openapitools.model.ReturnDecisionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Решения по возвратам.
 */
@ApiModel(description = "Решения по возвратам.")
@JsonPropertyOrder({
  ReturnDecisionDTO.JSON_PROPERTY_RETURN_ITEM_ID,
  ReturnDecisionDTO.JSON_PROPERTY_COUNT,
  ReturnDecisionDTO.JSON_PROPERTY_COMMENT,
  ReturnDecisionDTO.JSON_PROPERTY_REASON_TYPE,
  ReturnDecisionDTO.JSON_PROPERTY_SUBREASON_TYPE,
  ReturnDecisionDTO.JSON_PROPERTY_DECISION_TYPE,
  ReturnDecisionDTO.JSON_PROPERTY_REFUND_AMOUNT,
  ReturnDecisionDTO.JSON_PROPERTY_PARTNER_COMPENSATION,
  ReturnDecisionDTO.JSON_PROPERTY_IMAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDecisionDTO   {
  public static final String JSON_PROPERTY_RETURN_ITEM_ID = "returnItemId";
  @JsonProperty(JSON_PROPERTY_RETURN_ITEM_ID)
  private Long returnItemId;

  public static final String JSON_PROPERTY_COUNT = "count";
  @JsonProperty(JSON_PROPERTY_COUNT)
  private Integer count;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @JsonProperty(JSON_PROPERTY_COMMENT)
  private String comment;

  public static final String JSON_PROPERTY_REASON_TYPE = "reasonType";
  @JsonProperty(JSON_PROPERTY_REASON_TYPE)
  private ReturnDecisionReasonType reasonType;

  public static final String JSON_PROPERTY_SUBREASON_TYPE = "subreasonType";
  @JsonProperty(JSON_PROPERTY_SUBREASON_TYPE)
  private ReturnDecisionSubreasonType subreasonType;

  public static final String JSON_PROPERTY_DECISION_TYPE = "decisionType";
  @JsonProperty(JSON_PROPERTY_DECISION_TYPE)
  private ReturnDecisionType decisionType;

  public static final String JSON_PROPERTY_REFUND_AMOUNT = "refundAmount";
  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT)
  private Long refundAmount;

  public static final String JSON_PROPERTY_PARTNER_COMPENSATION = "partnerCompensation";
  @JsonProperty(JSON_PROPERTY_PARTNER_COMPENSATION)
  private Long partnerCompensation;

  public static final String JSON_PROPERTY_IMAGES = "images";
  @JsonProperty(JSON_PROPERTY_IMAGES)
  private List<String> images;

  public ReturnDecisionDTO returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

  /**
   * Идентификатор товара в возврате.
   * @return returnItemId
   **/
  @JsonProperty(value = "returnItemId")
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
   **/
  @JsonProperty(value = "count")
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
   **/
  @JsonProperty(value = "comment")
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
   **/
  @JsonProperty(value = "reasonType")
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
   **/
  @JsonProperty(value = "subreasonType")
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
   **/
  @JsonProperty(value = "decisionType")
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
   **/
  @JsonProperty(value = "refundAmount")
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
   **/
  @JsonProperty(value = "partnerCompensation")
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
   **/
  @JsonProperty(value = "images")
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


package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ReturnDecisionReasonType;
import org.openapitools.server.model.ReturnDecisionSubreasonType;
import org.openapitools.server.model.ReturnDecisionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Решения по возвратам.
 */
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

    /**
     * Default constructor.
     */
    public ReturnDecisionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ReturnDecisionDTO.
     *
     * @param returnItemId Идентификатор товара в возврате.
     * @param count Количество единиц товара.
     * @param comment Комментарий.
     * @param reasonType reasonType
     * @param subreasonType subreasonType
     * @param decisionType decisionType
     * @param refundAmount Сумма возврата.
     * @param partnerCompensation Компенсация за обратную доставку.
     * @param images Список хеш-кодов фотографий товара от покупателя.
     */
    public ReturnDecisionDTO(
        Long returnItemId, 
        Integer count, 
        String comment, 
        ReturnDecisionReasonType reasonType, 
        ReturnDecisionSubreasonType subreasonType, 
        ReturnDecisionType decisionType, 
        Long refundAmount, 
        Long partnerCompensation, 
        List<String> images
    ) {
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



    /**
     * Идентификатор товара в возврате.
     * @return returnItemId
     */
    public Long getReturnItemId() {
        return returnItemId;
    }

    public void setReturnItemId(Long returnItemId) {
        this.returnItemId = returnItemId;
    }

    /**
     * Количество единиц товара.
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Комментарий.
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Get reasonType
     * @return reasonType
     */
    public ReturnDecisionReasonType getReasonType() {
        return reasonType;
    }

    public void setReasonType(ReturnDecisionReasonType reasonType) {
        this.reasonType = reasonType;
    }

    /**
     * Get subreasonType
     * @return subreasonType
     */
    public ReturnDecisionSubreasonType getSubreasonType() {
        return subreasonType;
    }

    public void setSubreasonType(ReturnDecisionSubreasonType subreasonType) {
        this.subreasonType = subreasonType;
    }

    /**
     * Get decisionType
     * @return decisionType
     */
    public ReturnDecisionType getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(ReturnDecisionType decisionType) {
        this.decisionType = decisionType;
    }

    /**
     * Сумма возврата.
     * @return refundAmount
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Компенсация за обратную доставку.
     * @return partnerCompensation
     */
    public Long getPartnerCompensation() {
        return partnerCompensation;
    }

    public void setPartnerCompensation(Long partnerCompensation) {
        this.partnerCompensation = partnerCompensation;
    }

    /**
     * Список хеш-кодов фотографий товара от покупателя.
     * @return images
     */
    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


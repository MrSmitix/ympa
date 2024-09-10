package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ReturnRequestDecisionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Решения по позиции в возврате.
 */
public class SetReturnDecisionRequest   {

    private Long returnItemId;
    private ReturnRequestDecisionType decisionType;
    private String comment;

    /**
     * Default constructor.
     */
    public SetReturnDecisionRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetReturnDecisionRequest.
     *
     * @param returnItemId Идентификатор товара в возврате.
     * @param decisionType decisionType
     * @param comment Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете. 
     */
    public SetReturnDecisionRequest(
        Long returnItemId, 
        ReturnRequestDecisionType decisionType, 
        String comment
    ) {
        this.returnItemId = returnItemId;
        this.decisionType = decisionType;
        this.comment = comment;
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
     * Get decisionType
     * @return decisionType
     */
    public ReturnRequestDecisionType getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(ReturnRequestDecisionType decisionType) {
        this.decisionType = decisionType;
    }

    /**
     * Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetReturnDecisionRequest {\n");
        
        sb.append("    returnItemId: ").append(toIndentedString(returnItemId)).append("\n");
        sb.append("    decisionType: ").append(toIndentedString(decisionType)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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


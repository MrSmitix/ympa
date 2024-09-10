package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ReturnRequestDecisionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Решения по позиции в возврате.
 **/
@ApiModel(description="Решения по позиции в возврате.")

public class SetReturnDecisionRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор товара в возврате.")
 /**
   * Идентификатор товара в возврате.
  **/
  private Long returnItemId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ReturnRequestDecisionType decisionType;

  @ApiModelProperty(value = "Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. ")
 /**
   * Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
  **/
  private String comment;
 /**
   * Идентификатор товара в возврате.
   * @return returnItemId
  **/
  @JsonProperty("returnItemId")
  @NotNull
  public Long getReturnItemId() {
    return returnItemId;
  }

  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

  public SetReturnDecisionRequest returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

 /**
   * Get decisionType
   * @return decisionType
  **/
  @JsonProperty("decisionType")
  @NotNull
  public ReturnRequestDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(ReturnRequestDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public SetReturnDecisionRequest decisionType(ReturnRequestDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

 /**
   * Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете. 
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public SetReturnDecisionRequest comment(String comment) {
    this.comment = comment;
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
    SetReturnDecisionRequest setReturnDecisionRequest = (SetReturnDecisionRequest) o;
    return Objects.equals(this.returnItemId, setReturnDecisionRequest.returnItemId) &&
        Objects.equals(this.decisionType, setReturnDecisionRequest.decisionType) &&
        Objects.equals(this.comment, setReturnDecisionRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItemId, decisionType, comment);
  }

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


package apimodels;

import apimodels.ReturnRequestDecisionType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Решения по позиции в возврате.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SetReturnDecisionRequest   {
  @JsonProperty("returnItemId")
  @NotNull

  private Long returnItemId;

  @JsonProperty("decisionType")
  @NotNull
@Valid

  private ReturnRequestDecisionType decisionType;

  @JsonProperty("comment")
  
  private String comment;

  public SetReturnDecisionRequest returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

   /**
   * Идентификатор товара в возврате.
   * @return returnItemId
  **/
  public Long getReturnItemId() {
    return returnItemId;
  }

  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

  public SetReturnDecisionRequest decisionType(ReturnRequestDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

   /**
   * Get decisionType
   * @return decisionType
  **/
  public ReturnRequestDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(ReturnRequestDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public SetReturnDecisionRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
   * @return comment
  **/
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
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
    return Objects.equals(returnItemId, setReturnDecisionRequest.returnItemId) &&
        Objects.equals(decisionType, setReturnDecisionRequest.decisionType) &&
        Objects.equals(comment, setReturnDecisionRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItemId, decisionType, comment);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


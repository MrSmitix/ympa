package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ReturnRequestDecisionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Решения по позиции в возврате.
 */

@Schema(name = "SetReturnDecisionRequest", description = "Решения по позиции в возврате.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetReturnDecisionRequest {

  private Long returnItemId;

  private ReturnRequestDecisionType decisionType;

  private String comment;

  public SetReturnDecisionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetReturnDecisionRequest(Long returnItemId, ReturnRequestDecisionType decisionType) {
    this.returnItemId = returnItemId;
    this.decisionType = decisionType;
  }

  public SetReturnDecisionRequest returnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
    return this;
  }

  /**
   * Идентификатор товара в возврате.
   * @return returnItemId
   */
  @NotNull 
  @Schema(name = "returnItemId", description = "Идентификатор товара в возврате.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnItemId")
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
   */
  @NotNull @Valid 
  @Schema(name = "decisionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decisionType")
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
   */
  
  @Schema(name = "comment", description = "Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


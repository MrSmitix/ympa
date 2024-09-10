package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ReturnRequestDecisionType;

/**
 * Решения по позиции в возврате.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetReturnDecisionRequest   {
  
  private Long returnItemId;
  private ReturnRequestDecisionType decisionType;
  private String comment;

  public SetReturnDecisionRequest () {

  }

  public SetReturnDecisionRequest (Long returnItemId, ReturnRequestDecisionType decisionType, String comment) {
    this.returnItemId = returnItemId;
    this.decisionType = decisionType;
    this.comment = comment;
  }

    
  @JsonProperty("returnItemId")
  public Long getReturnItemId() {
    return returnItemId;
  }
  public void setReturnItemId(Long returnItemId) {
    this.returnItemId = returnItemId;
  }

    
  @JsonProperty("decisionType")
  public ReturnRequestDecisionType getDecisionType() {
    return decisionType;
  }
  public void setDecisionType(ReturnRequestDecisionType decisionType) {
    this.decisionType = decisionType;
  }

    
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
    return Objects.equals(returnItemId, setReturnDecisionRequest.returnItemId) &&
        Objects.equals(decisionType, setReturnDecisionRequest.decisionType) &&
        Objects.equals(comment, setReturnDecisionRequest.comment);
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

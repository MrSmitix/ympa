package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyOrderEacRequest  {
  
 /**
  * Код для подтверждения ЭАПП.
  */
  @ApiModelProperty(value = "Код для подтверждения ЭАПП.")
  private String code;
 /**
  * Код для подтверждения ЭАПП.
  * @return code
  */
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public VerifyOrderEacRequest code(String code) {
    this.code = code;
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
    VerifyOrderEacRequest verifyOrderEacRequest = (VerifyOrderEacRequest) o;
    return Objects.equals(this.code, verifyOrderEacRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyOrderEacRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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


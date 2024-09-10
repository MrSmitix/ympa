package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.GetPromoPromocodeInfoDTO;
import org.openapitools.model.MechanicsType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о типе акции.
 */
@ApiModel(description="Информация о типе акции.")

public class GetPromoMechanicsInfoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private MechanicsType type;

  @ApiModelProperty(value = "")
  @Valid
  private GetPromoPromocodeInfoDTO promocodeInfo;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public MechanicsType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(MechanicsType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public GetPromoMechanicsInfoDTO type(MechanicsType type) {
    this.type = type;
    return this;
  }

 /**
  * Get promocodeInfo
  * @return promocodeInfo
  */
  @JsonProperty("promocodeInfo")
  public GetPromoPromocodeInfoDTO getPromocodeInfo() {
    return promocodeInfo;
  }

  /**
   * Sets the <code>promocodeInfo</code> property.
   */
 public void setPromocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
    this.promocodeInfo = promocodeInfo;
  }

  /**
   * Sets the <code>promocodeInfo</code> property.
   */
  public GetPromoMechanicsInfoDTO promocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
    this.promocodeInfo = promocodeInfo;
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
    GetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO = (GetPromoMechanicsInfoDTO) o;
    return Objects.equals(this.type, getPromoMechanicsInfoDTO.type) &&
        Objects.equals(this.promocodeInfo, getPromoMechanicsInfoDTO.promocodeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, promocodeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoMechanicsInfoDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    promocodeInfo: ").append(toIndentedString(promocodeInfo)).append("\n");
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


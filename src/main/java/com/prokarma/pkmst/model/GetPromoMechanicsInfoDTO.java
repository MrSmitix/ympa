package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.GetPromoPromocodeInfoDTO;
import com.prokarma.pkmst.model.MechanicsType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о типе акции.
 */
@ApiModel(description = "Информация о типе акции.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoMechanicsInfoDTO   {
  @JsonProperty("type")
  private MechanicsType type;

  @JsonProperty("promocodeInfo")
  private GetPromoPromocodeInfoDTO promocodeInfo;

  public GetPromoMechanicsInfoDTO type(MechanicsType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public MechanicsType getType() {
    return type;
  }

  public void setType(MechanicsType type) {
    this.type = type;
  }

  public GetPromoMechanicsInfoDTO promocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
    this.promocodeInfo = promocodeInfo;
    return this;
  }

  /**
   * Get promocodeInfo
   * @return promocodeInfo
   */
  @ApiModelProperty(value = "")
  public GetPromoPromocodeInfoDTO getPromocodeInfo() {
    return promocodeInfo;
  }

  public void setPromocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
    this.promocodeInfo = promocodeInfo;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


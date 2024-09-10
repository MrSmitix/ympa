package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.GetPromoPromocodeInfoDTO;
import org.openapitools.server.api.model.MechanicsType;

/**
 * Информация о типе акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoMechanicsInfoDTO   {
  
  private MechanicsType type;
  private GetPromoPromocodeInfoDTO promocodeInfo;

  public GetPromoMechanicsInfoDTO () {

  }

  public GetPromoMechanicsInfoDTO (MechanicsType type, GetPromoPromocodeInfoDTO promocodeInfo) {
    this.type = type;
    this.promocodeInfo = promocodeInfo;
  }

    
  @JsonProperty("type")
  public MechanicsType getType() {
    return type;
  }
  public void setType(MechanicsType type) {
    this.type = type;
  }

    
  @JsonProperty("promocodeInfo")
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
    return Objects.equals(type, getPromoMechanicsInfoDTO.type) &&
        Objects.equals(promocodeInfo, getPromoMechanicsInfoDTO.promocodeInfo);
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

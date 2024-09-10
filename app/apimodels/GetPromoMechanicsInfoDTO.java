package apimodels;

import apimodels.GetPromoPromocodeInfoDTO;
import apimodels.MechanicsType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о типе акции.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromoMechanicsInfoDTO   {
  @JsonProperty("type")
  @NotNull
@Valid

  private MechanicsType type;

  @JsonProperty("promocodeInfo")
  @Valid

  private GetPromoPromocodeInfoDTO promocodeInfo;

  public GetPromoMechanicsInfoDTO type(MechanicsType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


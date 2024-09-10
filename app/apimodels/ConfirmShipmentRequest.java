package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Запрос для подтверждения отгрузки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfirmShipmentRequest   {
  @JsonProperty("externalShipmentId")
  
  private String externalShipmentId;

  public ConfirmShipmentRequest externalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
    return this;
  }

   /**
   * Идентификатор отгрузки в системе поставщика.
   * @return externalShipmentId
  **/
  public String getExternalShipmentId() {
    return externalShipmentId;
  }

  public void setExternalShipmentId(String externalShipmentId) {
    this.externalShipmentId = externalShipmentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmShipmentRequest confirmShipmentRequest = (ConfirmShipmentRequest) o;
    return Objects.equals(externalShipmentId, confirmShipmentRequest.externalShipmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalShipmentId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmShipmentRequest {\n");
    
    sb.append("    externalShipmentId: ").append(toIndentedString(externalShipmentId)).append("\n");
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


package apimodels;

import apimodels.DeliveryServiceInfoDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о службах доставки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeliveryServicesDTO   {
  @JsonProperty("deliveryService")
  @NotNull
@Valid

  private List<@Valid DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

  public DeliveryServicesDTO deliveryService(List<@Valid DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

  public DeliveryServicesDTO addDeliveryServiceItem(DeliveryServiceInfoDTO deliveryServiceItem) {
    if (this.deliveryService == null) {
      this.deliveryService = new ArrayList<>();
    }
    this.deliveryService.add(deliveryServiceItem);
    return this;
  }

   /**
   * Информация о службе доставки.
   * @return deliveryService
  **/
  public List<@Valid DeliveryServiceInfoDTO> getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(List<@Valid DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryServicesDTO deliveryServicesDTO = (DeliveryServicesDTO) o;
    return Objects.equals(deliveryService, deliveryServicesDTO.deliveryService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryService);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryServicesDTO {\n");
    
    sb.append("    deliveryService: ").append(toIndentedString(deliveryService)).append("\n");
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


package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.DeliveryServiceInfoDTO;

/**
 * Информация о службах доставки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryServicesDTO   {
  
  private List<DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

  public DeliveryServicesDTO () {

  }

  public DeliveryServicesDTO (List<DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
  }

    
  @JsonProperty("deliveryService")
  public List<DeliveryServiceInfoDTO> getDeliveryService() {
    return deliveryService;
  }
  public void setDeliveryService(List<DeliveryServiceInfoDTO> deliveryService) {
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

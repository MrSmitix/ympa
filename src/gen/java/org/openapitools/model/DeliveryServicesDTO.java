package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeliveryServiceInfoDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о службах доставки.
 **/
@ApiModel(description="Информация о службах доставки.")

public class DeliveryServicesDTO  {
  
  @ApiModelProperty(required = true, value = "Информация о службе доставки.")
 /**
   * Информация о службе доставки.
  **/
  private List<DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();
 /**
   * Информация о службе доставки.
   * @return deliveryService
  **/
  @JsonProperty("deliveryService")
  public List<DeliveryServiceInfoDTO> getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(List<DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
  }

  public DeliveryServicesDTO deliveryService(List<DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

  public DeliveryServicesDTO addDeliveryServiceItem(DeliveryServiceInfoDTO deliveryServiceItem) {
    this.deliveryService.add(deliveryServiceItem);
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
    DeliveryServicesDTO deliveryServicesDTO = (DeliveryServicesDTO) o;
    return Objects.equals(this.deliveryService, deliveryServicesDTO.deliveryService);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


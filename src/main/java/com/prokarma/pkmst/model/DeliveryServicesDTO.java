package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DeliveryServiceInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о службах доставки.
 */
@ApiModel(description = "Информация о службах доставки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryServicesDTO   {
  @JsonProperty("deliveryService")
  
  private List<DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

  public DeliveryServicesDTO deliveryService(List<DeliveryServiceInfoDTO> deliveryService) {
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
   */
  @ApiModelProperty(required = true, value = "Информация о службе доставки.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


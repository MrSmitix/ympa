package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeliveryServiceInfoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о службах доставки.
 */

@Schema(name = "DeliveryServicesDTO", description = "Информация о службах доставки.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryServicesDTO {

  @Valid
  private List<@Valid DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

  public DeliveryServicesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeliveryServicesDTO(List<@Valid DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "deliveryService", description = "Информация о службе доставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deliveryService")
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


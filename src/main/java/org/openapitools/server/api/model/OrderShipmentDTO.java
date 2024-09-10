package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OrderParcelBoxDTO;
import org.openapitools.server.api.model.OrderTrackDTO;

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderShipmentDTO   {
  
  private Long id;
  private String shipmentDate;
  private String shipmentTime;
  private List<OrderTrackDTO> tracks;
  private List<OrderParcelBoxDTO> boxes;

  public OrderShipmentDTO () {

  }

  public OrderShipmentDTO (Long id, String shipmentDate, String shipmentTime, List<OrderTrackDTO> tracks, List<OrderParcelBoxDTO> boxes) {
    this.id = id;
    this.shipmentDate = shipmentDate;
    this.shipmentTime = shipmentTime;
    this.tracks = tracks;
    this.boxes = boxes;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }
  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

    
  @JsonProperty("shipmentTime")
  public String getShipmentTime() {
    return shipmentTime;
  }
  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

    
  @JsonProperty("tracks")
  public List<OrderTrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

    
  @JsonProperty("boxes")
  public List<OrderParcelBoxDTO> getBoxes() {
    return boxes;
  }
  public void setBoxes(List<OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderShipmentDTO orderShipmentDTO = (OrderShipmentDTO) o;
    return Objects.equals(id, orderShipmentDTO.id) &&
        Objects.equals(shipmentDate, orderShipmentDTO.shipmentDate) &&
        Objects.equals(shipmentTime, orderShipmentDTO.shipmentTime) &&
        Objects.equals(tracks, orderShipmentDTO.tracks) &&
        Objects.equals(boxes, orderShipmentDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shipmentDate, shipmentTime, tracks, boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderShipmentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
    sb.append("    shipmentTime: ").append(toIndentedString(shipmentTime)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
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

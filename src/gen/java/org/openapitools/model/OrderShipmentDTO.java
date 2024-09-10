package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;



/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 **/

@ApiModel(description = "Список посылок.  В параметре может указываться несколько посылок. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderShipmentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("shipmentDate")
  private String shipmentDate;

  @JsonProperty("shipmentTime")
  private String shipmentTime;

  @JsonProperty("tracks")
  private List<OrderTrackDTO> tracks = null;

  @JsonProperty("boxes")
  private List<OrderParcelBoxDTO> boxes = null;

  /**
   * Идентификатор посылки, присвоенный Маркетом.
   **/
  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор посылки, присвоенный Маркетом.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderShipmentDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }
  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  /**
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
   **/
  public OrderShipmentDTO shipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
    return this;
  }

  
  @ApiModelProperty(value = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
  @JsonProperty("shipmentTime")
  public String getShipmentTime() {
    return shipmentTime;
  }
  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
   **/
  public OrderShipmentDTO tracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  @JsonProperty("tracks")
  public List<OrderTrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  /**
   * Список грузовых мест.
   **/
  public OrderShipmentDTO boxes(List<OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(value = "Список грузовых мест.")
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


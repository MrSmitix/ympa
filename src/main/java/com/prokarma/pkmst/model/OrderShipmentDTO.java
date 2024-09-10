package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OrderParcelBoxDTO;
import com.prokarma.pkmst.model.OrderTrackDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
@ApiModel(description = "Список посылок.  В параметре может указываться несколько посылок. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор посылки, присвоенный Маркетом.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор посылки, присвоенный Маркетом.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderShipmentDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   * @return shipmentDate
   */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  public String getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public OrderShipmentDTO shipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
    return this;
  }

  /**
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
   * @return shipmentTime
   */
  @ApiModelProperty(value = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
  public String getShipmentTime() {
    return shipmentTime;
  }

  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  public OrderShipmentDTO tracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  public OrderShipmentDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

  /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
   * @return tracks
   */
  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  public List<OrderTrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderShipmentDTO boxes(List<OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public OrderShipmentDTO addBoxesItem(OrderParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

  /**
   * Список грузовых мест.
   * @return boxes
   */
  @ApiModelProperty(value = "Список грузовых мест.")
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
    return Objects.equals(this.id, orderShipmentDTO.id) &&
        Objects.equals(this.shipmentDate, orderShipmentDTO.shipmentDate) &&
        Objects.equals(this.shipmentTime, orderShipmentDTO.shipmentTime) &&
        Objects.equals(this.tracks, orderShipmentDTO.tracks) &&
        Objects.equals(this.boxes, orderShipmentDTO.boxes);
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


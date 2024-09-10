package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список посылок.  В параметре может указываться несколько посылок. 
 **/
@ApiModel(description="Список посылок.  В параметре может указываться несколько посылок. ")

public class OrderShipmentDTO  {
  
  @ApiModelProperty(value = "Идентификатор посылки, присвоенный Маркетом.")
 /**
   * Идентификатор посылки, присвоенный Маркетом.
  **/
  private Long id;

  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String shipmentDate;

  @ApiModelProperty(value = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
 /**
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  **/
  private String shipmentTime;

  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  @Valid
 /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  **/
  private List<@Valid OrderTrackDTO> tracks;

  @ApiModelProperty(value = "Список грузовых мест.")
  @Valid
 /**
   * Список грузовых мест.
  **/
  private List<@Valid OrderParcelBoxDTO> boxes;
 /**
   * Идентификатор посылки, присвоенный Маркетом.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return shipmentDate
  **/
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public OrderShipmentDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

 /**
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
   * @return shipmentTime
  **/
  @JsonProperty("shipmentTime")
  public String getShipmentTime() {
    return shipmentTime;
  }

  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  public OrderShipmentDTO shipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
    return this;
  }

 /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
   * @return tracks
  **/
  @JsonProperty("tracks")
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderShipmentDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  public OrderShipmentDTO addTracksItem(OrderTrackDTO tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

 /**
   * Список грузовых мест.
   * @return boxes
  **/
  @JsonProperty("boxes")
  public List<@Valid OrderParcelBoxDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public OrderShipmentDTO boxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public OrderShipmentDTO addBoxesItem(OrderParcelBoxDTO boxesItem) {
    this.boxes.add(boxesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


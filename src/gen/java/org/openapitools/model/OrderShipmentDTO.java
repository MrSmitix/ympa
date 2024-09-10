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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
@ApiModel(description="Список посылок.  В параметре может указываться несколько посылок. ")

public class OrderShipmentDTO  {
  
 /**
  * Идентификатор посылки, присвоенный Маркетом.
  */
  @ApiModelProperty(value = "Идентификатор посылки, присвоенный Маркетом.")
  private Long id;

 /**
  * Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  private String shipmentDate;

 /**
  * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  */
  @ApiModelProperty(value = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
  private String shipmentTime;

 /**
  * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  */
  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  @Valid
  private List<@Valid OrderTrackDTO> tracks;

 /**
  * Список грузовых мест.
  */
  @ApiModelProperty(value = "Список грузовых мест.")
  @Valid
  private List<@Valid OrderParcelBoxDTO> boxes;
 /**
  * Идентификатор посылки, присвоенный Маркетом.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return shipmentDate
  */
  @JsonProperty("shipmentDate")
  public String getShipmentDate() {
    return shipmentDate;
  }

  /**
   * Sets the <code>shipmentDate</code> property.
   */
 public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  /**
   * Sets the <code>shipmentDate</code> property.
   */
  public OrderShipmentDTO shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

 /**
  * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  * @return shipmentTime
  */
  @JsonProperty("shipmentTime")
  public String getShipmentTime() {
    return shipmentTime;
  }

  /**
   * Sets the <code>shipmentTime</code> property.
   */
 public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  /**
   * Sets the <code>shipmentTime</code> property.
   */
  public OrderShipmentDTO shipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
    return this;
  }

 /**
  * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  * @return tracks
  */
  @JsonProperty("tracks")
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  /**
   * Sets the <code>tracks</code> property.
   */
 public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  /**
   * Sets the <code>tracks</code> property.
   */
  public OrderShipmentDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  /**
   * Adds a new item to the <code>tracks</code> list.
   */
  public OrderShipmentDTO addTracksItem(OrderTrackDTO tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

 /**
  * Список грузовых мест.
  * @return boxes
  */
  @JsonProperty("boxes")
  public List<@Valid OrderParcelBoxDTO> getBoxes() {
    return boxes;
  }

  /**
   * Sets the <code>boxes</code> property.
   */
 public void setBoxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  /**
   * Sets the <code>boxes</code> property.
   */
  public OrderShipmentDTO boxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  /**
   * Adds a new item to the <code>boxes</code> list.
   */
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


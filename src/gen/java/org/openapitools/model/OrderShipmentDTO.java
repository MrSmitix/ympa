package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 **/
@ApiModel(description = "Список посылок.  В параметре может указываться несколько посылок. ")
@JsonTypeName("OrderShipmentDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderShipmentDTO   {
  private Long id;
  private String shipmentDate;
  private String shipmentTime;
  private @Valid List<@Valid OrderTrackDTO> tracks;
  private @Valid List<@Valid OrderParcelBoxDTO> boxes;

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

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
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

  @JsonProperty("shipmentDate")
  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  /**
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
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

  @JsonProperty("shipmentTime")
  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
   **/
  public OrderShipmentDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  @JsonProperty("tracks")
  @Valid public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  @JsonProperty("tracks")
  public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderShipmentDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }

    this.tracks.add(tracksItem);
    return this;
  }

  public OrderShipmentDTO removeTracksItem(OrderTrackDTO tracksItem) {
    if (tracksItem != null && this.tracks != null) {
      this.tracks.remove(tracksItem);
    }

    return this;
  }
  /**
   * Список грузовых мест.
   **/
  public OrderShipmentDTO boxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(value = "Список грузовых мест.")
  @JsonProperty("boxes")
  @Valid public List<@Valid OrderParcelBoxDTO> getBoxes() {
    return boxes;
  }

  @JsonProperty("boxes")
  public void setBoxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public OrderShipmentDTO addBoxesItem(OrderParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }

    this.boxes.add(boxesItem);
    return this;
  }

  public OrderShipmentDTO removeBoxesItem(OrderParcelBoxDTO boxesItem) {
    if (boxesItem != null && this.boxes != null) {
      this.boxes.remove(boxesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
@ApiModel(description = "Список посылок.  В параметре может указываться несколько посылок. ")
@JsonPropertyOrder({
  OrderShipmentDTO.JSON_PROPERTY_ID,
  OrderShipmentDTO.JSON_PROPERTY_SHIPMENT_DATE,
  OrderShipmentDTO.JSON_PROPERTY_SHIPMENT_TIME,
  OrderShipmentDTO.JSON_PROPERTY_TRACKS,
  OrderShipmentDTO.JSON_PROPERTY_BOXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderShipmentDTO   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Long id;

  public static final String JSON_PROPERTY_SHIPMENT_DATE = "shipmentDate";
  @JsonProperty(JSON_PROPERTY_SHIPMENT_DATE)
  private String shipmentDate;

  public static final String JSON_PROPERTY_SHIPMENT_TIME = "shipmentTime";
  @JsonProperty(JSON_PROPERTY_SHIPMENT_TIME)
  private String shipmentTime;

  public static final String JSON_PROPERTY_TRACKS = "tracks";
  @JsonProperty(JSON_PROPERTY_TRACKS)
  private List<@Valid OrderTrackDTO> tracks;

  public static final String JSON_PROPERTY_BOXES = "boxes";
  @JsonProperty(JSON_PROPERTY_BOXES)
  private List<@Valid OrderParcelBoxDTO> boxes;

  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор посылки, присвоенный Маркетом.
   * @return id
   **/
  @JsonProperty(value = "id")
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
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return shipmentDate
   **/
  @JsonProperty(value = "shipmentDate")
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
   * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
   * @return shipmentTime
   **/
  @JsonProperty(value = "shipmentTime")
  @ApiModelProperty(value = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
  
  public String getShipmentTime() {
    return shipmentTime;
  }

  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  public OrderShipmentDTO tracks(List<@Valid OrderTrackDTO> tracks) {
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
   **/
  @JsonProperty(value = "tracks")
  @ApiModelProperty(value = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
  @Valid 
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderShipmentDTO boxes(List<@Valid OrderParcelBoxDTO> boxes) {
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
   **/
  @JsonProperty(value = "boxes")
  @ApiModelProperty(value = "Список грузовых мест.")
  @Valid 
  public List<@Valid OrderParcelBoxDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<@Valid OrderParcelBoxDTO> boxes) {
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


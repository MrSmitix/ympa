package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */

@Schema(name = "OrderShipmentDTO", description = "Список посылок.  В параметре может указываться несколько посылок. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderShipmentDTO {

  private Long id;

  private String shipmentDate;

  private String shipmentTime;

  @Valid
  private JsonNullable<List<@Valid OrderTrackDTO>> tracks = JsonNullable.<List<@Valid OrderTrackDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OrderParcelBoxDTO>> boxes = JsonNullable.<List<@Valid OrderParcelBoxDTO>>undefined();

  public OrderShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор посылки, присвоенный Маркетом.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор посылки, присвоенный Маркетом.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "shipmentDate", example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentDate")
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
  
  @Schema(name = "shipmentTime", description = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentTime")
  public String getShipmentTime() {
    return shipmentTime;
  }

  public void setShipmentTime(String shipmentTime) {
    this.shipmentTime = shipmentTime;
  }

  public OrderShipmentDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = JsonNullable.of(tracks);
    return this;
  }

  public OrderShipmentDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null || !this.tracks.isPresent()) {
      this.tracks = JsonNullable.of(new ArrayList<>());
    }
    this.tracks.get().add(tracksItem);
    return this;
  }

  /**
   * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
   * @return tracks
   */
  @Valid 
  @Schema(name = "tracks", description = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracks")
  public JsonNullable<List<@Valid OrderTrackDTO>> getTracks() {
    return tracks;
  }

  public void setTracks(JsonNullable<List<@Valid OrderTrackDTO>> tracks) {
    this.tracks = tracks;
  }

  public OrderShipmentDTO boxes(List<@Valid OrderParcelBoxDTO> boxes) {
    this.boxes = JsonNullable.of(boxes);
    return this;
  }

  public OrderShipmentDTO addBoxesItem(OrderParcelBoxDTO boxesItem) {
    if (this.boxes == null || !this.boxes.isPresent()) {
      this.boxes = JsonNullable.of(new ArrayList<>());
    }
    this.boxes.get().add(boxesItem);
    return this;
  }

  /**
   * Список грузовых мест.
   * @return boxes
   */
  @Valid 
  @Schema(name = "boxes", description = "Список грузовых мест.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boxes")
  public JsonNullable<List<@Valid OrderParcelBoxDTO>> getBoxes() {
    return boxes;
  }

  public void setBoxes(JsonNullable<List<@Valid OrderParcelBoxDTO>> boxes) {
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
        equalsNullable(this.tracks, orderShipmentDTO.tracks) &&
        equalsNullable(this.boxes, orderShipmentDTO.boxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shipmentDate, shipmentTime, hashCodeNullable(tracks), hashCodeNullable(boxes));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


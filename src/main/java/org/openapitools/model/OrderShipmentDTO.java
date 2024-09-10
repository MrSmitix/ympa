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
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderParcelBoxDTO;
import org.openapitools.model.OrderTrackDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
@Schema(name = "OrderShipmentDTO", description = "Список посылок.  В параметре может указываться несколько посылок. ")
@JsonPropertyOrder({
  OrderShipmentDTO.JSON_PROPERTY_ID,
  OrderShipmentDTO.JSON_PROPERTY_SHIPMENT_DATE,
  OrderShipmentDTO.JSON_PROPERTY_SHIPMENT_TIME,
  OrderShipmentDTO.JSON_PROPERTY_TRACKS,
  OrderShipmentDTO.JSON_PROPERTY_BOXES
})
@JsonTypeName("OrderShipmentDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderShipmentDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_SHIPMENT_DATE = "shipmentDate";
    private String shipmentDate;

    public static final String JSON_PROPERTY_SHIPMENT_TIME = "shipmentTime";
    private String shipmentTime;

    public static final String JSON_PROPERTY_TRACKS = "tracks";
    private List<@Valid OrderTrackDTO> tracks = null;

    public static final String JSON_PROPERTY_BOXES = "boxes";
    private List<@Valid OrderParcelBoxDTO> boxes = null;

    public OrderShipmentDTO() {
    }

    public OrderShipmentDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор посылки, присвоенный Маркетом.
     * @return id
     */
    @Nullable
    @Schema(name = "id", description = "Идентификатор посылки, присвоенный Маркетом.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "shipmentDate", example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHIPMENT_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getShipmentDate() {
        return shipmentDate;
    }

    @JsonProperty(JSON_PROPERTY_SHIPMENT_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "shipmentTime", description = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHIPMENT_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getShipmentTime() {
        return shipmentTime;
    }

    @JsonProperty(JSON_PROPERTY_SHIPMENT_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "tracks", description = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TRACKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OrderTrackDTO> getTracks() {
        return tracks;
    }

    @JsonProperty(JSON_PROPERTY_TRACKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "boxes", description = "Список грузовых мест.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_BOXES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OrderParcelBoxDTO> getBoxes() {
        return boxes;
    }

    @JsonProperty(JSON_PROPERTY_BOXES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


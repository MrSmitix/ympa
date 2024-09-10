package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderParcelBoxDTO;
import org.openapitools.server.model.OrderTrackDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
public class OrderShipmentDTO   {

    private Long id;
    private String shipmentDate;
    private String shipmentTime;
    private List<@Valid OrderTrackDTO> tracks;
    private List<@Valid OrderParcelBoxDTO> boxes;

    /**
     * Default constructor.
     */
    public OrderShipmentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderShipmentDTO.
     *
     * @param id Идентификатор посылки, присвоенный Маркетом.
     * @param shipmentDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
     * @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
     * @param boxes Список грузовых мест.
     */
    public OrderShipmentDTO(
        Long id, 
        String shipmentDate, 
        String shipmentTime, 
        List<@Valid OrderTrackDTO> tracks, 
        List<@Valid OrderParcelBoxDTO> boxes
    ) {
        this.id = id;
        this.shipmentDate = shipmentDate;
        this.shipmentTime = shipmentTime;
        this.tracks = tracks;
        this.boxes = boxes;
    }



    /**
     * Идентификатор посылки, присвоенный Маркетом.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return shipmentDate
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    /**
     * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
     * @return shipmentTime
     */
    public String getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(String shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    /**
     * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
     * @return tracks
     */
    public List<@Valid OrderTrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<@Valid OrderTrackDTO> tracks) {
        this.tracks = tracks;
    }

    /**
     * Список грузовых мест.
     * @return boxes
     */
    public List<@Valid OrderParcelBoxDTO> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<@Valid OrderParcelBoxDTO> boxes) {
        this.boxes = boxes;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


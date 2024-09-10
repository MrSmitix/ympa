package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.ShipmentInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об отгрузках.
 */
public class SearchShipmentsResponseDTO   {

    private List<@Valid ShipmentInfoDTO> shipments = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public SearchShipmentsResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create SearchShipmentsResponseDTO.
     *
     * @param shipments Список с информацией об отгрузках.
     * @param paging paging
     */
    public SearchShipmentsResponseDTO(
        List<@Valid ShipmentInfoDTO> shipments, 
        ForwardScrollingPagerDTO paging
    ) {
        this.shipments = shipments;
        this.paging = paging;
    }



    /**
     * Список с информацией об отгрузках.
     * @return shipments
     */
    public List<@Valid ShipmentInfoDTO> getShipments() {
        return shipments;
    }

    public void setShipments(List<@Valid ShipmentInfoDTO> shipments) {
        this.shipments = shipments;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchShipmentsResponseDTO {\n");
        
        sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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


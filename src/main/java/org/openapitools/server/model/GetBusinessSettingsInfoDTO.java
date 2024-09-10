package org.openapitools.server.model;

import org.openapitools.server.model.BusinessDTO;
import org.openapitools.server.model.BusinessSettingsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о кабинете и его настройках.
 */
public class GetBusinessSettingsInfoDTO   {

    private BusinessDTO info;
    private BusinessSettingsDTO settings;

    /**
     * Default constructor.
     */
    public GetBusinessSettingsInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetBusinessSettingsInfoDTO.
     *
     * @param info info
     * @param settings settings
     */
    public GetBusinessSettingsInfoDTO(
        BusinessDTO info, 
        BusinessSettingsDTO settings
    ) {
        this.info = info;
        this.settings = settings;
    }



    /**
     * Get info
     * @return info
     */
    public BusinessDTO getInfo() {
        return info;
    }

    public void setInfo(BusinessDTO info) {
        this.info = info;
    }

    /**
     * Get settings
     * @return settings
     */
    public BusinessSettingsDTO getSettings() {
        return settings;
    }

    public void setSettings(BusinessSettingsDTO settings) {
        this.settings = settings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBusinessSettingsInfoDTO {\n");
        
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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


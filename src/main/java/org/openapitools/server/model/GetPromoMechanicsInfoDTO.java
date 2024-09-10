package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.GetPromoPromocodeInfoDTO;
import org.openapitools.server.model.MechanicsType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о типе акции.
 */
public class GetPromoMechanicsInfoDTO   {

    private MechanicsType type;
    private GetPromoPromocodeInfoDTO promocodeInfo;

    /**
     * Default constructor.
     */
    public GetPromoMechanicsInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoMechanicsInfoDTO.
     *
     * @param type type
     * @param promocodeInfo promocodeInfo
     */
    public GetPromoMechanicsInfoDTO(
        MechanicsType type, 
        GetPromoPromocodeInfoDTO promocodeInfo
    ) {
        this.type = type;
        this.promocodeInfo = promocodeInfo;
    }



    /**
     * Get type
     * @return type
     */
    public MechanicsType getType() {
        return type;
    }

    public void setType(MechanicsType type) {
        this.type = type;
    }

    /**
     * Get promocodeInfo
     * @return promocodeInfo
     */
    public GetPromoPromocodeInfoDTO getPromocodeInfo() {
        return promocodeInfo;
    }

    public void setPromocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
        this.promocodeInfo = promocodeInfo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoMechanicsInfoDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    promocodeInfo: ").append(toIndentedString(promocodeInfo)).append("\n");
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


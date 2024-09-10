package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.ReturnDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Возвраты.
 */
public class PagedReturnsDTO   {

    private ForwardScrollingPagerDTO paging;
    private List<@Valid ReturnDTO> returns = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PagedReturnsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PagedReturnsDTO.
     *
     * @param paging paging
     * @param returns Список возвратов.
     */
    public PagedReturnsDTO(
        ForwardScrollingPagerDTO paging, 
        List<@Valid ReturnDTO> returns
    ) {
        this.paging = paging;
        this.returns = returns;
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
     * Список возвратов.
     * @return returns
     */
    public List<@Valid ReturnDTO> getReturns() {
        return returns;
    }

    public void setReturns(List<@Valid ReturnDTO> returns) {
        this.returns = returns;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagedReturnsDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
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


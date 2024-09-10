package org.openapitools.server.model;

import org.openapitools.server.model.DocumentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о документах. 
 */
public class OrderBusinessDocumentsDTO   {

    private DocumentDTO upd;
    private DocumentDTO ukd;
    private DocumentDTO torgTwelve;
    private DocumentDTO sf;
    private DocumentDTO ksf;

    /**
     * Default constructor.
     */
    public OrderBusinessDocumentsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBusinessDocumentsDTO.
     *
     * @param upd upd
     * @param ukd ukd
     * @param torgTwelve torgTwelve
     * @param sf sf
     * @param ksf ksf
     */
    public OrderBusinessDocumentsDTO(
        DocumentDTO upd, 
        DocumentDTO ukd, 
        DocumentDTO torgTwelve, 
        DocumentDTO sf, 
        DocumentDTO ksf
    ) {
        this.upd = upd;
        this.ukd = ukd;
        this.torgTwelve = torgTwelve;
        this.sf = sf;
        this.ksf = ksf;
    }



    /**
     * Get upd
     * @return upd
     */
    public DocumentDTO getUpd() {
        return upd;
    }

    public void setUpd(DocumentDTO upd) {
        this.upd = upd;
    }

    /**
     * Get ukd
     * @return ukd
     */
    public DocumentDTO getUkd() {
        return ukd;
    }

    public void setUkd(DocumentDTO ukd) {
        this.ukd = ukd;
    }

    /**
     * Get torgTwelve
     * @return torgTwelve
     */
    public DocumentDTO getTorgTwelve() {
        return torgTwelve;
    }

    public void setTorgTwelve(DocumentDTO torgTwelve) {
        this.torgTwelve = torgTwelve;
    }

    /**
     * Get sf
     * @return sf
     */
    public DocumentDTO getSf() {
        return sf;
    }

    public void setSf(DocumentDTO sf) {
        this.sf = sf;
    }

    /**
     * Get ksf
     * @return ksf
     */
    public DocumentDTO getKsf() {
        return ksf;
    }

    public void setKsf(DocumentDTO ksf) {
        this.ksf = ksf;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBusinessDocumentsDTO {\n");
        
        sb.append("    upd: ").append(toIndentedString(upd)).append("\n");
        sb.append("    ukd: ").append(toIndentedString(ukd)).append("\n");
        sb.append("    torgTwelve: ").append(toIndentedString(torgTwelve)).append("\n");
        sb.append("    sf: ").append(toIndentedString(sf)).append("\n");
        sb.append("    ksf: ").append(toIndentedString(ksf)).append("\n");
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


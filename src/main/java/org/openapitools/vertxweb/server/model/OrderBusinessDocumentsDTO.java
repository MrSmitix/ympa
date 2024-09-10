package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.DocumentDTO;

/**
 * Информация о документах. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBusinessDocumentsDTO   {
  
  private DocumentDTO upd;
  private DocumentDTO ukd;
  private DocumentDTO torgTwelve;
  private DocumentDTO sf;
  private DocumentDTO ksf;

  public OrderBusinessDocumentsDTO () {

  }

  public OrderBusinessDocumentsDTO (DocumentDTO upd, DocumentDTO ukd, DocumentDTO torgTwelve, DocumentDTO sf, DocumentDTO ksf) {
    this.upd = upd;
    this.ukd = ukd;
    this.torgTwelve = torgTwelve;
    this.sf = sf;
    this.ksf = ksf;
  }

    
  @JsonProperty("upd")
  public DocumentDTO getUpd() {
    return upd;
  }
  public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }

    
  @JsonProperty("ukd")
  public DocumentDTO getUkd() {
    return ukd;
  }
  public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }

    
  @JsonProperty("torgTwelve")
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }
  public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }

    
  @JsonProperty("sf")
  public DocumentDTO getSf() {
    return sf;
  }
  public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }

    
  @JsonProperty("ksf")
  public DocumentDTO getKsf() {
    return ksf;
  }
  public void setKsf(DocumentDTO ksf) {
    this.ksf = ksf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBusinessDocumentsDTO orderBusinessDocumentsDTO = (OrderBusinessDocumentsDTO) o;
    return Objects.equals(upd, orderBusinessDocumentsDTO.upd) &&
        Objects.equals(ukd, orderBusinessDocumentsDTO.ukd) &&
        Objects.equals(torgTwelve, orderBusinessDocumentsDTO.torgTwelve) &&
        Objects.equals(sf, orderBusinessDocumentsDTO.sf) &&
        Objects.equals(ksf, orderBusinessDocumentsDTO.ksf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upd, ukd, torgTwelve, sf, ksf);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

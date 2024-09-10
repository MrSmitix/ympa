/**
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

package org.openapitools.server.model;

import org.openapitools.server.model.DocumentDTO;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Информация о документах. 
  */

public class OrderBusinessDocumentsDTO  {
  
  @JsonbProperty("upd")
  private DocumentDTO upd;

  @JsonbProperty("ukd")
  private DocumentDTO ukd;

  @JsonbProperty("torgTwelve")
  private DocumentDTO torgTwelve;

  @JsonbProperty("sf")
  private DocumentDTO sf;

  @JsonbProperty("ksf")
  private DocumentDTO ksf;

  /**
   * Get upd
   * @return upd
   **/
  public DocumentDTO getUpd() {
    return upd;
  }

  /**
   * Set upd
   */
  public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }

  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

  /**
   * Get ukd
   * @return ukd
   **/
  public DocumentDTO getUkd() {
    return ukd;
  }

  /**
   * Set ukd
   */
  public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }

  public OrderBusinessDocumentsDTO ukd(DocumentDTO ukd) {
    this.ukd = ukd;
    return this;
  }

  /**
   * Get torgTwelve
   * @return torgTwelve
   **/
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }

  /**
   * Set torgTwelve
   */
  public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }

  public OrderBusinessDocumentsDTO torgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
    return this;
  }

  /**
   * Get sf
   * @return sf
   **/
  public DocumentDTO getSf() {
    return sf;
  }

  /**
   * Set sf
   */
  public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }

  public OrderBusinessDocumentsDTO sf(DocumentDTO sf) {
    this.sf = sf;
    return this;
  }

  /**
   * Get ksf
   * @return ksf
   **/
  public DocumentDTO getKsf() {
    return ksf;
  }

  /**
   * Set ksf
   */
  public void setKsf(DocumentDTO ksf) {
    this.ksf = ksf;
  }

  public OrderBusinessDocumentsDTO ksf(DocumentDTO ksf) {
    this.ksf = ksf;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
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


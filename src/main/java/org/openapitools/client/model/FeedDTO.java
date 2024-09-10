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

package org.openapitools.client.model;

import java.util.Date;
import org.openapitools.client.model.FeedContentDTO;
import org.openapitools.client.model.FeedDownloadDTO;
import org.openapitools.client.model.FeedPlacementDTO;
import org.openapitools.client.model.FeedPublicationDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация о прайс-листе.
 **/
@ApiModel(description = "Информация о прайс-листе.")
public class FeedDTO {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("uploadDate")
  private Date uploadDate = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("content")
  private FeedContentDTO content = null;
  @SerializedName("download")
  private FeedDownloadDTO download = null;
  @SerializedName("placement")
  private FeedPlacementDTO placement = null;
  @SerializedName("publication")
  private FeedPublicationDTO publication = null;

  /**
   * Идентификатор прайс-листа.
   **/
  @ApiModelProperty(value = "Идентификатор прайс-листа.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   **/
  @ApiModelProperty(value = "Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
   **/
  @ApiModelProperty(value = "Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   **/
  @ApiModelProperty(value = "Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
   **/
  @ApiModelProperty(value = "Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  public Date getUploadDate() {
    return uploadDate;
  }
  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }

  /**
   * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
   **/
  @ApiModelProperty(value = "URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FeedContentDTO getContent() {
    return content;
  }
  public void setContent(FeedContentDTO content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FeedDownloadDTO getDownload() {
    return download;
  }
  public void setDownload(FeedDownloadDTO download) {
    this.download = download;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FeedPlacementDTO getPlacement() {
    return placement;
  }
  public void setPlacement(FeedPlacementDTO placement) {
    this.placement = placement;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FeedPublicationDTO getPublication() {
    return publication;
  }
  public void setPublication(FeedPublicationDTO publication) {
    this.publication = publication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDTO feedDTO = (FeedDTO) o;
    return (this.id == null ? feedDTO.id == null : this.id.equals(feedDTO.id)) &&
        (this.login == null ? feedDTO.login == null : this.login.equals(feedDTO.login)) &&
        (this.name == null ? feedDTO.name == null : this.name.equals(feedDTO.name)) &&
        (this.password == null ? feedDTO.password == null : this.password.equals(feedDTO.password)) &&
        (this.uploadDate == null ? feedDTO.uploadDate == null : this.uploadDate.equals(feedDTO.uploadDate)) &&
        (this.url == null ? feedDTO.url == null : this.url.equals(feedDTO.url)) &&
        (this.content == null ? feedDTO.content == null : this.content.equals(feedDTO.content)) &&
        (this.download == null ? feedDTO.download == null : this.download.equals(feedDTO.download)) &&
        (this.placement == null ? feedDTO.placement == null : this.placement.equals(feedDTO.placement)) &&
        (this.publication == null ? feedDTO.publication == null : this.publication.equals(feedDTO.publication));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.login == null ? 0: this.login.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.uploadDate == null ? 0: this.uploadDate.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.download == null ? 0: this.download.hashCode());
    result = 31 * result + (this.placement == null ? 0: this.placement.hashCode());
    result = 31 * result + (this.publication == null ? 0: this.publication.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  uploadDate: ").append(uploadDate).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  download: ").append(download).append("\n");
    sb.append("  placement: ").append(placement).append("\n");
    sb.append("  publication: ").append(publication).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

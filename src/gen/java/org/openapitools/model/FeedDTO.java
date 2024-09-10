package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.FeedContentDTO;
import org.openapitools.model.FeedDownloadDTO;
import org.openapitools.model.FeedPlacementDTO;
import org.openapitools.model.FeedPublicationDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о прайс-листе.
 */
@ApiModel(description="Информация о прайс-листе.")

public class FeedDTO  {
  
 /**
  * Идентификатор прайс-листа.
  */
  @ApiModelProperty(value = "Идентификатор прайс-листа.")
  private Long id;

 /**
  * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  */
  @ApiModelProperty(value = "Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  private String login;

 /**
  * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
  */
  @ApiModelProperty(value = "Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  private String name;

 /**
  * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  */
  @ApiModelProperty(value = "Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  private String password;

 /**
  * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
  */
  @ApiModelProperty(value = "Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date uploadDate;

 /**
  * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
  */
  @ApiModelProperty(value = "URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ")
  private String url;

  @ApiModelProperty(value = "")
  @Valid
  private FeedContentDTO content;

  @ApiModelProperty(value = "")
  @Valid
  private FeedDownloadDTO download;

  @ApiModelProperty(value = "")
  @Valid
  private FeedPlacementDTO placement;

  @ApiModelProperty(value = "")
  @Valid
  private FeedPublicationDTO publication;
 /**
  * Идентификатор прайс-листа.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FeedDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  * @return login
  */
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  /**
   * Sets the <code>login</code> property.
   */
 public void setLogin(String login) {
    this.login = login;
  }

  /**
   * Sets the <code>login</code> property.
   */
  public FeedDTO login(String login) {
    this.login = login;
    return this;
  }

 /**
  * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public FeedDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  * @return password
  */
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Sets the <code>password</code> property.
   */
 public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Sets the <code>password</code> property.
   */
  public FeedDTO password(String password) {
    this.password = password;
    return this;
  }

 /**
  * Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
  * @return uploadDate
  */
  @JsonProperty("uploadDate")
  public Date getUploadDate() {
    return uploadDate;
  }

  /**
   * Sets the <code>uploadDate</code> property.
   */
 public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }

  /**
   * Sets the <code>uploadDate</code> property.
   */
  public FeedDTO uploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

 /**
  * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public FeedDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Get content
  * @return content
  */
  @JsonProperty("content")
  public FeedContentDTO getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(FeedContentDTO content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public FeedDTO content(FeedContentDTO content) {
    this.content = content;
    return this;
  }

 /**
  * Get download
  * @return download
  */
  @JsonProperty("download")
  public FeedDownloadDTO getDownload() {
    return download;
  }

  /**
   * Sets the <code>download</code> property.
   */
 public void setDownload(FeedDownloadDTO download) {
    this.download = download;
  }

  /**
   * Sets the <code>download</code> property.
   */
  public FeedDTO download(FeedDownloadDTO download) {
    this.download = download;
    return this;
  }

 /**
  * Get placement
  * @return placement
  */
  @JsonProperty("placement")
  public FeedPlacementDTO getPlacement() {
    return placement;
  }

  /**
   * Sets the <code>placement</code> property.
   */
 public void setPlacement(FeedPlacementDTO placement) {
    this.placement = placement;
  }

  /**
   * Sets the <code>placement</code> property.
   */
  public FeedDTO placement(FeedPlacementDTO placement) {
    this.placement = placement;
    return this;
  }

 /**
  * Get publication
  * @return publication
  */
  @JsonProperty("publication")
  public FeedPublicationDTO getPublication() {
    return publication;
  }

  /**
   * Sets the <code>publication</code> property.
   */
 public void setPublication(FeedPublicationDTO publication) {
    this.publication = publication;
  }

  /**
   * Sets the <code>publication</code> property.
   */
  public FeedDTO publication(FeedPublicationDTO publication) {
    this.publication = publication;
    return this;
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
    return Objects.equals(this.id, feedDTO.id) &&
        Objects.equals(this.login, feedDTO.login) &&
        Objects.equals(this.name, feedDTO.name) &&
        Objects.equals(this.password, feedDTO.password) &&
        Objects.equals(this.uploadDate, feedDTO.uploadDate) &&
        Objects.equals(this.url, feedDTO.url) &&
        Objects.equals(this.content, feedDTO.content) &&
        Objects.equals(this.download, feedDTO.download) &&
        Objects.equals(this.placement, feedDTO.placement) &&
        Objects.equals(this.publication, feedDTO.publication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, name, password, uploadDate, url, content, download, placement, publication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
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


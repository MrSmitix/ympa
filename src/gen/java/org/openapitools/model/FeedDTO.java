package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.FeedContentDTO;
import org.openapitools.model.FeedDownloadDTO;
import org.openapitools.model.FeedPlacementDTO;
import org.openapitools.model.FeedPublicationDTO;



/**
 * Информация о прайс-листе.
 **/

@ApiModel(description = "Информация о прайс-листе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("login")
  private String login;

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("uploadDate")
  private Date uploadDate;

  @JsonProperty("url")
  private String url;

  @JsonProperty("content")
  private FeedContentDTO content;

  @JsonProperty("download")
  private FeedDownloadDTO download;

  @JsonProperty("placement")
  private FeedPlacementDTO placement;

  @JsonProperty("publication")
  private FeedPublicationDTO publication;

  /**
   * Идентификатор прайс-листа.
   **/
  public FeedDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор прайс-листа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   **/
  public FeedDTO login(String login) {
    this.login = login;
    return this;
  }

  
  @ApiModelProperty(value = "Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
   **/
  public FeedDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   **/
  public FeedDTO password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
   **/
  public FeedDTO uploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. ")
  @JsonProperty("uploadDate")
  public Date getUploadDate() {
    return uploadDate;
  }
  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }

  /**
   * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
   **/
  public FeedDTO url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public FeedDTO content(FeedContentDTO content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public FeedContentDTO getContent() {
    return content;
  }
  public void setContent(FeedContentDTO content) {
    this.content = content;
  }

  /**
   **/
  public FeedDTO download(FeedDownloadDTO download) {
    this.download = download;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("download")
  public FeedDownloadDTO getDownload() {
    return download;
  }
  public void setDownload(FeedDownloadDTO download) {
    this.download = download;
  }

  /**
   **/
  public FeedDTO placement(FeedPlacementDTO placement) {
    this.placement = placement;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement")
  public FeedPlacementDTO getPlacement() {
    return placement;
  }
  public void setPlacement(FeedPlacementDTO placement) {
    this.placement = placement;
  }

  /**
   **/
  public FeedDTO publication(FeedPublicationDTO publication) {
    this.publication = publication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("publication")
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
    return Objects.equals(id, feedDTO.id) &&
        Objects.equals(login, feedDTO.login) &&
        Objects.equals(name, feedDTO.name) &&
        Objects.equals(password, feedDTO.password) &&
        Objects.equals(uploadDate, feedDTO.uploadDate) &&
        Objects.equals(url, feedDTO.url) &&
        Objects.equals(content, feedDTO.content) &&
        Objects.equals(download, feedDTO.download) &&
        Objects.equals(placement, feedDTO.placement) &&
        Objects.equals(publication, feedDTO.publication);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


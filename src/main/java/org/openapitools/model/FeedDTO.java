package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.openapitools.model.FeedContentDTO;
import org.openapitools.model.FeedDownloadDTO;
import org.openapitools.model.FeedPlacementDTO;
import org.openapitools.model.FeedPublicationDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о прайс-листе.
 */

@Schema(name = "FeedDTO", description = "Информация о прайс-листе.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedDTO {

  private Long id;

  private String login;

  private String name;

  private String password;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date uploadDate;

  private String url;

  private FeedContentDTO content;

  private FeedDownloadDTO download;

  private FeedPlacementDTO placement;

  private FeedPublicationDTO publication;

  public FeedDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор прайс-листа.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор прайс-листа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedDTO login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   * @return login
   */
  
  @Schema(name = "login", description = "Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public FeedDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
   * @return name
   */
  
  @Schema(name = "name", description = "Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeedDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
   * @return password
   */
  
  @Schema(name = "password", description = "Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FeedDTO uploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
   * @return uploadDate
   */
  @Valid 
  @Schema(name = "uploadDate", description = "Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadDate")
  public Date getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }

  public FeedDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
   * @return url
   */
  
  @Schema(name = "url", description = "URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public FeedDTO content(FeedContentDTO content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public FeedContentDTO getContent() {
    return content;
  }

  public void setContent(FeedContentDTO content) {
    this.content = content;
  }

  public FeedDTO download(FeedDownloadDTO download) {
    this.download = download;
    return this;
  }

  /**
   * Get download
   * @return download
   */
  @Valid 
  @Schema(name = "download", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download")
  public FeedDownloadDTO getDownload() {
    return download;
  }

  public void setDownload(FeedDownloadDTO download) {
    this.download = download;
  }

  public FeedDTO placement(FeedPlacementDTO placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Get placement
   * @return placement
   */
  @Valid 
  @Schema(name = "placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement")
  public FeedPlacementDTO getPlacement() {
    return placement;
  }

  public void setPlacement(FeedPlacementDTO placement) {
    this.placement = placement;
  }

  public FeedDTO publication(FeedPublicationDTO publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
   */
  @Valid 
  @Schema(name = "publication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package apimodels;

import apimodels.FeedContentDTO;
import apimodels.FeedDownloadDTO;
import apimodels.FeedPlacementDTO;
import apimodels.FeedPublicationDTO;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о прайс-листе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid

  private OffsetDateTime uploadDate;

  @JsonProperty("url")
  
  private String url;

  @JsonProperty("content")
  @Valid

  private FeedContentDTO content;

  @JsonProperty("download")
  @Valid

  private FeedDownloadDTO download;

  @JsonProperty("placement")
  @Valid

  private FeedPlacementDTO placement;

  @JsonProperty("publication")
  @Valid

  private FeedPublicationDTO publication;

  public FeedDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор прайс-листа.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FeedDTO uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
   * @return uploadDate
  **/
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }

  public FeedDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
   * @return url
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.FeedContentDTO;
import org.openapitools.vertxweb.server.model.FeedDownloadDTO;
import org.openapitools.vertxweb.server.model.FeedPlacementDTO;
import org.openapitools.vertxweb.server.model.FeedPublicationDTO;

/**
 * Информация о прайс-листе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedDTO   {
  
  private Long id;
  private String login;
  private String name;
  private String password;
  private OffsetDateTime uploadDate;
  private String url;
  private FeedContentDTO content;
  private FeedDownloadDTO download;
  private FeedPlacementDTO placement;
  private FeedPublicationDTO publication;

  public FeedDTO () {

  }

  public FeedDTO (Long id, String login, String name, String password, OffsetDateTime uploadDate, String url, FeedContentDTO content, FeedDownloadDTO download, FeedPlacementDTO placement, FeedPublicationDTO publication) {
    this.id = id;
    this.login = login;
    this.name = name;
    this.password = password;
    this.uploadDate = uploadDate;
    this.url = url;
    this.content = content;
    this.download = download;
    this.placement = placement;
    this.publication = publication;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

    
  @JsonProperty("uploadDate")
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }
  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("content")
  public FeedContentDTO getContent() {
    return content;
  }
  public void setContent(FeedContentDTO content) {
    this.content = content;
  }

    
  @JsonProperty("download")
  public FeedDownloadDTO getDownload() {
    return download;
  }
  public void setDownload(FeedDownloadDTO download) {
    this.download = download;
  }

    
  @JsonProperty("placement")
  public FeedPlacementDTO getPlacement() {
    return placement;
  }
  public void setPlacement(FeedPlacementDTO placement) {
    this.placement = placement;
  }

    
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

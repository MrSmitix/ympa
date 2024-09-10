package org.openapitools.server.model;

import java.time.OffsetDateTime;
import org.openapitools.server.model.FeedContentDTO;
import org.openapitools.server.model.FeedDownloadDTO;
import org.openapitools.server.model.FeedPlacementDTO;
import org.openapitools.server.model.FeedPublicationDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о прайс-листе.
 */
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

    /**
     * Default constructor.
     */
    public FeedDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedDTO.
     *
     * @param id Идентификатор прайс-листа.
     * @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
     * @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
     * @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
     * @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
     * @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
     * @param content content
     * @param download download
     * @param placement placement
     * @param publication publication
     */
    public FeedDTO(
        Long id, 
        String login, 
        String name, 
        String password, 
        OffsetDateTime uploadDate, 
        String url, 
        FeedContentDTO content, 
        FeedDownloadDTO download, 
        FeedPlacementDTO placement, 
        FeedPublicationDTO publication
    ) {
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



    /**
     * Идентификатор прайс-листа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
     * @return login
     */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
     * @return uploadDate
     */
    public OffsetDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(OffsetDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get content
     * @return content
     */
    public FeedContentDTO getContent() {
        return content;
    }

    public void setContent(FeedContentDTO content) {
        this.content = content;
    }

    /**
     * Get download
     * @return download
     */
    public FeedDownloadDTO getDownload() {
        return download;
    }

    public void setDownload(FeedDownloadDTO download) {
        this.download = download;
    }

    /**
     * Get placement
     * @return placement
     */
    public FeedPlacementDTO getPlacement() {
        return placement;
    }

    public void setPlacement(FeedPlacementDTO placement) {
        this.placement = placement;
    }

    /**
     * Get publication
     * @return publication
     */
    public FeedPublicationDTO getPublication() {
        return publication;
    }

    public void setPublication(FeedPublicationDTO publication) {
        this.publication = publication;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


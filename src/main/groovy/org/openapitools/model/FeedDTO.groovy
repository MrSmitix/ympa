package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedContentDTO;
import org.openapitools.model.FeedDownloadDTO;
import org.openapitools.model.FeedPlacementDTO;
import org.openapitools.model.FeedPublicationDTO;

@Canonical
class FeedDTO {
    /* Идентификатор прайс-листа. */
    Long id
    /* Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
    String login
    /* Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  */
    String name
    /* Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  */
    String password
    /* Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  */
    Date uploadDate
    /* URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  */
    String url
    
    FeedContentDTO content
    
    FeedDownloadDTO download
    
    FeedPlacementDTO placement
    
    FeedPublicationDTO publication
}

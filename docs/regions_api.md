# regions_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchRegionChildren**](regions_api.md#SearchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
[**SearchRegionsById**](regions_api.md#SearchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
[**SearchRegionsByName**](regions_api.md#SearchRegionsByName) | **GET** /regions | Поиск регионов по их имени


<a name="SearchRegionChildren"></a>
# **SearchRegionChildren**
> GetRegionWithChildrenResponse SearchRegionChildren(regionId, page, pageSize)

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
<a name="SearchRegionsById"></a>
# **SearchRegionsById**
> GetRegionsResponse SearchRegionsById(regionId)

Информация о регионе

Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
<a name="SearchRegionsByName"></a>
# **SearchRegionsByName**
> GetRegionsResponse SearchRegionsByName(name, pageToken, limit)

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

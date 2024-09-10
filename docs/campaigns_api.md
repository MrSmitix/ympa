# campaigns_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCampaign**](campaigns_api.md#GetCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**GetCampaignLogins**](campaigns_api.md#GetCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**GetCampaignRegion**](campaigns_api.md#GetCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**GetCampaignSettings**](campaigns_api.md#GetCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**GetCampaigns**](campaigns_api.md#GetCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**GetCampaignsByLogin**](campaigns_api.md#GetCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину


<a name="GetCampaign"></a>
# **GetCampaign**
> GetCampaignResponse GetCampaign(campaignId)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GetCampaignLogins"></a>
# **GetCampaignLogins**
> GetCampaignLoginsResponse GetCampaignLogins(campaignId)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GetCampaignRegion"></a>
# **GetCampaignRegion**
> GetCampaignRegionResponse GetCampaignRegion(campaignId)

Регион магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
<a name="GetCampaignSettings"></a>
# **GetCampaignSettings**
> GetCampaignSettingsResponse GetCampaignSettings(campaignId)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GetCampaigns"></a>
# **GetCampaigns**
> GetCampaignsResponse GetCampaigns(page, pageSize)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GetCampaignsByLogin"></a>
# **GetCampaignsByLogin**
> GetCampaignsResponse GetCampaignsByLogin(login, page, pageSize)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetRegionWithChildrenResponse;
import org.openapitools.server.api.model.GetRegionsResponse;
import org.openapitools.server.api.MainApiException;

public final class RegionsApiException extends MainApiException {
    public RegionsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final RegionsApiException Regions_searchRegionChildren_200_Exception = new RegionsApiException(200, "Регионы, являющиеся дочерними к указанному в запросе.");
    public static final RegionsApiException Regions_searchRegionChildren_400_Exception = new RegionsApiException(400, "Запрос содержит неправильные данные.");
    public static final RegionsApiException Regions_searchRegionChildren_401_Exception = new RegionsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final RegionsApiException Regions_searchRegionChildren_403_Exception = new RegionsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final RegionsApiException Regions_searchRegionChildren_404_Exception = new RegionsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final RegionsApiException Regions_searchRegionChildren_420_Exception = new RegionsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final RegionsApiException Regions_searchRegionChildren_500_Exception = new RegionsApiException(500, "Внутренняя ошибка сервера.");
    public static final RegionsApiException Regions_searchRegionsById_200_Exception = new RegionsApiException(200, "Найденный регион.");
    public static final RegionsApiException Regions_searchRegionsById_401_Exception = new RegionsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final RegionsApiException Regions_searchRegionsById_403_Exception = new RegionsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final RegionsApiException Regions_searchRegionsById_404_Exception = new RegionsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final RegionsApiException Regions_searchRegionsById_420_Exception = new RegionsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final RegionsApiException Regions_searchRegionsById_500_Exception = new RegionsApiException(500, "Внутренняя ошибка сервера.");
    public static final RegionsApiException Regions_searchRegionsByName_200_Exception = new RegionsApiException(200, "Список найденных регионов.");
    public static final RegionsApiException Regions_searchRegionsByName_401_Exception = new RegionsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final RegionsApiException Regions_searchRegionsByName_403_Exception = new RegionsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final RegionsApiException Regions_searchRegionsByName_420_Exception = new RegionsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final RegionsApiException Regions_searchRegionsByName_500_Exception = new RegionsApiException(500, "Внутренняя ошибка сервера.");
    

}
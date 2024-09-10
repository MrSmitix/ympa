package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.GetModelsOffersResponse;
import org.openapitools.model.GetModelsRequest;
import org.openapitools.model.GetModelsResponse;
import org.openapitools.model.SearchModelsResponse;
import org.openapitools.model.SortOrderType;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class ModelsApiService {
    public abstract Response getModel(Long modelId
 ,Long regionId
 ,CurrencyType currency
 ) throws NotFoundException;
    public abstract Response getModelOffers(Long modelId
 ,Long regionId
 ,CurrencyType currency
 ,SortOrderType orderByPrice
 ,Integer count
 ,Integer page
 ) throws NotFoundException;
    public abstract Response getModels(Long regionId
 ,GetModelsRequest getModelsRequest
 ,CurrencyType currency
 ) throws NotFoundException;
    public abstract Response getModelsOffers(Long regionId
 ,GetModelsRequest getModelsRequest
 ,CurrencyType currency
 ,SortOrderType orderByPrice
 ) throws NotFoundException;
    public abstract Response searchModels(String query
 ,Long regionId
 ,CurrencyType currency
 ,Integer page
 ,Integer pageSize
 ) throws NotFoundException;
}

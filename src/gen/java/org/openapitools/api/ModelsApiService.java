package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public interface ModelsApiService {
      Response getModel(Long modelId,Long regionId,CurrencyType currency,SecurityContext securityContext)
      throws NotFoundException;
      Response getModelOffers(Long modelId,Long regionId,CurrencyType currency,SortOrderType orderByPrice,Integer count,Integer page,SecurityContext securityContext)
      throws NotFoundException;
      Response getModels(Long regionId,GetModelsRequest getModelsRequest,CurrencyType currency,SecurityContext securityContext)
      throws NotFoundException;
      Response getModelsOffers(Long regionId,GetModelsRequest getModelsRequest,CurrencyType currency,SortOrderType orderByPrice,SecurityContext securityContext)
      throws NotFoundException;
      Response searchModels(String query,Long regionId,CurrencyType currency,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
}

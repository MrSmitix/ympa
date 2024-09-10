package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class ModelsApiService {
    public abstract Response getModel( @Min(0L)Long modelId, @NotNull Long regionId,CurrencyType currency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getModelOffers( @Min(0L)Long modelId, @NotNull Long regionId,CurrencyType currency,SortOrderType orderByPrice,Integer count, @Max(10000)Integer page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getModels( @NotNull Long regionId,GetModelsRequest getModelsRequest,CurrencyType currency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getModelsOffers( @NotNull Long regionId,GetModelsRequest getModelsRequest,CurrencyType currency,SortOrderType orderByPrice,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchModels( @NotNull String query, @NotNull Long regionId,CurrencyType currency, @Max(10000)Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
}

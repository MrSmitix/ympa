package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-09-09T22:23:41.796583369Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelsApiServiceImpl implements ModelsApiService {
      @Override
      public Response getModel(Long modelId, Long regionId, CurrencyType currency, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getModelOffers(Long modelId, Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count, Integer page, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getModels(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getModelsOffers(Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response searchModels(String query, Long regionId, CurrencyType currency, Integer page, Integer pageSize, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}

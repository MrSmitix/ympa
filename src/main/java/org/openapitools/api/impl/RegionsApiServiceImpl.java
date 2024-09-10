package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetRegionWithChildrenResponse;
import org.openapitools.model.GetRegionsResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionsApiServiceImpl implements RegionsApi {
      public Response searchRegionChildren(Long regionId,Integer page,Integer pageSize,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchRegionsById(Long regionId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchRegionsByName(String name,String pageToken,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

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
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class CategoriesApiService {
    public abstract Response getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest
 ) throws NotFoundException;
    public abstract Response getCategoriesTree(GetCategoriesRequest getCategoriesRequest
 ) throws NotFoundException;
}

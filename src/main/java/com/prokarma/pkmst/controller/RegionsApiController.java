package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetRegionWithChildrenResponse;
import com.prokarma.pkmst.model.GetRegionsResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Controller
public class RegionsApiController implements RegionsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public RegionsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetRegionWithChildrenResponse> searchRegionChildren(@ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ",required=true ) @PathVariable("regionId") Long regionId,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionWithChildrenResponse>(objectMapper.readValue("", GetRegionWithChildrenResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetRegionWithChildrenResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetRegionsResponse> searchRegionsById(@ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ",required=true ) @PathVariable("regionId") Long regionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetRegionsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetRegionsResponse> searchRegionsByName(@ApiParam(value = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true)  @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetRegionsResponse>(objectMapper.readValue("", GetRegionsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetRegionsResponse>(HttpStatus.OK);
    }

}

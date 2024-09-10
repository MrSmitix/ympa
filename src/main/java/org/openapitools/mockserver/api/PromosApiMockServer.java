/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.mockserver.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.http.Fault;

public class PromosApiMockServer {

    public static MappingBuilder stubDeletePromoOffers200(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers400(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers401(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(401)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers403(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(403)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers404(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(404)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers420(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(420)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffers500(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(500)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubDeletePromoOffersFault(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static String deletePromoOffers200ResponseSample1() {
        return "{ \"result\" : { \"rejectedOffers\" : [ { \"reason\" : \"OFFER_DOES_NOT_EXIST\", \"offerId\" : \"offerId\" }, { \"reason\" : \"OFFER_DOES_NOT_EXIST\", \"offerId\" : \"offerId\" } ] }, \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers400ResponseSample2() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers401ResponseSample3() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers403ResponseSample4() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers404ResponseSample5() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers420ResponseSample6() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String deletePromoOffers500ResponseSample7() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }

    public static String deletePromoOffersRequestSample1() {
        return "{ \"deleteAllOffers\" : true, \"promoId\" : \"promoId\", \"offerIds\" : [ null, null, null, null, null ] }";
    }


    public static MappingBuilder stubGetPromoOffers200(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers400(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers401(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(401)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers403(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(403)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers404(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(404)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers420(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(420)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffers500(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(500)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static MappingBuilder stubGetPromoOffersFault(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, @javax.annotation.Nullable String pageToken, @javax.annotation.Nullable String limit, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));
        if(pageToken != null) {
            stub = stub.withQueryParam("pageToken", equalTo(pageToken));
        }
        if(limit != null) {
            stub = stub.withQueryParam("limit", equalTo(limit));
        }

        return stub;
    }

    public static String getPromoOffers200ResponseSample1() {
        return "{ \"result\" : { \"offers\" : [ { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 6, \"maxPromoPrice\" : 1, \"price\" : 0 }, \"promocodeParams\" : { \"maxPrice\" : 5 } }, \"status\" : \"AUTO\", \"autoParticipatingDetails\" : { \"campaignIds\" : [ 5, 5 ] } }, { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 6, \"maxPromoPrice\" : 1, \"price\" : 0 }, \"promocodeParams\" : { \"maxPrice\" : 5 } }, \"status\" : \"AUTO\", \"autoParticipatingDetails\" : { \"campaignIds\" : [ 5, 5 ] } } ], \"paging\" : { \"nextPageToken\" : \"nextPageToken\" } }, \"status\" : \"OK\" }";
    }
    public static String getPromoOffers400ResponseSample2() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromoOffers401ResponseSample3() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromoOffers403ResponseSample4() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromoOffers404ResponseSample5() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromoOffers420ResponseSample6() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromoOffers500ResponseSample7() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }

    public static String getPromoOffersRequestSample1() {
        return "{ \"statusType\" : \"MANUALLY_ADDED\", \"promoId\" : \"promoId\" }";
    }


    public static MappingBuilder stubGetPromos200(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos400(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos401(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(401)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos403(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(403)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos404(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(404)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos420(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(420)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromos500(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(500)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubGetPromosFault(@javax.annotation.Nonnull String businessId, @javax.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static String getPromos200ResponseSample1() {
        return "{ \"result\" : { \"promos\" : [ { \"period\" : { \"dateTimeFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"dateTimeTo\" : \"2000-01-23T04:56:07.000+00:00\" }, \"channels\" : [ \"{}\", \"{}\" ], \"mechanicsInfo\" : { \"promocodeInfo\" : { \"promocode\" : \"promocode\", \"discount\" : 1 }, \"type\" : \"DIRECT_DISCOUNT\" }, \"bestsellerInfo\" : { \"bestseller\" : true, \"entryDeadline\" : \"2000-01-23T04:56:07.000+00:00\" }, \"name\" : \"name\", \"participating\" : true, \"id\" : \"id\", \"constraints\" : { \"warehouseIds\" : [ 5, 5 ] }, \"assortmentInfo\" : { \"activeOffers\" : 0, \"processing\" : true, \"potentialOffers\" : 6 } }, { \"period\" : { \"dateTimeFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"dateTimeTo\" : \"2000-01-23T04:56:07.000+00:00\" }, \"channels\" : [ \"{}\", \"{}\" ], \"mechanicsInfo\" : { \"promocodeInfo\" : { \"promocode\" : \"promocode\", \"discount\" : 1 }, \"type\" : \"DIRECT_DISCOUNT\" }, \"bestsellerInfo\" : { \"bestseller\" : true, \"entryDeadline\" : \"2000-01-23T04:56:07.000+00:00\" }, \"name\" : \"name\", \"participating\" : true, \"id\" : \"id\", \"constraints\" : { \"warehouseIds\" : [ 5, 5 ] }, \"assortmentInfo\" : { \"activeOffers\" : 0, \"processing\" : true, \"potentialOffers\" : 6 } } ] }, \"status\" : \"OK\" }";
    }
    public static String getPromos400ResponseSample2() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromos401ResponseSample3() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromos403ResponseSample4() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromos404ResponseSample5() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromos420ResponseSample6() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String getPromos500ResponseSample7() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }

    public static String getPromosRequestSample1() {
        return "{ \"participation\" : \"PARTICIPATING_NOW\", \"mechanics\" : \"DIRECT_DISCOUNT\" }";
    }


    public static MappingBuilder stubUpdatePromoOffers200(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers400(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(400)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers401(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(401)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers403(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(403)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers404(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(404)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers420(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(420)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffers500(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(500)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static MappingBuilder stubUpdatePromoOffersFault(@javax.annotation.Nonnull String businessId, @javax.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withPathParam("businessId", equalTo(businessId));

        return stub;
    }

    public static String updatePromoOffers200ResponseSample1() {
        return "{ \"result\" : { \"rejectedOffers\" : [ { \"reason\" : \"OFFER_DOES_NOT_EXIST\", \"offerId\" : \"offerId\" }, { \"reason\" : \"OFFER_DOES_NOT_EXIST\", \"offerId\" : \"offerId\" } ], \"warningOffers\" : [ { \"warnings\" : [ { \"code\" : \"DEEP_DISCOUNT_OFFER\", \"campaignIds\" : [ 0, 0 ] }, { \"code\" : \"DEEP_DISCOUNT_OFFER\", \"campaignIds\" : [ 0, 0 ] } ], \"offerId\" : \"offerId\" }, { \"warnings\" : [ { \"code\" : \"DEEP_DISCOUNT_OFFER\", \"campaignIds\" : [ 0, 0 ] }, { \"code\" : \"DEEP_DISCOUNT_OFFER\", \"campaignIds\" : [ 0, 0 ] } ], \"offerId\" : \"offerId\" } ] }, \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers400ResponseSample2() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers401ResponseSample3() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers403ResponseSample4() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers404ResponseSample5() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers420ResponseSample6() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }
    public static String updatePromoOffers500ResponseSample7() {
        return "{ \"errors\" : [ { \"code\" : \"code\", \"message\" : \"message\" }, { \"code\" : \"code\", \"message\" : \"message\" } ], \"status\" : \"OK\" }";
    }

    public static String updatePromoOffersRequestSample1() {
        return "{ \"offers\" : [ { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 1, \"price\" : 1 } } }, { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 1, \"price\" : 1 } } }, { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 1, \"price\" : 1 } } }, { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 1, \"price\" : 1 } } }, { \"offerId\" : \"offerId\", \"params\" : { \"discountParams\" : { \"promoPrice\" : 1, \"price\" : 1 } } } ], \"promoId\" : \"promoId\" }";
    }


}

package org.openapitools.server.model;

import java.util.List;
import java.util.Map;

import io.helidon.common.GenericType;

public interface GenericTypes {
    GenericType<List<Integer>> TYPE__List_Integer = new GenericType<>() {};
    GenericType<List<Long>> TYPE__List_Long = new GenericType<>() {};
    GenericType<List<OfferAvailabilityStatusType>> TYPE__List_OfferAvailabilityStatusType = new GenericType<>() {};
    GenericType<List<OfferProcessingStatusType>> TYPE__List_OfferProcessingStatusType = new GenericType<>() {};
    GenericType<List<OrderStatusType>> TYPE__List_OrderStatusType = new GenericType<>() {};
    GenericType<List<OrderSubstatusType>> TYPE__List_OrderSubstatusType = new GenericType<>() {};
    GenericType<List<RefundStatusType>> TYPE__List_RefundStatusType = new GenericType<>() {};
    GenericType<List<String>> TYPE__List_String = new GenericType<>() {};
}


#include "ParcelBoxLabelDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ParcelBoxLabelDTO_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_ParcelBoxLabelDTO_supplierName_is_assigned_from_json()
{


    bourne::json input =
    {
        "supplierName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSupplierName().c_str());






}


void test_ParcelBoxLabelDTO_deliveryServiceName_is_assigned_from_json()
{


    bourne::json input =
    {
        "deliveryServiceName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeliveryServiceName().c_str());






}


void test_ParcelBoxLabelDTO_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}


void test_ParcelBoxLabelDTO_orderNum_is_assigned_from_json()
{


    bourne::json input =
    {
        "orderNum", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderNum().c_str());






}


void test_ParcelBoxLabelDTO_recipientName_is_assigned_from_json()
{


    bourne::json input =
    {
        "recipientName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRecipientName().c_str());






}


void test_ParcelBoxLabelDTO_boxId_is_assigned_from_json()
{






    bourne::json input =
    {
        "boxId", 1
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoxId());


}


void test_ParcelBoxLabelDTO_fulfilmentId_is_assigned_from_json()
{


    bourne::json input =
    {
        "fulfilmentId", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFulfilmentId().c_str());






}


void test_ParcelBoxLabelDTO_place_is_assigned_from_json()
{


    bourne::json input =
    {
        "place", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPlace().c_str());






}


void test_ParcelBoxLabelDTO_weight_is_assigned_from_json()
{


    bourne::json input =
    {
        "weight", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWeight().c_str());






}


void test_ParcelBoxLabelDTO_deliveryServiceId_is_assigned_from_json()
{


    bourne::json input =
    {
        "deliveryServiceId", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeliveryServiceId().c_str());






}


void test_ParcelBoxLabelDTO_deliveryAddress_is_assigned_from_json()
{


    bourne::json input =
    {
        "deliveryAddress", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeliveryAddress().c_str());






}


void test_ParcelBoxLabelDTO_shipmentDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "shipmentDate", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShipmentDate().c_str());






}



void test_ParcelBoxLabelDTO_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_ParcelBoxLabelDTO_supplierName_is_converted_to_json()
{

    bourne::json input =
    {
        "supplierName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["supplierName"] == output["supplierName"]);



}


void test_ParcelBoxLabelDTO_deliveryServiceName_is_converted_to_json()
{

    bourne::json input =
    {
        "deliveryServiceName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryServiceName"] == output["deliveryServiceName"]);



}


void test_ParcelBoxLabelDTO_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}


void test_ParcelBoxLabelDTO_orderNum_is_converted_to_json()
{

    bourne::json input =
    {
        "orderNum", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderNum"] == output["orderNum"]);



}


void test_ParcelBoxLabelDTO_recipientName_is_converted_to_json()
{

    bourne::json input =
    {
        "recipientName", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["recipientName"] == output["recipientName"]);



}


void test_ParcelBoxLabelDTO_boxId_is_converted_to_json()
{



    bourne::json input =
    {
        "boxId", 1
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boxId"] == output["boxId"]);

}


void test_ParcelBoxLabelDTO_fulfilmentId_is_converted_to_json()
{

    bourne::json input =
    {
        "fulfilmentId", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fulfilmentId"] == output["fulfilmentId"]);



}


void test_ParcelBoxLabelDTO_place_is_converted_to_json()
{

    bourne::json input =
    {
        "place", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["place"] == output["place"]);



}


void test_ParcelBoxLabelDTO_weight_is_converted_to_json()
{

    bourne::json input =
    {
        "weight", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["weight"] == output["weight"]);



}


void test_ParcelBoxLabelDTO_deliveryServiceId_is_converted_to_json()
{

    bourne::json input =
    {
        "deliveryServiceId", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryServiceId"] == output["deliveryServiceId"]);



}


void test_ParcelBoxLabelDTO_deliveryAddress_is_converted_to_json()
{

    bourne::json input =
    {
        "deliveryAddress", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryAddress"] == output["deliveryAddress"]);



}


void test_ParcelBoxLabelDTO_shipmentDate_is_converted_to_json()
{

    bourne::json input =
    {
        "shipmentDate", "hello"
    };

    ParcelBoxLabelDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shipmentDate"] == output["shipmentDate"]);



}




#include "OrderDeliveryDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderDeliveryDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_OrderDeliveryDTO_serviceName_is_assigned_from_json()
{


    bourne::json input =
    {
        "serviceName", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getServiceName().c_str());






}


void test_OrderDeliveryDTO_price_is_assigned_from_json()
{








}








void test_OrderDeliveryDTO_deliveryServiceId_is_assigned_from_json()
{






    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryServiceId());


}



void test_OrderDeliveryDTO_liftPrice_is_assigned_from_json()
{








}


void test_OrderDeliveryDTO_outletCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "outletCode", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutletCode().c_str());






}


void test_OrderDeliveryDTO_outletStorageLimitDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "outletStorageLimitDate", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutletStorageLimitDate().c_str());






}





void test_OrderDeliveryDTO_estimated_is_assigned_from_json()
{




    bourne::json input =
    {
        "estimated", true
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT(true == obj.isEstimated());




}



void test_OrderDeliveryDTO_eacCode_is_assigned_from_json()
{


    bourne::json input =
    {
        "eacCode", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEacCode().c_str());






}



void test_OrderDeliveryDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_OrderDeliveryDTO_serviceName_is_converted_to_json()
{

    bourne::json input =
    {
        "serviceName", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["serviceName"] == output["serviceName"]);



}


void test_OrderDeliveryDTO_price_is_converted_to_json()
{




}








void test_OrderDeliveryDTO_deliveryServiceId_is_converted_to_json()
{



    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryServiceId"] == output["deliveryServiceId"]);

}



void test_OrderDeliveryDTO_liftPrice_is_converted_to_json()
{




}


void test_OrderDeliveryDTO_outletCode_is_converted_to_json()
{

    bourne::json input =
    {
        "outletCode", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["outletCode"] == output["outletCode"]);



}


void test_OrderDeliveryDTO_outletStorageLimitDate_is_converted_to_json()
{

    bourne::json input =
    {
        "outletStorageLimitDate", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["outletStorageLimitDate"] == output["outletStorageLimitDate"]);



}





void test_OrderDeliveryDTO_estimated_is_converted_to_json()
{


    bourne::json input =
    {
        "estimated", true
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estimated"] == output["estimated"]);


}



void test_OrderDeliveryDTO_eacCode_is_converted_to_json()
{

    bourne::json input =
    {
        "eacCode", "hello"
    };

    OrderDeliveryDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["eacCode"] == output["eacCode"]);



}



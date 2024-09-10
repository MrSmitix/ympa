
#include "OutletDeliveryRuleDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OutletDeliveryRuleDTO_minDeliveryDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "minDeliveryDays", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinDeliveryDays());








}


void test_OutletDeliveryRuleDTO_maxDeliveryDays_is_assigned_from_json()
{
    bourne::json input =
    {
        "maxDeliveryDays", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxDeliveryDays());








}


void test_OutletDeliveryRuleDTO_deliveryServiceId_is_assigned_from_json()
{






    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDeliveryServiceId());


}


void test_OutletDeliveryRuleDTO_orderBefore_is_assigned_from_json()
{
    bourne::json input =
    {
        "orderBefore", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderBefore());








}


void test_OutletDeliveryRuleDTO_priceFreePickup_is_assigned_from_json()
{








}


void test_OutletDeliveryRuleDTO_unspecifiedDeliveryInterval_is_assigned_from_json()
{




    bourne::json input =
    {
        "unspecifiedDeliveryInterval", true
    };

    OutletDeliveryRuleDTO obj(input.dump());

    TEST_ASSERT(true == obj.isUnspecifiedDeliveryInterval());




}



void test_OutletDeliveryRuleDTO_minDeliveryDays_is_converted_to_json()
{
    bourne::json input =
    {
        "minDeliveryDays", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minDeliveryDays"] == output["minDeliveryDays"]);




}


void test_OutletDeliveryRuleDTO_maxDeliveryDays_is_converted_to_json()
{
    bourne::json input =
    {
        "maxDeliveryDays", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["maxDeliveryDays"] == output["maxDeliveryDays"]);




}


void test_OutletDeliveryRuleDTO_deliveryServiceId_is_converted_to_json()
{



    bourne::json input =
    {
        "deliveryServiceId", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["deliveryServiceId"] == output["deliveryServiceId"]);

}


void test_OutletDeliveryRuleDTO_orderBefore_is_converted_to_json()
{
    bourne::json input =
    {
        "orderBefore", 1
    };

    OutletDeliveryRuleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderBefore"] == output["orderBefore"]);




}


void test_OutletDeliveryRuleDTO_priceFreePickup_is_converted_to_json()
{




}


void test_OutletDeliveryRuleDTO_unspecifiedDeliveryInterval_is_converted_to_json()
{


    bourne::json input =
    {
        "unspecifiedDeliveryInterval", true
    };

    OutletDeliveryRuleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["unspecifiedDeliveryInterval"] == output["unspecifiedDeliveryInterval"]);


}



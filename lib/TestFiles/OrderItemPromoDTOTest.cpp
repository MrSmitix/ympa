
#include "OrderItemPromoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OrderItemPromoDTO_discount_is_assigned_from_json()
{








}


void test_OrderItemPromoDTO_subsidy_is_assigned_from_json()
{








}


void test_OrderItemPromoDTO_shopPromoId_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopPromoId", "hello"
    };

    OrderItemPromoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopPromoId().c_str());






}


void test_OrderItemPromoDTO_marketPromoId_is_assigned_from_json()
{


    bourne::json input =
    {
        "marketPromoId", "hello"
    };

    OrderItemPromoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMarketPromoId().c_str());






}




void test_OrderItemPromoDTO_discount_is_converted_to_json()
{




}


void test_OrderItemPromoDTO_subsidy_is_converted_to_json()
{




}


void test_OrderItemPromoDTO_shopPromoId_is_converted_to_json()
{

    bourne::json input =
    {
        "shopPromoId", "hello"
    };

    OrderItemPromoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopPromoId"] == output["shopPromoId"]);



}


void test_OrderItemPromoDTO_marketPromoId_is_converted_to_json()
{

    bourne::json input =
    {
        "marketPromoId", "hello"
    };

    OrderItemPromoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketPromoId"] == output["marketPromoId"]);



}



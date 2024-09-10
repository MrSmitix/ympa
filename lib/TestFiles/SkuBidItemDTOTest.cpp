
#include "SkuBidItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SkuBidItemDTO_sku_is_assigned_from_json()
{


    bourne::json input =
    {
        "sku", "hello"
    };

    SkuBidItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSku().c_str());






}


void test_SkuBidItemDTO_bid_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    SkuBidItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBid());








}



void test_SkuBidItemDTO_sku_is_converted_to_json()
{

    bourne::json input =
    {
        "sku", "hello"
    };

    SkuBidItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sku"] == output["sku"]);



}


void test_SkuBidItemDTO_bid_is_converted_to_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    SkuBidItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid"] == output["bid"]);




}



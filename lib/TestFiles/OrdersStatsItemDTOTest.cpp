
#include "OrdersStatsItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrdersStatsItemDTO_offerName_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerName", "hello"
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferName().c_str());






}


void test_OrdersStatsItemDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_OrdersStatsItemDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_OrdersStatsItemDTO_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}






void test_OrdersStatsItemDTO_initialCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "initialCount", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInitialCount());








}


void test_OrdersStatsItemDTO_bidFee_is_assigned_from_json()
{
    bourne::json input =
    {
        "bidFee", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBidFee());








}


void test_OrdersStatsItemDTO_cofinanceThreshold_is_assigned_from_json()
{








}


void test_OrdersStatsItemDTO_cofinanceValue_is_assigned_from_json()
{








}



void test_OrdersStatsItemDTO_offerName_is_converted_to_json()
{

    bourne::json input =
    {
        "offerName", "hello"
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerName"] == output["offerName"]);



}


void test_OrdersStatsItemDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_OrdersStatsItemDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_OrdersStatsItemDTO_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}






void test_OrdersStatsItemDTO_initialCount_is_converted_to_json()
{
    bourne::json input =
    {
        "initialCount", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["initialCount"] == output["initialCount"]);




}


void test_OrdersStatsItemDTO_bidFee_is_converted_to_json()
{
    bourne::json input =
    {
        "bidFee", 1
    };

    OrdersStatsItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bidFee"] == output["bidFee"]);




}


void test_OrdersStatsItemDTO_cofinanceThreshold_is_converted_to_json()
{




}


void test_OrdersStatsItemDTO_cofinanceValue_is_converted_to_json()
{




}



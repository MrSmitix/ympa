
#include "GoodsStatsGoodsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsStatsGoodsDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_GoodsStatsGoodsDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    GoodsStatsGoodsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_GoodsStatsGoodsDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_GoodsStatsGoodsDTO_price_is_assigned_from_json()
{








}


void test_GoodsStatsGoodsDTO_categoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "categoryId", 1
    };

    GoodsStatsGoodsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCategoryId());


}


void test_GoodsStatsGoodsDTO_categoryName_is_assigned_from_json()
{


    bourne::json input =
    {
        "categoryName", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategoryName().c_str());






}







void test_GoodsStatsGoodsDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_GoodsStatsGoodsDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    GoodsStatsGoodsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_GoodsStatsGoodsDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_GoodsStatsGoodsDTO_price_is_converted_to_json()
{




}


void test_GoodsStatsGoodsDTO_categoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "categoryId", 1
    };

    GoodsStatsGoodsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["categoryId"] == output["categoryId"]);

}


void test_GoodsStatsGoodsDTO_categoryName_is_converted_to_json()
{

    bourne::json input =
    {
        "categoryName", "hello"
    };

    GoodsStatsGoodsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["categoryName"] == output["categoryName"]);



}







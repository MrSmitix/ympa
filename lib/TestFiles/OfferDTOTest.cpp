
#include "OfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OfferDTO_price_is_assigned_from_json()
{








}


void test_OfferDTO_feedId_is_assigned_from_json()
{






    bourne::json input =
    {
        "feedId", 1
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFeedId());


}


void test_OfferDTO_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OfferDTO_shopCategoryId_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopCategoryId", "hello"
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopCategoryId().c_str());






}


void test_OfferDTO_marketCategoryId_is_assigned_from_json()
{
    bourne::json input =
    {
        "marketCategoryId", 1
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketCategoryId());








}


void test_OfferDTO_preDiscountPrice_is_assigned_from_json()
{








}


void test_OfferDTO_discount_is_assigned_from_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDiscount());








}


void test_OfferDTO_cutPrice_is_assigned_from_json()
{




    bourne::json input =
    {
        "cutPrice", true
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isCutPrice());




}


void test_OfferDTO_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_OfferDTO_modelId_is_assigned_from_json()
{






    bourne::json input =
    {
        "modelId", 1
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getModelId());


}


void test_OfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_OfferDTO_bid_is_assigned_from_json()
{








}


void test_OfferDTO_cbid_is_assigned_from_json()
{








}


void test_OfferDTO_fee_is_assigned_from_json()
{








}


void test_OfferDTO_blocked_is_assigned_from_json()
{




    bourne::json input =
    {
        "blocked", true
    };

    OfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isBlocked());




}



void test_OfferDTO_price_is_converted_to_json()
{




}


void test_OfferDTO_feedId_is_converted_to_json()
{



    bourne::json input =
    {
        "feedId", 1
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feedId"] == output["feedId"]);

}


void test_OfferDTO_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OfferDTO_shopCategoryId_is_converted_to_json()
{

    bourne::json input =
    {
        "shopCategoryId", "hello"
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopCategoryId"] == output["shopCategoryId"]);



}


void test_OfferDTO_marketCategoryId_is_converted_to_json()
{
    bourne::json input =
    {
        "marketCategoryId", 1
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketCategoryId"] == output["marketCategoryId"]);




}


void test_OfferDTO_preDiscountPrice_is_converted_to_json()
{




}


void test_OfferDTO_discount_is_converted_to_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discount"] == output["discount"]);




}


void test_OfferDTO_cutPrice_is_converted_to_json()
{


    bourne::json input =
    {
        "cutPrice", true
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cutPrice"] == output["cutPrice"]);


}


void test_OfferDTO_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_OfferDTO_modelId_is_converted_to_json()
{



    bourne::json input =
    {
        "modelId", 1
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["modelId"] == output["modelId"]);

}


void test_OfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_OfferDTO_bid_is_converted_to_json()
{




}


void test_OfferDTO_cbid_is_converted_to_json()
{




}


void test_OfferDTO_fee_is_converted_to_json()
{




}


void test_OfferDTO_blocked_is_converted_to_json()
{


    bourne::json input =
    {
        "blocked", true
    };

    OfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["blocked"] == output["blocked"]);


}



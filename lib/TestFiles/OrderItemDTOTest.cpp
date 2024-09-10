
#include "OrderItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderItemDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OrderItemDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}


void test_OrderItemDTO_offerName_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerName", "hello"
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferName().c_str());






}


void test_OrderItemDTO_price_is_assigned_from_json()
{








}


void test_OrderItemDTO_buyerPrice_is_assigned_from_json()
{








}


void test_OrderItemDTO_buyerPriceBeforeDiscount_is_assigned_from_json()
{








}


void test_OrderItemDTO_priceBeforeDiscount_is_assigned_from_json()
{








}


void test_OrderItemDTO_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}



void test_OrderItemDTO_shopSku_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopSku", "hello"
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopSku().c_str());






}


void test_OrderItemDTO_subsidy_is_assigned_from_json()
{








}


void test_OrderItemDTO_partnerWarehouseId_is_assigned_from_json()
{


    bourne::json input =
    {
        "partnerWarehouseId", "hello"
    };

    OrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerWarehouseId().c_str());






}








void test_OrderItemDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OrderItemDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}


void test_OrderItemDTO_offerName_is_converted_to_json()
{

    bourne::json input =
    {
        "offerName", "hello"
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerName"] == output["offerName"]);



}


void test_OrderItemDTO_price_is_converted_to_json()
{




}


void test_OrderItemDTO_buyerPrice_is_converted_to_json()
{




}


void test_OrderItemDTO_buyerPriceBeforeDiscount_is_converted_to_json()
{




}


void test_OrderItemDTO_priceBeforeDiscount_is_converted_to_json()
{




}


void test_OrderItemDTO_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}



void test_OrderItemDTO_shopSku_is_converted_to_json()
{

    bourne::json input =
    {
        "shopSku", "hello"
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopSku"] == output["shopSku"]);



}


void test_OrderItemDTO_subsidy_is_converted_to_json()
{




}


void test_OrderItemDTO_partnerWarehouseId_is_converted_to_json()
{

    bourne::json input =
    {
        "partnerWarehouseId", "hello"
    };

    OrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partnerWarehouseId"] == output["partnerWarehouseId"]);



}








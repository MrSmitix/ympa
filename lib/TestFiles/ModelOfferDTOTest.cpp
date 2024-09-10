
#include "ModelOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ModelOfferDTO_discount_is_assigned_from_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDiscount());








}


void test_ModelOfferDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ModelOfferDTO_pos_is_assigned_from_json()
{
    bourne::json input =
    {
        "pos", 1
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPos());








}


void test_ModelOfferDTO_preDiscountPrice_is_assigned_from_json()
{








}


void test_ModelOfferDTO_price_is_assigned_from_json()
{








}


void test_ModelOfferDTO_regionId_is_assigned_from_json()
{






    bourne::json input =
    {
        "regionId", 1
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRegionId());


}


void test_ModelOfferDTO_shippingCost_is_assigned_from_json()
{








}


void test_ModelOfferDTO_shopName_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopName", "hello"
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopName().c_str());






}


void test_ModelOfferDTO_shopRating_is_assigned_from_json()
{
    bourne::json input =
    {
        "shopRating", 1
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getShopRating());








}


void test_ModelOfferDTO_inStock_is_assigned_from_json()
{
    bourne::json input =
    {
        "inStock", 1
    };

    ModelOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInStock());








}



void test_ModelOfferDTO_discount_is_converted_to_json()
{
    bourne::json input =
    {
        "discount", 1
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discount"] == output["discount"]);




}


void test_ModelOfferDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ModelOfferDTO_pos_is_converted_to_json()
{
    bourne::json input =
    {
        "pos", 1
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pos"] == output["pos"]);




}


void test_ModelOfferDTO_preDiscountPrice_is_converted_to_json()
{




}


void test_ModelOfferDTO_price_is_converted_to_json()
{




}


void test_ModelOfferDTO_regionId_is_converted_to_json()
{



    bourne::json input =
    {
        "regionId", 1
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["regionId"] == output["regionId"]);

}


void test_ModelOfferDTO_shippingCost_is_converted_to_json()
{




}


void test_ModelOfferDTO_shopName_is_converted_to_json()
{

    bourne::json input =
    {
        "shopName", "hello"
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopName"] == output["shopName"]);



}


void test_ModelOfferDTO_shopRating_is_converted_to_json()
{
    bourne::json input =
    {
        "shopRating", 1
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopRating"] == output["shopRating"]);




}


void test_ModelOfferDTO_inStock_is_converted_to_json()
{
    bourne::json input =
    {
        "inStock", 1
    };

    ModelOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["inStock"] == output["inStock"]);




}



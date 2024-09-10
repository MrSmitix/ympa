
#include "BriefOrderItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BriefOrderItemDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    BriefOrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}



void test_BriefOrderItemDTO_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    BriefOrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}


void test_BriefOrderItemDTO_price_is_assigned_from_json()
{








}


void test_BriefOrderItemDTO_offerName_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerName", "hello"
    };

    BriefOrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferName().c_str());






}


void test_BriefOrderItemDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    BriefOrderItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}




void test_BriefOrderItemDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    BriefOrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}



void test_BriefOrderItemDTO_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    BriefOrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}


void test_BriefOrderItemDTO_price_is_converted_to_json()
{




}


void test_BriefOrderItemDTO_offerName_is_converted_to_json()
{

    bourne::json input =
    {
        "offerName", "hello"
    };

    BriefOrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerName"] == output["offerName"]);



}


void test_BriefOrderItemDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    BriefOrderItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}




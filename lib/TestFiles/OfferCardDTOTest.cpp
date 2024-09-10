
#include "OfferCardDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OfferCardDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    OfferCardDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}





void test_OfferCardDTO_contentRating_is_assigned_from_json()
{
    bourne::json input =
    {
        "contentRating", 1
    };

    OfferCardDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getContentRating());








}






void test_OfferCardDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    OfferCardDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}





void test_OfferCardDTO_contentRating_is_converted_to_json()
{
    bourne::json input =
    {
        "contentRating", 1
    };

    OfferCardDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["contentRating"] == output["contentRating"]);




}






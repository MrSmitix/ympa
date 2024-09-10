
#include "GetCampaignOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetCampaignOfferDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    GetCampaignOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}



void test_GetCampaignOfferDTO_available_is_assigned_from_json()
{




    bourne::json input =
    {
        "available", true
    };

    GetCampaignOfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isAvailable());




}








void test_GetCampaignOfferDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    GetCampaignOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}



void test_GetCampaignOfferDTO_available_is_converted_to_json()
{


    bourne::json input =
    {
        "available", true
    };

    GetCampaignOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["available"] == output["available"]);


}








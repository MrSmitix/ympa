
#include "UpdateCampaignOfferDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateCampaignOfferDTO_offerId_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerId", "hello"
    };

    UpdateCampaignOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferId().c_str());






}



void test_UpdateCampaignOfferDTO_available_is_assigned_from_json()
{




    bourne::json input =
    {
        "available", true
    };

    UpdateCampaignOfferDTO obj(input.dump());

    TEST_ASSERT(true == obj.isAvailable());




}


void test_UpdateCampaignOfferDTO_vat_is_assigned_from_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    UpdateCampaignOfferDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVat());








}



void test_UpdateCampaignOfferDTO_offerId_is_converted_to_json()
{

    bourne::json input =
    {
        "offerId", "hello"
    };

    UpdateCampaignOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerId"] == output["offerId"]);



}



void test_UpdateCampaignOfferDTO_available_is_converted_to_json()
{


    bourne::json input =
    {
        "available", true
    };

    UpdateCampaignOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["available"] == output["available"]);


}


void test_UpdateCampaignOfferDTO_vat_is_converted_to_json()
{
    bourne::json input =
    {
        "vat", 1
    };

    UpdateCampaignOfferDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vat"] == output["vat"]);




}




#include "GetPromoAssortmentInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetPromoAssortmentInfoDTO_activeOffers_is_assigned_from_json()
{
    bourne::json input =
    {
        "activeOffers", 1
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getActiveOffers());








}


void test_GetPromoAssortmentInfoDTO_potentialOffers_is_assigned_from_json()
{
    bourne::json input =
    {
        "potentialOffers", 1
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPotentialOffers());








}


void test_GetPromoAssortmentInfoDTO_processing_is_assigned_from_json()
{




    bourne::json input =
    {
        "processing", true
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    TEST_ASSERT(true == obj.isProcessing());




}



void test_GetPromoAssortmentInfoDTO_activeOffers_is_converted_to_json()
{
    bourne::json input =
    {
        "activeOffers", 1
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["activeOffers"] == output["activeOffers"]);




}


void test_GetPromoAssortmentInfoDTO_potentialOffers_is_converted_to_json()
{
    bourne::json input =
    {
        "potentialOffers", 1
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["potentialOffers"] == output["potentialOffers"]);




}


void test_GetPromoAssortmentInfoDTO_processing_is_converted_to_json()
{


    bourne::json input =
    {
        "processing", true
    };

    GetPromoAssortmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["processing"] == output["processing"]);


}



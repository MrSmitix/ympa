
#include "CampaignSettingsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignSettingsDTO_countryRegion_is_assigned_from_json()
{






    bourne::json input =
    {
        "countryRegion", 1
    };

    CampaignSettingsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCountryRegion());


}


void test_CampaignSettingsDTO_shopName_is_assigned_from_json()
{


    bourne::json input =
    {
        "shopName", "hello"
    };

    CampaignSettingsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShopName().c_str());






}


void test_CampaignSettingsDTO_showInContext_is_assigned_from_json()
{




    bourne::json input =
    {
        "showInContext", true
    };

    CampaignSettingsDTO obj(input.dump());

    TEST_ASSERT(true == obj.isShowInContext());




}


void test_CampaignSettingsDTO_showInPremium_is_assigned_from_json()
{




    bourne::json input =
    {
        "showInPremium", true
    };

    CampaignSettingsDTO obj(input.dump());

    TEST_ASSERT(true == obj.isShowInPremium());




}


void test_CampaignSettingsDTO_useOpenStat_is_assigned_from_json()
{




    bourne::json input =
    {
        "useOpenStat", true
    };

    CampaignSettingsDTO obj(input.dump());

    TEST_ASSERT(true == obj.isUseOpenStat());




}




void test_CampaignSettingsDTO_countryRegion_is_converted_to_json()
{



    bourne::json input =
    {
        "countryRegion", 1
    };

    CampaignSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["countryRegion"] == output["countryRegion"]);

}


void test_CampaignSettingsDTO_shopName_is_converted_to_json()
{

    bourne::json input =
    {
        "shopName", "hello"
    };

    CampaignSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shopName"] == output["shopName"]);



}


void test_CampaignSettingsDTO_showInContext_is_converted_to_json()
{


    bourne::json input =
    {
        "showInContext", true
    };

    CampaignSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["showInContext"] == output["showInContext"]);


}


void test_CampaignSettingsDTO_showInPremium_is_converted_to_json()
{


    bourne::json input =
    {
        "showInPremium", true
    };

    CampaignSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["showInPremium"] == output["showInPremium"]);


}


void test_CampaignSettingsDTO_useOpenStat_is_converted_to_json()
{


    bourne::json input =
    {
        "useOpenStat", true
    };

    CampaignSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["useOpenStat"] == output["useOpenStat"]);


}




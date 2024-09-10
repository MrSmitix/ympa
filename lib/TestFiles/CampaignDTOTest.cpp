
#include "CampaignDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignDTO_domain_is_assigned_from_json()
{


    bourne::json input =
    {
        "domain", "hello"
    };

    CampaignDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDomain().c_str());






}


void test_CampaignDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    CampaignDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_CampaignDTO_clientId_is_assigned_from_json()
{






    bourne::json input =
    {
        "clientId", 1
    };

    CampaignDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getClientId());


}





void test_CampaignDTO_domain_is_converted_to_json()
{

    bourne::json input =
    {
        "domain", "hello"
    };

    CampaignDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["domain"] == output["domain"]);



}


void test_CampaignDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    CampaignDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_CampaignDTO_clientId_is_converted_to_json()
{



    bourne::json input =
    {
        "clientId", 1
    };

    CampaignDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["clientId"] == output["clientId"]);

}





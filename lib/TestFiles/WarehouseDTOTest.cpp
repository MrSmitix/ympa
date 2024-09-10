
#include "WarehouseDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_WarehouseDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    WarehouseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_WarehouseDTO_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    WarehouseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_WarehouseDTO_campaignId_is_assigned_from_json()
{






    bourne::json input =
    {
        "campaignId", 1
    };

    WarehouseDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCampaignId());


}


void test_WarehouseDTO_express_is_assigned_from_json()
{




    bourne::json input =
    {
        "express", true
    };

    WarehouseDTO obj(input.dump());

    TEST_ASSERT(true == obj.isExpress());




}




void test_WarehouseDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    WarehouseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_WarehouseDTO_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    WarehouseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_WarehouseDTO_campaignId_is_converted_to_json()
{



    bourne::json input =
    {
        "campaignId", 1
    };

    WarehouseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaignId"] == output["campaignId"]);

}


void test_WarehouseDTO_express_is_converted_to_json()
{


    bourne::json input =
    {
        "express", true
    };

    WarehouseDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["express"] == output["express"]);


}




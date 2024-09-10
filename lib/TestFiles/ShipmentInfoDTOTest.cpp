
#include "ShipmentInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ShipmentInfoDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_ShipmentInfoDTO_planIntervalFrom_is_assigned_from_json()
{








}


void test_ShipmentInfoDTO_planIntervalTo_is_assigned_from_json()
{








}





void test_ShipmentInfoDTO_externalId_is_assigned_from_json()
{


    bourne::json input =
    {
        "externalId", "hello"
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalId().c_str());






}





void test_ShipmentInfoDTO_draftCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "draftCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDraftCount());








}


void test_ShipmentInfoDTO_plannedCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "plannedCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPlannedCount());








}


void test_ShipmentInfoDTO_factCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "factCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFactCount());








}



void test_ShipmentInfoDTO_statusDescription_is_assigned_from_json()
{


    bourne::json input =
    {
        "statusDescription", "hello"
    };

    ShipmentInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatusDescription().c_str());






}


void test_ShipmentInfoDTO_statusUpdateTime_is_assigned_from_json()
{








}



void test_ShipmentInfoDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_ShipmentInfoDTO_planIntervalFrom_is_converted_to_json()
{




}


void test_ShipmentInfoDTO_planIntervalTo_is_converted_to_json()
{




}





void test_ShipmentInfoDTO_externalId_is_converted_to_json()
{

    bourne::json input =
    {
        "externalId", "hello"
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["externalId"] == output["externalId"]);



}





void test_ShipmentInfoDTO_draftCount_is_converted_to_json()
{
    bourne::json input =
    {
        "draftCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["draftCount"] == output["draftCount"]);




}


void test_ShipmentInfoDTO_plannedCount_is_converted_to_json()
{
    bourne::json input =
    {
        "plannedCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["plannedCount"] == output["plannedCount"]);




}


void test_ShipmentInfoDTO_factCount_is_converted_to_json()
{
    bourne::json input =
    {
        "factCount", 1
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["factCount"] == output["factCount"]);




}



void test_ShipmentInfoDTO_statusDescription_is_converted_to_json()
{

    bourne::json input =
    {
        "statusDescription", "hello"
    };

    ShipmentInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["statusDescription"] == output["statusDescription"]);



}


void test_ShipmentInfoDTO_statusUpdateTime_is_converted_to_json()
{




}



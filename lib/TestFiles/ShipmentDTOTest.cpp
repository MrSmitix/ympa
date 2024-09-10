
#include "ShipmentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ShipmentDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    ShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_ShipmentDTO_planIntervalFrom_is_assigned_from_json()
{








}


void test_ShipmentDTO_planIntervalTo_is_assigned_from_json()
{








}





void test_ShipmentDTO_externalId_is_assigned_from_json()
{


    bourne::json input =
    {
        "externalId", "hello"
    };

    ShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalId().c_str());






}





void test_ShipmentDTO_draftCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "draftCount", 1
    };

    ShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDraftCount());








}


void test_ShipmentDTO_plannedCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "plannedCount", 1
    };

    ShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPlannedCount());








}


void test_ShipmentDTO_factCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "factCount", 1
    };

    ShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFactCount());








}





void test_ShipmentDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    ShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_ShipmentDTO_planIntervalFrom_is_converted_to_json()
{




}


void test_ShipmentDTO_planIntervalTo_is_converted_to_json()
{




}





void test_ShipmentDTO_externalId_is_converted_to_json()
{

    bourne::json input =
    {
        "externalId", "hello"
    };

    ShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["externalId"] == output["externalId"]);



}





void test_ShipmentDTO_draftCount_is_converted_to_json()
{
    bourne::json input =
    {
        "draftCount", 1
    };

    ShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["draftCount"] == output["draftCount"]);




}


void test_ShipmentDTO_plannedCount_is_converted_to_json()
{
    bourne::json input =
    {
        "plannedCount", 1
    };

    ShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["plannedCount"] == output["plannedCount"]);




}


void test_ShipmentDTO_factCount_is_converted_to_json()
{
    bourne::json input =
    {
        "factCount", 1
    };

    ShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["factCount"] == output["factCount"]);




}





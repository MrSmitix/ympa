
#include "OrderShipmentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderShipmentDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OrderShipmentDTO_shipmentDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "shipmentDate", "hello"
    };

    OrderShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShipmentDate().c_str());






}


void test_OrderShipmentDTO_shipmentTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "shipmentTime", "hello"
    };

    OrderShipmentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShipmentTime().c_str());






}





void test_OrderShipmentDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OrderShipmentDTO_shipmentDate_is_converted_to_json()
{

    bourne::json input =
    {
        "shipmentDate", "hello"
    };

    OrderShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shipmentDate"] == output["shipmentDate"]);



}


void test_OrderShipmentDTO_shipmentTime_is_converted_to_json()
{

    bourne::json input =
    {
        "shipmentTime", "hello"
    };

    OrderShipmentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shipmentTime"] == output["shipmentTime"]);



}





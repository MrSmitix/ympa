
#include "OrderDigitalItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderDigitalItemDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderDigitalItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OrderDigitalItemDTO_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    OrderDigitalItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_OrderDigitalItemDTO_slip_is_assigned_from_json()
{


    bourne::json input =
    {
        "slip", "hello"
    };

    OrderDigitalItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSlip().c_str());






}




void test_OrderDigitalItemDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderDigitalItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OrderDigitalItemDTO_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    OrderDigitalItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_OrderDigitalItemDTO_slip_is_converted_to_json()
{

    bourne::json input =
    {
        "slip", "hello"
    };

    OrderDigitalItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["slip"] == output["slip"]);



}





#include "OrderCourierDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderCourierDTO_fullName_is_assigned_from_json()
{


    bourne::json input =
    {
        "fullName", "hello"
    };

    OrderCourierDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFullName().c_str());






}


void test_OrderCourierDTO_phone_is_assigned_from_json()
{


    bourne::json input =
    {
        "phone", "hello"
    };

    OrderCourierDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPhone().c_str());






}


void test_OrderCourierDTO_phoneExtension_is_assigned_from_json()
{


    bourne::json input =
    {
        "phoneExtension", "hello"
    };

    OrderCourierDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPhoneExtension().c_str());






}


void test_OrderCourierDTO_vehicleNumber_is_assigned_from_json()
{


    bourne::json input =
    {
        "vehicleNumber", "hello"
    };

    OrderCourierDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVehicleNumber().c_str());






}


void test_OrderCourierDTO_vehicleDescription_is_assigned_from_json()
{


    bourne::json input =
    {
        "vehicleDescription", "hello"
    };

    OrderCourierDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVehicleDescription().c_str());






}



void test_OrderCourierDTO_fullName_is_converted_to_json()
{

    bourne::json input =
    {
        "fullName", "hello"
    };

    OrderCourierDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fullName"] == output["fullName"]);



}


void test_OrderCourierDTO_phone_is_converted_to_json()
{

    bourne::json input =
    {
        "phone", "hello"
    };

    OrderCourierDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["phone"] == output["phone"]);



}


void test_OrderCourierDTO_phoneExtension_is_converted_to_json()
{

    bourne::json input =
    {
        "phoneExtension", "hello"
    };

    OrderCourierDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["phoneExtension"] == output["phoneExtension"]);



}


void test_OrderCourierDTO_vehicleNumber_is_converted_to_json()
{

    bourne::json input =
    {
        "vehicleNumber", "hello"
    };

    OrderCourierDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vehicleNumber"] == output["vehicleNumber"]);



}


void test_OrderCourierDTO_vehicleDescription_is_converted_to_json()
{

    bourne::json input =
    {
        "vehicleDescription", "hello"
    };

    OrderCourierDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vehicleDescription"] == output["vehicleDescription"]);



}



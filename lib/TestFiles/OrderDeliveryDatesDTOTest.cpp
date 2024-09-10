
#include "OrderDeliveryDatesDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderDeliveryDatesDTO_fromDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "fromDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFromDate().c_str());






}


void test_OrderDeliveryDatesDTO_toDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "toDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToDate().c_str());






}


void test_OrderDeliveryDatesDTO_fromTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "fromTime", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFromTime().c_str());






}


void test_OrderDeliveryDatesDTO_toTime_is_assigned_from_json()
{


    bourne::json input =
    {
        "toTime", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToTime().c_str());






}


void test_OrderDeliveryDatesDTO_realDeliveryDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "realDeliveryDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRealDeliveryDate().c_str());






}



void test_OrderDeliveryDatesDTO_fromDate_is_converted_to_json()
{

    bourne::json input =
    {
        "fromDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fromDate"] == output["fromDate"]);



}


void test_OrderDeliveryDatesDTO_toDate_is_converted_to_json()
{

    bourne::json input =
    {
        "toDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["toDate"] == output["toDate"]);



}


void test_OrderDeliveryDatesDTO_fromTime_is_converted_to_json()
{

    bourne::json input =
    {
        "fromTime", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fromTime"] == output["fromTime"]);



}


void test_OrderDeliveryDatesDTO_toTime_is_converted_to_json()
{

    bourne::json input =
    {
        "toTime", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["toTime"] == output["toTime"]);



}


void test_OrderDeliveryDatesDTO_realDeliveryDate_is_converted_to_json()
{

    bourne::json input =
    {
        "realDeliveryDate", "hello"
    };

    OrderDeliveryDatesDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["realDeliveryDate"] == output["realDeliveryDate"]);



}



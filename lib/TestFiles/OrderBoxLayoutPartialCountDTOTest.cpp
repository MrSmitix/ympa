
#include "OrderBoxLayoutPartialCountDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderBoxLayoutPartialCountDTO_current_is_assigned_from_json()
{
    bourne::json input =
    {
        "current", 1
    };

    OrderBoxLayoutPartialCountDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCurrent());








}


void test_OrderBoxLayoutPartialCountDTO_total_is_assigned_from_json()
{
    bourne::json input =
    {
        "total", 1
    };

    OrderBoxLayoutPartialCountDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotal());








}



void test_OrderBoxLayoutPartialCountDTO_current_is_converted_to_json()
{
    bourne::json input =
    {
        "current", 1
    };

    OrderBoxLayoutPartialCountDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["current"] == output["current"]);




}


void test_OrderBoxLayoutPartialCountDTO_total_is_converted_to_json()
{
    bourne::json input =
    {
        "total", 1
    };

    OrderBoxLayoutPartialCountDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total"] == output["total"]);




}



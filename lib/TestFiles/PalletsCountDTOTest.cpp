
#include "PalletsCountDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PalletsCountDTO_planned_is_assigned_from_json()
{
    bourne::json input =
    {
        "planned", 1
    };

    PalletsCountDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPlanned());








}


void test_PalletsCountDTO_fact_is_assigned_from_json()
{
    bourne::json input =
    {
        "fact", 1
    };

    PalletsCountDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFact());








}



void test_PalletsCountDTO_planned_is_converted_to_json()
{
    bourne::json input =
    {
        "planned", 1
    };

    PalletsCountDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["planned"] == output["planned"]);




}


void test_PalletsCountDTO_fact_is_converted_to_json()
{
    bourne::json input =
    {
        "fact", 1
    };

    PalletsCountDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fact"] == output["fact"]);




}



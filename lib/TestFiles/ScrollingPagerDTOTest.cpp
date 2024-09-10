
#include "ScrollingPagerDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ScrollingPagerDTO_nextPageToken_is_assigned_from_json()
{


    bourne::json input =
    {
        "nextPageToken", "hello"
    };

    ScrollingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNextPageToken().c_str());






}


void test_ScrollingPagerDTO_prevPageToken_is_assigned_from_json()
{


    bourne::json input =
    {
        "prevPageToken", "hello"
    };

    ScrollingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrevPageToken().c_str());






}



void test_ScrollingPagerDTO_nextPageToken_is_converted_to_json()
{

    bourne::json input =
    {
        "nextPageToken", "hello"
    };

    ScrollingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["nextPageToken"] == output["nextPageToken"]);



}


void test_ScrollingPagerDTO_prevPageToken_is_converted_to_json()
{

    bourne::json input =
    {
        "prevPageToken", "hello"
    };

    ScrollingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prevPageToken"] == output["prevPageToken"]);



}



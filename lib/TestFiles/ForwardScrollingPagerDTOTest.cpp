
#include "ForwardScrollingPagerDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ForwardScrollingPagerDTO_nextPageToken_is_assigned_from_json()
{


    bourne::json input =
    {
        "nextPageToken", "hello"
    };

    ForwardScrollingPagerDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNextPageToken().c_str());






}



void test_ForwardScrollingPagerDTO_nextPageToken_is_converted_to_json()
{

    bourne::json input =
    {
        "nextPageToken", "hello"
    };

    ForwardScrollingPagerDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["nextPageToken"] == output["nextPageToken"]);



}




#include "DocumentDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_DocumentDTO_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "number", "hello"
    };

    DocumentDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNumber().c_str());






}





void test_DocumentDTO_number_is_converted_to_json()
{

    bourne::json input =
    {
        "number", "hello"
    };

    DocumentDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number"] == output["number"]);



}




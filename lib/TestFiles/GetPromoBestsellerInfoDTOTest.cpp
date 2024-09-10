
#include "GetPromoBestsellerInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetPromoBestsellerInfoDTO_bestseller_is_assigned_from_json()
{




    bourne::json input =
    {
        "bestseller", true
    };

    GetPromoBestsellerInfoDTO obj(input.dump());

    TEST_ASSERT(true == obj.isBestseller());




}


void test_GetPromoBestsellerInfoDTO_entryDeadline_is_assigned_from_json()
{








}



void test_GetPromoBestsellerInfoDTO_bestseller_is_converted_to_json()
{


    bourne::json input =
    {
        "bestseller", true
    };

    GetPromoBestsellerInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bestseller"] == output["bestseller"]);


}


void test_GetPromoBestsellerInfoDTO_entryDeadline_is_converted_to_json()
{




}



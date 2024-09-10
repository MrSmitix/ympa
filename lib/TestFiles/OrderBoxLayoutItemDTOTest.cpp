
#include "OrderBoxLayoutItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderBoxLayoutItemDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderBoxLayoutItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OrderBoxLayoutItemDTO_fullCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "fullCount", 1
    };

    OrderBoxLayoutItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFullCount());








}





void test_OrderBoxLayoutItemDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderBoxLayoutItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OrderBoxLayoutItemDTO_fullCount_is_converted_to_json()
{
    bourne::json input =
    {
        "fullCount", 1
    };

    OrderBoxLayoutItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fullCount"] == output["fullCount"]);




}





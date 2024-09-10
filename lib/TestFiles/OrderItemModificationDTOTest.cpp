
#include "OrderItemModificationDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderItemModificationDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderItemModificationDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_OrderItemModificationDTO_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrderItemModificationDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}




void test_OrderItemModificationDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderItemModificationDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_OrderItemModificationDTO_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    OrderItemModificationDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}




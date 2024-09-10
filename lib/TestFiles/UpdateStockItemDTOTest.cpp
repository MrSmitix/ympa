
#include "UpdateStockItemDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateStockItemDTO_count_is_assigned_from_json()
{






    bourne::json input =
    {
        "count", 1
    };

    UpdateStockItemDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());


}


void test_UpdateStockItemDTO_updatedAt_is_assigned_from_json()
{








}



void test_UpdateStockItemDTO_count_is_converted_to_json()
{



    bourne::json input =
    {
        "count", 1
    };

    UpdateStockItemDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);

}


void test_UpdateStockItemDTO_updatedAt_is_converted_to_json()
{




}



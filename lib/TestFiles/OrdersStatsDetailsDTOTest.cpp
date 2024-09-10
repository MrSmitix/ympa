
#include "OrdersStatsDetailsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OrdersStatsDetailsDTO_itemCount_is_assigned_from_json()
{






    bourne::json input =
    {
        "itemCount", 1
    };

    OrdersStatsDetailsDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getItemCount());


}






void test_OrdersStatsDetailsDTO_itemCount_is_converted_to_json()
{



    bourne::json input =
    {
        "itemCount", 1
    };

    OrdersStatsDetailsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["itemCount"] == output["itemCount"]);

}





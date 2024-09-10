
#include "GoodsFeedbackIdentifiersDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GoodsFeedbackIdentifiersDTO_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    GoodsFeedbackIdentifiersDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}


void test_GoodsFeedbackIdentifiersDTO_modelId_is_assigned_from_json()
{






    bourne::json input =
    {
        "modelId", 1
    };

    GoodsFeedbackIdentifiersDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getModelId());


}



void test_GoodsFeedbackIdentifiersDTO_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    GoodsFeedbackIdentifiersDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}


void test_GoodsFeedbackIdentifiersDTO_modelId_is_converted_to_json()
{



    bourne::json input =
    {
        "modelId", 1
    };

    GoodsFeedbackIdentifiersDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["modelId"] == output["modelId"]);

}



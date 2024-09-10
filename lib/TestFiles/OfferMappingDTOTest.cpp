
#include "OfferMappingDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OfferMappingDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    OfferMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}


void test_OfferMappingDTO_modelId_is_assigned_from_json()
{






    bourne::json input =
    {
        "modelId", 1
    };

    OfferMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getModelId());


}


void test_OfferMappingDTO_categoryId_is_assigned_from_json()
{






    bourne::json input =
    {
        "categoryId", 1
    };

    OfferMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCategoryId());


}



void test_OfferMappingDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    OfferMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


void test_OfferMappingDTO_modelId_is_converted_to_json()
{



    bourne::json input =
    {
        "modelId", 1
    };

    OfferMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["modelId"] == output["modelId"]);

}


void test_OfferMappingDTO_categoryId_is_converted_to_json()
{



    bourne::json input =
    {
        "categoryId", 1
    };

    OfferMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["categoryId"] == output["categoryId"]);

}




#include "UpdateOfferMappingsRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_UpdateOfferMappingsRequest_onlyPartnerMediaContent_is_assigned_from_json()
{




    bourne::json input =
    {
        "onlyPartnerMediaContent", true
    };

    UpdateOfferMappingsRequest obj(input.dump());

    TEST_ASSERT(true == obj.isOnlyPartnerMediaContent());




}




void test_UpdateOfferMappingsRequest_onlyPartnerMediaContent_is_converted_to_json()
{


    bourne::json input =
    {
        "onlyPartnerMediaContent", true
    };

    UpdateOfferMappingsRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["onlyPartnerMediaContent"] == output["onlyPartnerMediaContent"]);


}



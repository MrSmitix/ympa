
#include "QualityRatingDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_QualityRatingDTO_rating_is_assigned_from_json()
{






    bourne::json input =
    {
        "rating", 1
    };

    QualityRatingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRating());


}





void test_QualityRatingDTO_rating_is_converted_to_json()
{



    bourne::json input =
    {
        "rating", 1
    };

    QualityRatingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rating"] == output["rating"]);

}





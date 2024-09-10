-module(ympa_erlang_proper_client_model_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_model_offer_dto/0]).

-export([ympa_erlang_proper_client_model_offer_dto/1]).

-export_type([ympa_erlang_proper_client_model_offer_dto/0]).

-type ympa_erlang_proper_client_model_offer_dto() ::
  [ {'discount', integer() }
  | {'name', binary() }
  | {'pos', integer() }
  | {'preDiscountPrice', integer() }
  | {'price', integer() }
  | {'regionId', integer() }
  | {'shippingCost', integer() }
  | {'shopName', binary() }
  | {'shopRating', integer() }
  | {'inStock', integer() }
  ].


ympa_erlang_proper_client_model_offer_dto() ->
    ympa_erlang_proper_client_model_offer_dto([]).

ympa_erlang_proper_client_model_offer_dto(Fields) ->
  Default = [ {'discount', integer() }
            , {'name', binary() }
            , {'pos', integer() }
            , {'preDiscountPrice', integer() }
            , {'price', integer() }
            , {'regionId', integer() }
            , {'shippingCost', integer() }
            , {'shopName', binary() }
            , {'shopRating', integer() }
            , {'inStock', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


-module(ympa_erlang_proper_client_order_item_promo_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_promo_dto/0]).

-export([ympa_erlang_proper_client_order_item_promo_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_promo_dto/0]).

-type ympa_erlang_proper_client_order_item_promo_dto() ::
  [ {'type', ympa_erlang_proper_client_order_promo_type:ympa_erlang_proper_client_order_promo_type() }
  | {'discount', integer() }
  | {'subsidy', integer() }
  | {'shopPromoId', binary() }
  | {'marketPromoId', binary() }
  ].


ympa_erlang_proper_client_order_item_promo_dto() ->
    ympa_erlang_proper_client_order_item_promo_dto([]).

ympa_erlang_proper_client_order_item_promo_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_order_promo_type:ympa_erlang_proper_client_order_promo_type() }
            , {'discount', integer() }
            , {'subsidy', integer() }
            , {'shopPromoId', binary() }
            , {'marketPromoId', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


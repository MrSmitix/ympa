-module(ympa_erlang_proper_client_calculate_tariffs_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_offer_dto/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_offer_dto/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_offer_dto/0]).

-type ympa_erlang_proper_client_calculate_tariffs_offer_dto() ::
  [ {'categoryId', integer() }
  | {'price', integer() }
  | {'length', integer() }
  | {'width', integer() }
  | {'height', integer() }
  | {'weight', integer() }
  | {'quantity', integer() }
  ].


ympa_erlang_proper_client_calculate_tariffs_offer_dto() ->
    ympa_erlang_proper_client_calculate_tariffs_offer_dto([]).

ympa_erlang_proper_client_calculate_tariffs_offer_dto(Fields) ->
  Default = [ {'categoryId', integer(0) }
            , {'price', integer() }
            , {'length', integer() }
            , {'width', integer() }
            , {'height', integer() }
            , {'weight', integer() }
            , {'quantity', integer(1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


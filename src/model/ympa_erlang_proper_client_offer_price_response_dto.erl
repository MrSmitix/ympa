-module(ympa_erlang_proper_client_offer_price_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_price_response_dto/0]).

-export([ympa_erlang_proper_client_offer_price_response_dto/1]).

-export_type([ympa_erlang_proper_client_offer_price_response_dto/0]).

-type ympa_erlang_proper_client_offer_price_response_dto() ::
  [ {'id', binary() }
  | {'price', ympa_erlang_proper_client_price_dto:ympa_erlang_proper_client_price_dto() }
  | {'marketSku', integer() }
  | {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_offer_price_response_dto() ->
    ympa_erlang_proper_client_offer_price_response_dto([]).

ympa_erlang_proper_client_offer_price_response_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'price', ympa_erlang_proper_client_price_dto:ympa_erlang_proper_client_price_dto() }
            , {'marketSku', integer() }
            , {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


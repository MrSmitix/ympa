-module(ympa_erlang_proper_client_get_all_offers_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_all_offers_response/0]).

-export([ympa_erlang_proper_client_get_all_offers_response/1]).

-export_type([ympa_erlang_proper_client_get_all_offers_response/0]).

-type ympa_erlang_proper_client_get_all_offers_response() ::
  [ {'offers', list(ympa_erlang_proper_client_offer_dto:ympa_erlang_proper_client_offer_dto()) }
  ].


ympa_erlang_proper_client_get_all_offers_response() ->
    ympa_erlang_proper_client_get_all_offers_response([]).

ympa_erlang_proper_client_get_all_offers_response(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_offer_dto:ympa_erlang_proper_client_offer_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


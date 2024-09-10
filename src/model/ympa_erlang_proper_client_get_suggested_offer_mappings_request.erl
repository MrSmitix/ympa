-module(ympa_erlang_proper_client_get_suggested_offer_mappings_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_suggested_offer_mappings_request/0]).

-export([ympa_erlang_proper_client_get_suggested_offer_mappings_request/1]).

-export_type([ympa_erlang_proper_client_get_suggested_offer_mappings_request/0]).

-type ympa_erlang_proper_client_get_suggested_offer_mappings_request() ::
  [ {'offers', list(ympa_erlang_proper_client_suggested_offer_dto:ympa_erlang_proper_client_suggested_offer_dto()) }
  ].


ympa_erlang_proper_client_get_suggested_offer_mappings_request() ->
    ympa_erlang_proper_client_get_suggested_offer_mappings_request([]).

ympa_erlang_proper_client_get_suggested_offer_mappings_request(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_suggested_offer_dto:ympa_erlang_proper_client_suggested_offer_dto(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


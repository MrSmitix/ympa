-module(ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request/0]).

-export([ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request/1]).

-export_type([ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request/0]).

-type ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request() ::
  [ {'offers', list(ympa_erlang_proper_client_mappings_offer_dto:ympa_erlang_proper_client_mappings_offer_dto()) }
  ].


ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request() ->
    ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request([]).

ympa_erlang_proper_client_get_suggested_offer_mapping_entries_request(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_mappings_offer_dto:ympa_erlang_proper_client_mappings_offer_dto(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

